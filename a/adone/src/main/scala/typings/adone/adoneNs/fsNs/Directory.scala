package typings.adone.adoneNs.fsNs

import typings.adone.Anon_Delay
import typings.adone.Anon_Dirs
import typings.adone.Anon_ModeNumber
import typings.adone.adoneNs.fsNs.INs.CopyToOptions
import typings.adone.adoneNs.fsNs.INs.DirectoryNs.AddFileOptions
import typings.adone.adoneNs.fsNs.INs.Stats
import typings.adone.adoneNs.fsNs.INs.TmpNameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a directory
  */
@JSGlobal("adone.fs.Directory")
@js.native
class Directory protected () extends js.Object {
  def this(path: String*) = this()
  /**
    * Adds a new directory
    */
  def addDirectory(path: String*): js.Promise[Directory] = js.native
  def addFile(a: String, b: String, c: String, d: String, filename: String): js.Promise[File] = js.native
  def addFile(a: String, b: String, c: String, d: String, filename: String, options: AddFileOptions): js.Promise[File] = js.native
  def addFile(a: String, b: String, c: String, filename: String): js.Promise[File] = js.native
  def addFile(a: String, b: String, c: String, filename: String, options: AddFileOptions): js.Promise[File] = js.native
  def addFile(a: String, b: String, filename: String): js.Promise[File] = js.native
  def addFile(a: String, b: String, filename: String, options: AddFileOptions): js.Promise[File] = js.native
  def addFile(a: String, filename: (js.Array[String | AddFileOptions])*): js.Promise[File] = js.native
  def addFile(a: String, filename: String): js.Promise[File] = js.native
  def addFile(a: String, filename: String, options: AddFileOptions): js.Promise[File] = js.native
  /**
    * Adds a new file
    */
  def addFile(filename: String): js.Promise[File] = js.native
  def addFile(filename: String, options: AddFileOptions): js.Promise[File] = js.native
  /**
    * Deletes all the file inside this directory, but not the directory
    */
  def clean(): js.Promise[Unit] = js.native
  /**
    * Copies files from the given path to this directory
    */
  def copyFrom(srcPath: String): js.Promise[Unit] = js.native
  def copyFrom(srcPath: String, options: CopyToOptions): js.Promise[Unit] = js.native
  /**
    * Copies this from this directory to the given path
    */
  def copyTo(destPath: String): js.Promise[Unit] = js.native
  def copyTo(destPath: String, options: CopyToOptions): js.Promise[Unit] = js.native
  /**
    * Creates the directory if doesnt exist
    */
  def create(): js.Promise[Unit] = js.native
  def create(options: Anon_ModeNumber): js.Promise[Unit] = js.native
  /**
    * Returns dirname
    */
  def dirname(): String = js.native
  /**
    * Returns true if the directory exists
    */
  def exists(): js.Promise[Boolean] = js.native
  /**
    * Returns filename
    */
  def filename(): String = js.native
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
  def find(options: Anon_Dirs): js.Promise[js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory]] = js.native
  /**
    * Searches all nested files and directories synchronously
    */
  def findSync(): js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory] = js.native
  def findSync(options: Anon_Dirs): js.Array[File | Directory | SymbolicLinkFile | SymbolicLinkDirectory] = js.native
  /**
    * Returns directory relative to this directory
    */
  def getDirectory(path: String*): Directory = js.native
  /**
    * Returns file relative to this directory
    */
  def getFile(path: String*): File = js.native
  /**
    * Returns directory that is a symbolic link
    */
  def getSymbolicLinkDirectory(path: String*): SymbolicLinkDirectory = js.native
  /**
    * Returns file that is a symbolic link
    */
  def getSymbolicLinkFile(path: String*): SymbolicLinkFile = js.native
  /**
    * Returns the files stats, for links the link stats
    */
  def lstat(): js.Promise[Stats] = js.native
  /**
    * Returns normalized file path, with only / and removed redundant slashes
    */
  def normalizedPath(): String = js.native
  /**
    * Returns absoulte path
    */
  def path(): String = js.native
  /**
    * Returns relative path
    */
  def relativePath(path: String): String = js.native
  def relativePath(path: Directory): String = js.native
  /**
    * Renames the directory
    */
  def rename(name: String): js.Promise[Unit] = js.native
  def rename(name: Directory): js.Promise[Unit] = js.native
  /**
    * Returns path relative to this directory
    */
  def resolve(path: String*): String = js.native
  /**
    * Returns directory stats
    */
  def stat(): js.Promise[Stats] = js.native
  /**
    * Create a symbolic link for this directory
    */
  def symbolicLink(path: String): js.Promise[SymbolicLinkDirectory] = js.native
  def symbolicLink(path: Directory): js.Promise[SymbolicLinkDirectory] = js.native
  /**
    * Deletes the directory
    */
  def unlink(): js.Promise[Unit] = js.native
  def unlink(options: Anon_Delay): js.Promise[Unit] = js.native
}

/* static members */
@JSGlobal("adone.fs.Directory")
@js.native
object Directory extends js.Object {
  /**
    * Creates a new directory with the given path
    */
  def create(path: String*): js.Promise[Directory] = js.native
  /**
    * Creates a new temporary directory
    */
  def createTmp(): js.Promise[Directory] = js.native
  def createTmp(options: TmpNameOptions): js.Promise[Directory] = js.native
}

