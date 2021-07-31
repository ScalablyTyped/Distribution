package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  /** Add a path to the project's list of root paths. */
  def addPath(projectPath: String): Unit
  
  /**
    *  Determines whether the given path (real or symbolic) is inside the
    *  project's directory.
    */
  def contains(pathToCheck: String): Boolean
  
  /** Get an Array of Directorys associated with this project. */
  def getDirectories(): js.Array[Directory]
  
  // Managing Paths
  /** Get an Array of strings containing the paths of the project's directories. */
  def getPaths(): js.Array[String]
  
  // Accessing the Git Repository
  /**
    * Get an Array of GitRepositorys associated with the project's directories.
    *
    * This method will be removed in 2.0 because it does synchronous I/O.
    */
  def getRepositories(): js.Array[GitRepository]
  
  /**
    *  Access a promise that resolves when the filesystem watcher associated with a
    *  project root directory is ready to begin receiving events.
    */
  def getWatcherPromise(projectPath: String): js.Promise[PathWatcher]
  
  /**
    *  Invoke the given callback with all current and future text buffers in
    *  the project.
    */
  def observeBuffers(callback: js.Function1[/* buffer */ TextBuffer, Unit]): Disposable
  
  /** Invoke the given callback with all current and future repositories in the project. */
  def observeRepositories(callback: js.Function1[/* repository */ GitRepository, Unit]): Disposable
  
  /** Invoke the given callback when a text buffer is added to the project. */
  def onDidAddBuffer(callback: js.Function1[/* buffer */ TextBuffer, Unit]): Disposable
  
  /** Invoke the given callback when a repository is added to the project. */
  def onDidAddRepository(callback: js.Function1[/* repository */ GitRepository, Unit]): Disposable
  
  /** Invoke a callback when a filesystem change occurs within any open project path. */
  def onDidChangeFiles(callback: js.Function1[/* events */ FilesystemChangeEvent, Unit]): Disposable
  
  // Event Subscription
  /** Invoke the given callback when the project paths change. */
  def onDidChangePaths(callback: js.Function1[/* projectPaths */ js.Array[String], Unit]): Disposable
  
  /** Invoke a callback whenever the project's configuration has been replaced. */
  def onDidReplace(callback: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit]): Disposable
  
  /** Get the relative path from the project directory to the given path. */
  def relativize(fullPath: String): String
  
  /**
    *  Get the path to the project directory that contains the given path, and
    *  the relative path from that project directory to the given path.
    */
  def relativizePath(fullPath: String): js.Tuple2[String | Null, String]
  
  /** Remove a path from the project's list of root paths. */
  def removePath(projectPath: String): Unit
  
  /** Get the repository for a given directory asynchronously. */
  def repositoryForDirectory(directory: Directory): js.Promise[GitRepository | Null]
  
  /** Set the paths of the project's directories. */
  def setPaths(projectPaths: js.Array[String]): Unit
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
  implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPath(value: String => Unit): Self = StObject.set(x, "addPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDirectories(value: () => js.Array[Directory]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPaths(value: () => js.Array[String]): Self = StObject.set(x, "getPaths", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRepositories(value: () => js.Array[GitRepository]): Self = StObject.set(x, "getRepositories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWatcherPromise(value: String => js.Promise[PathWatcher]): Self = StObject.set(x, "getWatcherPromise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObserveBuffers(value: js.Function1[/* buffer */ TextBuffer, Unit] => Disposable): Self = StObject.set(x, "observeBuffers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObserveRepositories(value: js.Function1[/* repository */ GitRepository, Unit] => Disposable): Self = StObject.set(x, "observeRepositories", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidAddBuffer(value: js.Function1[/* buffer */ TextBuffer, Unit] => Disposable): Self = StObject.set(x, "onDidAddBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidAddRepository(value: js.Function1[/* repository */ GitRepository, Unit] => Disposable): Self = StObject.set(x, "onDidAddRepository", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangeFiles(value: js.Function1[/* events */ FilesystemChangeEvent, Unit] => Disposable): Self = StObject.set(x, "onDidChangeFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangePaths(value: js.Function1[/* projectPaths */ js.Array[String], Unit] => Disposable): Self = StObject.set(x, "onDidChangePaths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidReplace(value: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit] => Disposable): Self = StObject.set(x, "onDidReplace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativize(value: String => String): Self = StObject.set(x, "relativize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativizePath(value: String => js.Tuple2[String | Null, String]): Self = StObject.set(x, "relativizePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePath(value: String => Unit): Self = StObject.set(x, "removePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRepositoryForDirectory(value: Directory => js.Promise[GitRepository | Null]): Self = StObject.set(x, "repositoryForDirectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPaths(value: js.Array[String] => Unit): Self = StObject.set(x, "setPaths", js.Any.fromFunction1(value))
  }
}
