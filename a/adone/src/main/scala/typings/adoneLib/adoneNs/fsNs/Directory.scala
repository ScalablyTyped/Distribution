package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a directory
  */
@JSGlobal("adone.fs.Directory")
@js.native
class Directory protected () extends js.Object {
  def this(path: java.lang.String*) = this()
  /**
    * Adds a new directory
    */
  def addDirectory(path: java.lang.String*): js.Promise[Directory] = js.native
  def addFile(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    filename: java.lang.String
  ): js.Promise[File] = js.native
  def addFile(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    filename: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions
  ): js.Promise[File] = js.native
  def addFile(a: java.lang.String, b: java.lang.String, c: java.lang.String, filename: java.lang.String): js.Promise[File] = js.native
  def addFile(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    filename: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions
  ): js.Promise[File] = js.native
  def addFile(a: java.lang.String, b: java.lang.String, filename: java.lang.String): js.Promise[File] = js.native
  def addFile(
    a: java.lang.String,
    b: java.lang.String,
    filename: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions
  ): js.Promise[File] = js.native
  def addFile(
    a: java.lang.String,
    filename: (js.Array[java.lang.String | adoneLib.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions])*
  ): js.Promise[File] = js.native
  def addFile(a: java.lang.String, filename: java.lang.String): js.Promise[File] = js.native
  def addFile(
    a: java.lang.String,
    filename: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions
  ): js.Promise[File] = js.native
  /**
    * Adds a new file
    */
  def addFile(filename: java.lang.String): js.Promise[File] = js.native
  def addFile(filename: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions): js.Promise[File] = js.native
  /**
    * Deletes all the file inside this directory, but not the directory
    */
  def clean(): js.Promise[scala.Unit] = js.native
  /**
    * Copies files from the given path to this directory
    */
  def copyFrom(srcPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def copyFrom(srcPath: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.CopyToOptions): js.Promise[scala.Unit] = js.native
  /**
    * Copies this from this directory to the given path
    */
  def copyTo(destPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def copyTo(destPath: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.CopyToOptions): js.Promise[scala.Unit] = js.native
  /**
    * Creates the directory if doesnt exist
    */
  def create(): js.Promise[scala.Unit] = js.native
  def create(options: adoneLib.Anon_ModeNumber): js.Promise[scala.Unit] = js.native
  /**
    * Returns dirname
    */
  def dirname(): java.lang.String = js.native
  /**
    * Returns true if the directory exists
    */
  def exists(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns filename
    */
  def filename(): java.lang.String = js.native
  /**
    * Returns files inside this directory
    */
  def files(): js.Promise[js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory]] = js.native
  /**
    * Returns files inside this directory synchronously
    */
  def filesSync(): js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory] = js.native
  /**
    * Searches all nested files and directories
    */
  def find(): js.Promise[js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory]] = js.native
  def find(options: adoneLib.Anon_Dirs): js.Promise[js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory]] = js.native
  /**
    * Searches all nested files and directories synchronously
    */
  def findSync(): js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory] = js.native
  def findSync(options: adoneLib.Anon_Dirs): js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory] = js.native
  /**
    * Returns directory relative to this directory
    */
  def getDirectory(path: java.lang.String*): Directory = js.native
  /**
    * Returns file relative to this directory
    */
  def getFile(path: java.lang.String*): File = js.native
  /**
    * Returns directory that is a symbolic link
    */
  def getSymbolicLinkDirectory(path: java.lang.String*): SymbolicLinkDirectory = js.native
  /**
    * Returns file that is a symbolic link
    */
  def getSymbolicLinkFile(path: java.lang.String*): SymbolicLinkFile = js.native
  /**
    * Returns the files stats, for links the link stats
    */
  def lstat(): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  /**
    * Returns normalized file path, with only / and removed redundant slashes
    */
  def normalizedPath(): java.lang.String = js.native
  /**
    * Returns absoulte path
    */
  def path(): java.lang.String = js.native
  def relativePath(path: Directory): java.lang.String = js.native
  /**
    * Returns relative path
    */
  def relativePath(path: java.lang.String): java.lang.String = js.native
  def rename(name: Directory): js.Promise[scala.Unit] = js.native
  /**
    * Renames the directory
    */
  def rename(name: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Returns path relative to this directory
    */
  def resolve(path: java.lang.String*): java.lang.String = js.native
  /**
    * Returns directory stats
    */
  def stat(): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  def symbolicLink(path: Directory): js.Promise[SymbolicLinkDirectory] = js.native
  /**
    * Create a symbolic link for this directory
    */
  def symbolicLink(path: java.lang.String): js.Promise[SymbolicLinkDirectory] = js.native
  /**
    * Deletes the directory
    */
  def unlink(): js.Promise[scala.Unit] = js.native
  def unlink(options: adoneLib.Anon_Delay): js.Promise[scala.Unit] = js.native
}

/* static members */
@JSGlobal("adone.fs.Directory")
@js.native
object Directory extends js.Object {
  /**
    * Creates a new directory with the given path
    */
  def create(path: java.lang.String*): js.Promise[adoneLib.adoneNs.fsNs.Directory] = js.native
  /**
    * Creates a new temporary directory
    */
  def createTmp(): js.Promise[adoneLib.adoneNs.fsNs.Directory] = js.native
  def createTmp(options: adoneLib.adoneNs.fsNs.INs.TmpNameOptions): js.Promise[adoneLib.adoneNs.fsNs.Directory] = js.native
}

