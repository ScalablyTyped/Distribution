package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /** Add a path to the project's list of root paths. */
  def addPath(projectPath: String): Unit = js.native
  /**
    *  Determines whether the given path (real or symbolic) is inside the
    *  project's directory.
    */
  def contains(pathToCheck: String): Boolean = js.native
  /** Get an Array of Directorys associated with this project. */
  def getDirectories(): js.Array[Directory] = js.native
  // Managing Paths
  /** Get an Array of strings containing the paths of the project's directories. */
  def getPaths(): js.Array[String] = js.native
  // Accessing the Git Repository
  /**
    * Get an Array of GitRepositorys associated with the project's directories.
    *
    * This method will be removed in 2.0 because it does synchronous I/O.
    */
  def getRepositories(): js.Array[GitRepository] = js.native
  /**
    *  Access a promise that resolves when the filesystem watcher associated with a
    *  project root directory is ready to begin receiving events.
    */
  def getWatcherPromise(projectPath: String): js.Promise[PathWatcher] = js.native
  /**
    *  Invoke the given callback with all current and future text buffers in
    *  the project.
    */
  def observeBuffers(callback: js.Function1[/* buffer */ TextBuffer, Unit]): Disposable = js.native
  /** Invoke the given callback with all current and future repositories in the project. */
  def observeRepositories(callback: js.Function1[/* repository */ GitRepository, Unit]): Disposable = js.native
  /** Invoke the given callback when a text buffer is added to the project. */
  def onDidAddBuffer(callback: js.Function1[/* buffer */ TextBuffer, Unit]): Disposable = js.native
  /** Invoke the given callback when a repository is added to the project. */
  def onDidAddRepository(callback: js.Function1[/* repository */ GitRepository, Unit]): Disposable = js.native
  /** Invoke a callback when a filesystem change occurs within any open project path. */
  def onDidChangeFiles(callback: js.Function1[/* events */ FilesystemChangeEvent, Unit]): Disposable = js.native
  // Event Subscription
  /** Invoke the given callback when the project paths change. */
  def onDidChangePaths(callback: js.Function1[/* projectPaths */ js.Array[String], Unit]): Disposable = js.native
  /** Invoke a callback whenever the project's configuration has been replaced. */
  def onDidReplace(callback: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit]): Disposable = js.native
  /** Get the relative path from the project directory to the given path. */
  def relativize(fullPath: String): String = js.native
  /**
    *  Get the path to the project directory that contains the given path, and
    *  the relative path from that project directory to the given path.
    */
  def relativizePath(fullPath: String): js.Tuple2[String | Null, String] = js.native
  /** Remove a path from the project's list of root paths. */
  def removePath(projectPath: String): Unit = js.native
  /** Get the repository for a given directory asynchronously. */
  def repositoryForDirectory(directory: Directory): js.Promise[GitRepository | Null] = js.native
  /** Set the paths of the project's directories. */
  def setPaths(projectPaths: js.Array[String]): Unit = js.native
}

object Project {
  @scala.inline
  def apply(
    addPath: String => Unit,
    contains: String => Boolean,
    getDirectories: () => js.Array[Directory],
    getPaths: () => js.Array[String],
    getRepositories: () => js.Array[GitRepository],
    getWatcherPromise: String => js.Promise[PathWatcher],
    observeBuffers: js.Function1[/* buffer */ TextBuffer, Unit] => Disposable,
    observeRepositories: js.Function1[/* repository */ GitRepository, Unit] => Disposable,
    onDidAddBuffer: js.Function1[/* buffer */ TextBuffer, Unit] => Disposable,
    onDidAddRepository: js.Function1[/* repository */ GitRepository, Unit] => Disposable,
    onDidChangeFiles: js.Function1[/* events */ FilesystemChangeEvent, Unit] => Disposable,
    onDidChangePaths: js.Function1[/* projectPaths */ js.Array[String], Unit] => Disposable,
    onDidReplace: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit] => Disposable,
    relativize: String => String,
    relativizePath: String => js.Tuple2[String | Null, String],
    removePath: String => Unit,
    repositoryForDirectory: Directory => js.Promise[GitRepository | Null],
    setPaths: js.Array[String] => Unit
  ): Project = {
    val __obj = js.Dynamic.literal(addPath = js.Any.fromFunction1(addPath), contains = js.Any.fromFunction1(contains), getDirectories = js.Any.fromFunction0(getDirectories), getPaths = js.Any.fromFunction0(getPaths), getRepositories = js.Any.fromFunction0(getRepositories), getWatcherPromise = js.Any.fromFunction1(getWatcherPromise), observeBuffers = js.Any.fromFunction1(observeBuffers), observeRepositories = js.Any.fromFunction1(observeRepositories), onDidAddBuffer = js.Any.fromFunction1(onDidAddBuffer), onDidAddRepository = js.Any.fromFunction1(onDidAddRepository), onDidChangeFiles = js.Any.fromFunction1(onDidChangeFiles), onDidChangePaths = js.Any.fromFunction1(onDidChangePaths), onDidReplace = js.Any.fromFunction1(onDidReplace), relativize = js.Any.fromFunction1(relativize), relativizePath = js.Any.fromFunction1(relativizePath), removePath = js.Any.fromFunction1(removePath), repositoryForDirectory = js.Any.fromFunction1(repositoryForDirectory), setPaths = js.Any.fromFunction1(setPaths))
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddPath(value: String => Unit): Self = this.set("addPath", js.Any.fromFunction1(value))
    @scala.inline
    def setContains(value: String => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDirectories(value: () => js.Array[Directory]): Self = this.set("getDirectories", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPaths(value: () => js.Array[String]): Self = this.set("getPaths", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRepositories(value: () => js.Array[GitRepository]): Self = this.set("getRepositories", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWatcherPromise(value: String => js.Promise[PathWatcher]): Self = this.set("getWatcherPromise", js.Any.fromFunction1(value))
    @scala.inline
    def setObserveBuffers(value: js.Function1[/* buffer */ TextBuffer, Unit] => Disposable): Self = this.set("observeBuffers", js.Any.fromFunction1(value))
    @scala.inline
    def setObserveRepositories(value: js.Function1[/* repository */ GitRepository, Unit] => Disposable): Self = this.set("observeRepositories", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidAddBuffer(value: js.Function1[/* buffer */ TextBuffer, Unit] => Disposable): Self = this.set("onDidAddBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidAddRepository(value: js.Function1[/* repository */ GitRepository, Unit] => Disposable): Self = this.set("onDidAddRepository", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidChangeFiles(value: js.Function1[/* events */ FilesystemChangeEvent, Unit] => Disposable): Self = this.set("onDidChangeFiles", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidChangePaths(value: js.Function1[/* projectPaths */ js.Array[String], Unit] => Disposable): Self = this.set("onDidChangePaths", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidReplace(value: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit] => Disposable): Self = this.set("onDidReplace", js.Any.fromFunction1(value))
    @scala.inline
    def setRelativize(value: String => String): Self = this.set("relativize", js.Any.fromFunction1(value))
    @scala.inline
    def setRelativizePath(value: String => js.Tuple2[String | Null, String]): Self = this.set("relativizePath", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePath(value: String => Unit): Self = this.set("removePath", js.Any.fromFunction1(value))
    @scala.inline
    def setRepositoryForDirectory(value: Directory => js.Promise[GitRepository | Null]): Self = this.set("repositoryForDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPaths(value: js.Array[String] => Unit): Self = this.set("setPaths", js.Any.fromFunction1(value))
  }
  
}

