package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** Add a path to the project's list of root paths. */
  def addPath(projectPath: java.lang.String): scala.Unit
  /**
    *  Determines whether the given path (real or symbolic) is inside the
    *  project's directory.
    */
  def contains(pathToCheck: java.lang.String): scala.Boolean
  /** Get an Array of Directorys associated with this project. */
  def getDirectories(): js.Array[Directory]
  // Managing Paths
  /** Get an Array of strings containing the paths of the project's directories. */
  def getPaths(): js.Array[java.lang.String]
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
  def getWatcherPromise(projectPath: java.lang.String): js.Promise[PathWatcher]
  /**
    *  Invoke the given callback with all current and future text buffers in
    *  the project.
    */
  def observeBuffers(callback: js.Function1[/* buffer */ TextBuffer, scala.Unit]): Disposable
  /** Invoke the given callback with all current and future repositories in the project. */
  def observeRepositories(callback: js.Function1[/* repository */ GitRepository, scala.Unit]): Disposable
  /** Invoke the given callback when a text buffer is added to the project. */
  def onDidAddBuffer(callback: js.Function1[/* buffer */ TextBuffer, scala.Unit]): Disposable
  /** Invoke the given callback when a repository is added to the project. */
  def onDidAddRepository(callback: js.Function1[/* repository */ GitRepository, scala.Unit]): Disposable
  /** Invoke a callback when a filesystem change occurs within any open project path. */
  def onDidChangeFiles(callback: js.Function1[/* events */ FilesystemChangeEvent, scala.Unit]): Disposable
  // Event Subscription
  /** Invoke the given callback when the project paths change. */
  def onDidChangePaths(callback: js.Function1[/* projectPaths */ js.Array[java.lang.String], scala.Unit]): Disposable
  /** Invoke a callback whenever the project's configuration has been replaced. */
  def onDidReplace(
    callback: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | scala.Null], scala.Unit]
  ): Disposable
  /** Get the relative path from the project directory to the given path. */
  def relativize(fullPath: java.lang.String): java.lang.String
  /**
    *  Get the path to the project directory that contains the given path, and
    *  the relative path from that project directory to the given path.
    */
  def relativizePath(fullPath: java.lang.String): js.Tuple2[java.lang.String | scala.Null, java.lang.String]
  /** Remove a path from the project's list of root paths. */
  def removePath(projectPath: java.lang.String): scala.Unit
  /** Get the repository for a given directory asynchronously. */
  def repositoryForDirectory(directory: Directory): js.Promise[GitRepository | scala.Null]
  /** Set the paths of the project's directories. */
  def setPaths(projectPaths: js.Array[java.lang.String]): scala.Unit
}

object Project {
  @scala.inline
  def apply(
    addPath: java.lang.String => scala.Unit,
    contains: java.lang.String => scala.Boolean,
    getDirectories: () => js.Array[Directory],
    getPaths: () => js.Array[java.lang.String],
    getRepositories: () => js.Array[GitRepository],
    getWatcherPromise: java.lang.String => js.Promise[PathWatcher],
    observeBuffers: js.Function1[/* buffer */ TextBuffer, scala.Unit] => Disposable,
    observeRepositories: js.Function1[/* repository */ GitRepository, scala.Unit] => Disposable,
    onDidAddBuffer: js.Function1[/* buffer */ TextBuffer, scala.Unit] => Disposable,
    onDidAddRepository: js.Function1[/* repository */ GitRepository, scala.Unit] => Disposable,
    onDidChangeFiles: js.Function1[/* events */ FilesystemChangeEvent, scala.Unit] => Disposable,
    onDidChangePaths: js.Function1[/* projectPaths */ js.Array[java.lang.String], scala.Unit] => Disposable,
    onDidReplace: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | scala.Null], scala.Unit] => Disposable,
    relativize: java.lang.String => java.lang.String,
    relativizePath: java.lang.String => js.Tuple2[java.lang.String | scala.Null, java.lang.String],
    removePath: java.lang.String => scala.Unit,
    repositoryForDirectory: Directory => js.Promise[GitRepository | scala.Null],
    setPaths: js.Array[java.lang.String] => scala.Unit
  ): Project = {
    val __obj = js.Dynamic.literal(addPath = js.Any.fromFunction1(addPath), contains = js.Any.fromFunction1(contains), getDirectories = js.Any.fromFunction0(getDirectories), getPaths = js.Any.fromFunction0(getPaths), getRepositories = js.Any.fromFunction0(getRepositories), getWatcherPromise = js.Any.fromFunction1(getWatcherPromise), observeBuffers = js.Any.fromFunction1(observeBuffers), observeRepositories = js.Any.fromFunction1(observeRepositories), onDidAddBuffer = js.Any.fromFunction1(onDidAddBuffer), onDidAddRepository = js.Any.fromFunction1(onDidAddRepository), onDidChangeFiles = js.Any.fromFunction1(onDidChangeFiles), onDidChangePaths = js.Any.fromFunction1(onDidChangePaths), onDidReplace = js.Any.fromFunction1(onDidReplace), relativize = js.Any.fromFunction1(relativize), relativizePath = js.Any.fromFunction1(relativizePath), removePath = js.Any.fromFunction1(removePath), repositoryForDirectory = js.Any.fromFunction1(repositoryForDirectory), setPaths = js.Any.fromFunction1(setPaths))
  
    __obj.asInstanceOf[Project]
  }
}

