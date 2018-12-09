package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Directory")
@js.native
class Directory protected () extends js.Object {
  // Construction
  /** Configures a new Directory instance, no files are accessed. */
  def this(directoryPath: java.lang.String) = this()
  // Construction
  /** Configures a new Directory instance, no files are accessed. */
  def this(directoryPath: java.lang.String, symlink: scala.Boolean) = this()
  /**
       *  Determines if the given path (real or symbolic) is inside this directory. This
       *  method does not actually check if the path exists, it just checks if the path
       *  is under this directory.
       */
  def contains(pathToCheck: java.lang.String): scala.Boolean = js.native
  /**
       *  Creates the directory on disk that corresponds to ::getPath() if no such
       *  directory already exists.
       */
  def create(): js.Promise[scala.Boolean] = js.native
  /**
       *  Creates the directory on disk that corresponds to ::getPath() if no such
       *  directory already exists.
       */
  def create(mode: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
       *  Returns a promise that resolves to a boolean, true if the directory
       *  exists, false otherwise.
       */
  def exists(): js.Promise[scala.Boolean] = js.native
  /** Returns a boolean, true if the directory exists, false otherwise. */
  def existsSync(): scala.Boolean = js.native
  /** Returns the string basename of the directory. */
  def getBaseName(): java.lang.String = js.native
  /** Reads file entries in this directory from disk asynchronously. */
  def getEntries(
    callback: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* entries */ js.Array[File | this.type], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Reads file entries in this directory from disk synchronously. */
  def getEntriesSync(): js.Array[File | Directory] = js.native
  /**
       *  Traverse within this Directory to a child File. This method doesn't actually
       *  check to see if the File exists, it just creates the File object.
       */
  def getFile(filename: java.lang.String): File = js.native
  // Traversing
  /** Traverse to the parent directory. */
  def getParent(): Directory = js.native
  // Managing Paths
  /**
       *  This may include unfollowed symlinks or relative directory entries.
       *  Or it may be fully resolved, it depends on what you give it.
       */
  def getPath(): java.lang.String = js.native
  /**
       *  All relative directory entries are removed and symlinks are resolved to
       *  their final destination.
       */
  def getRealPathSync(): java.lang.String = js.native
  /**
       *  Traverse within this a Directory to a child Directory. This method doesn't actually
       *  check to see if the Directory exists, it just creates the Directory object.
       */
  def getSubdirectory(dirname: java.lang.String): Directory = js.native
  /** Returns a boolean, always true. */
  def isDirectory(): /* is Directory */scala.Boolean = js.native
  // Directory Metadata
  /** Returns a boolean, always false. */
  def isFile(): /* is File */scala.Boolean = js.native
  /**
       *  Return a boolean, true if this Directory is the root directory of the
       *  filesystem, or false if it isn't.
       */
  def isRoot(): scala.Boolean = js.native
  /** Returns a boolean indicating whether or not this is a symbolic link. */
  def isSymbolicLink(): scala.Boolean = js.native
  // Event Subscription
  /** Invoke the given callback when the directory's contents change. */
  def onDidChange(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Returns the relative string path to the given path from this directory. */
  def relativize(fullPath: java.lang.String): java.lang.String = js.native
}

