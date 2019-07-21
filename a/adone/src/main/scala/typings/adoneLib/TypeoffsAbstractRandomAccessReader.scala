package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffsAbstractRandomAccessReader extends js.Object {
  /**
    * Represents an abstract random access reader
    */
  var AbstractRandomAccessReader: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.fsNs.AbstractRandomAccessReader] = js.native
  /**
    * Represents a directory
    */
  var Directory: TypeofClassDirectory = js.native
  /**
    * Represents a file
    */
  var File: org.scalablytyped.runtime.Instantiable1[/* path (repeated) */ java.lang.String, adoneLib.adoneNs.fsNs.File] = js.native
  val INs: TypeofIDirectory = js.native
  /**
    * Represents the permissions of a file
    */
  var Mode: org.scalablytyped.runtime.Instantiable1[/* stat */ adoneLib.adoneNs.fsNs.INs.Stats, adoneLib.adoneNs.fsNs.Mode] = js.native
  /**
    * Represents a random access reader for a buffer
    */
  var RandomAccessBufferReader: org.scalablytyped.runtime.Instantiable1[/* buffer */ nodeLib.Buffer, adoneLib.adoneNs.fsNs.RandomAccessBufferReader] = js.native
  /**
    * Represents a random access reader for a file by its file descriptor
    */
  var RandomAccessFdReader: org.scalablytyped.runtime.Instantiable1[/* fd */ scala.Double, adoneLib.adoneNs.fsNs.RandomAccessFdReader] = js.native
  /**
    * Represents a file that supports random access
    */
  var RandomAccessFile: TypeofClassRandomAccessFile = js.native
  /**
    * Represents a directory that is a symbolic link to another directory
    */
  var SymbolicLinkDirectory: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.fsNs.SymbolicLinkDirectory] = js.native
  /**
    * Represents a file that is a symbolic link to another file
    */
  var SymbolicLinkFile: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.fsNs.SymbolicLinkFile] = js.native
  /**
    * Represents an event emitter that watches for a file growing,
    * emits "line" event for each new line in a file
    */
  var TailWatcher: org.scalablytyped.runtime.Instantiable2[
    /* filename */ java.lang.String, 
    js.UndefOr[/* options */ adoneLib.adoneNs.fsNs.INs.TailWatcherNs.ConstructorOptions], 
    adoneLib.adoneNs.fsNs.TailWatcher
  ] = js.native
  /**
    * Represents a file watcher
    */
  var Watcher: org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[/* options */ adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions], 
    adoneLib.adoneNs.fsNs.Watcher
  ] = js.native
  val constantsNs: TypeofconstantsFOK = js.native
  /**
    * Creates a glob stream
    */
  @JSName("glob")
  val glob_Original: adoneLib.adoneNs.fsNs.INs.GlobNs.GlobFunction = js.native
  def access(file: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Unit] = js.native
  def access(file: adoneLib.adoneNs.fsNs.INs.URL, mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Tests a user's permissions for the file or directory specified by path
    */
  def access(file: java.lang.String): js.Promise[scala.Unit] = js.native
  def access(file: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def access(file: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def access(file: nodeLib.Buffer, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def accessSync(file: adoneLib.adoneNs.fsNs.INs.URL): scala.Unit = js.native
  def accessSync(file: adoneLib.adoneNs.fsNs.INs.URL, mode: scala.Double): scala.Unit = js.native
  /**
    * Tests a user's permissions for the file or directory specified by path
    */
  def accessSync(file: java.lang.String): scala.Unit = js.native
  def accessSync(file: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def accessSync(file: nodeLib.Buffer): scala.Unit = js.native
  def accessSync(file: nodeLib.Buffer, mode: scala.Double): scala.Unit = js.native
  /**
    * Appends data to a file, creating the file if it does not yet exist
    */
  def appendFile(file: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def appendFile(file: java.lang.String, data: java.lang.String, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def appendFile(file: java.lang.String, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def appendFile(file: java.lang.String, data: nodeLib.Buffer, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: java.lang.String, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: nodeLib.Buffer, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def appendFile(file: scala.Double, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def appendFile(file: scala.Double, data: java.lang.String, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def appendFile(file: scala.Double, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def appendFile(file: scala.Double, data: nodeLib.Buffer, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  /**
    * Appends data to a file, creating the file if it does not yet exist
    */
  def appendFileSync(file: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def appendFileSync(file: java.lang.String, data: java.lang.String, options: Anon_EncodingFlag): scala.Unit = js.native
  def appendFileSync(file: java.lang.String, data: nodeLib.Buffer): scala.Unit = js.native
  def appendFileSync(file: java.lang.String, data: nodeLib.Buffer, options: Anon_EncodingFlag): scala.Unit = js.native
  def appendFileSync(file: nodeLib.Buffer, data: java.lang.String): scala.Unit = js.native
  def appendFileSync(file: nodeLib.Buffer, data: java.lang.String, options: Anon_EncodingFlag): scala.Unit = js.native
  def appendFileSync(file: nodeLib.Buffer, data: nodeLib.Buffer): scala.Unit = js.native
  def appendFileSync(file: nodeLib.Buffer, data: nodeLib.Buffer, options: Anon_EncodingFlag): scala.Unit = js.native
  def appendFileSync(file: scala.Double, data: java.lang.String): scala.Unit = js.native
  def appendFileSync(file: scala.Double, data: java.lang.String, options: Anon_EncodingFlag): scala.Unit = js.native
  def appendFileSync(file: scala.Double, data: nodeLib.Buffer): scala.Unit = js.native
  def appendFileSync(file: scala.Double, data: nodeLib.Buffer, options: Anon_EncodingFlag): scala.Unit = js.native
  def chmod(path: adoneLib.adoneNs.fsNs.INs.URL, mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes permissions of a file
    */
  def chmod(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def chmod(path: nodeLib.Buffer, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def chown(path: adoneLib.adoneNs.fsNs.INs.URL, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes ownership of a file
    */
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  def chown(path: nodeLib.Buffer, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  def chownr(path: adoneLib.adoneNs.fsNs.INs.URL, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes ownership recursively for a given path
    */
  def chownr(path: java.lang.String, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  def chownr(path: nodeLib.Buffer, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Closes a file descriptor
    */
  def close(fd: adoneLib.adoneNs.fsNs.INs.FD): js.Promise[scala.Unit] = js.native
  /**
    * Closes a file descriptor
    */
  def closeSync(fd: adoneLib.adoneNs.fsNs.INs.FD): scala.Unit = js.native
  /**
    * Recursively copies all the files from src to dst
    */
  def copy(src: java.lang.String, dst: java.lang.String): js.Promise[scala.Unit] = js.native
  def copy(src: java.lang.String, dst: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.CopyOptions): js.Promise[scala.Unit] = js.native
  /**
    * Copies all files from src to dst
    */
  def copyTo(src: java.lang.String, dst: java.lang.String): js.Promise[scala.Unit] = js.native
  def copyTo(src: java.lang.String, dst: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.CopyToOptions): js.Promise[scala.Unit] = js.native
  def createReadStream(path: js.UndefOr[scala.Nothing], options: adoneLib.adoneNs.fsNs.INs.ReadStreamOptionsFD): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: adoneLib.adoneNs.fsNs.INs.URL): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: adoneLib.adoneNs.fsNs.INs.URL, options: adoneLib.adoneNs.fsNs.INs.ReadStreamOptions): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: java.lang.String): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.ReadStreamOptions): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: nodeLib.Buffer): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createReadStream(path: nodeLib.Buffer, options: adoneLib.adoneNs.fsNs.INs.ReadStreamOptions): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  /**
    * Returns a read stream for the given file
    */
  def createReadStream(path: scala.Null, options: adoneLib.adoneNs.fsNs.INs.ReadStreamOptionsFD): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def createWriteStream(path: js.UndefOr[scala.Nothing], options: adoneLib.adoneNs.fsNs.INs.WriteStreamOptionsFD): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: adoneLib.adoneNs.fsNs.INs.URL): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: adoneLib.adoneNs.fsNs.INs.URL, options: adoneLib.adoneNs.fsNs.INs.WriteStreamOptions): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: java.lang.String): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WriteStreamOptions): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: nodeLib.Buffer): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def createWriteStream(path: nodeLib.Buffer, options: adoneLib.adoneNs.fsNs.INs.WriteStreamOptions): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  /**
    * Returns a write stream to the given file
    */
  def createWriteStream(path: scala.Null, options: adoneLib.adoneNs.fsNs.INs.WriteStreamOptionsFD): adoneLib.adoneNs.fsNs.INs.WriteStream = js.native
  def exists(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Boolean] = js.native
  /**
    * Checks whether a file exists
    */
  def exists(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def exists(path: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
  def existsSync(path: adoneLib.adoneNs.fsNs.INs.URL): scala.Boolean = js.native
  /**
    * Checks whether a file exists
    */
  def existsSync(path: java.lang.String): scala.Boolean = js.native
  def existsSync(path: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * Changes permissions of a file
    */
  def fchmod(fd: adoneLib.adoneNs.fsNs.INs.FD, mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes permissions of a file
    */
  def fchmodSync(fd: adoneLib.adoneNs.fsNs.INs.FD, mode: scala.Double): scala.Unit = js.native
  /**
    * Changes ownership of a file
    */
  def fchown(fd: adoneLib.adoneNs.fsNs.INs.FD, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes ownership of a file
    */
  def fchownSync(fd: adoneLib.adoneNs.fsNs.INs.FD, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def flock(fd: adoneLib.adoneNs.fsNs.INs.FD, flags: scala.Double): js.Promise[scala.Unit] = js.native
  @JSName("flock")
  def flock_ex(fd: adoneLib.adoneNs.fsNs.INs.FD, flags: adoneLib.adoneLibStrings.ex): js.Promise[scala.Unit] = js.native
  @JSName("flock")
  def flock_exnb(fd: adoneLib.adoneNs.fsNs.INs.FD, flags: adoneLib.adoneLibStrings.exnb): js.Promise[scala.Unit] = js.native
  /**
    * Applies or removes an advisory lock on an open file
    */
  @JSName("flock")
  def flock_sh(fd: adoneLib.adoneNs.fsNs.INs.FD, flags: adoneLib.adoneLibStrings.sh): js.Promise[scala.Unit] = js.native
  @JSName("flock")
  def flock_shnb(fd: adoneLib.adoneNs.fsNs.INs.FD, flags: adoneLib.adoneLibStrings.shnb): js.Promise[scala.Unit] = js.native
  @JSName("flock")
  def flock_un(fd: adoneLib.adoneNs.fsNs.INs.FD, flags: adoneLib.adoneLibStrings.un): js.Promise[scala.Unit] = js.native
  /**
    * Gets file status
    */
  def fstat(fd: adoneLib.adoneNs.fsNs.INs.FD): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  /**
    * Gets file status
    */
  def fstatSync(fd: adoneLib.adoneNs.fsNs.INs.FD): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Synchronizes a file's in-core state with storage
    */
  def fsync(fd: adoneLib.adoneNs.fsNs.INs.FD): js.Promise[scala.Unit] = js.native
  /**
    * Synchronizes a file's in-core state with storage
    */
  def fsyncSync(fd: adoneLib.adoneNs.fsNs.INs.FD): scala.Unit = js.native
  /**
    * Truncates a file to a specified length
    */
  def ftruncate(fd: adoneLib.adoneNs.fsNs.INs.FD): js.Promise[scala.Unit] = js.native
  def ftruncate(fd: adoneLib.adoneNs.fsNs.INs.FD, length: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Truncates a file to a specified length
    */
  def ftruncateSync(fd: adoneLib.adoneNs.fsNs.INs.FD): scala.Unit = js.native
  def ftruncateSync(fd: adoneLib.adoneNs.fsNs.INs.FD, length: scala.Double): scala.Unit = js.native
  /**
    * Changes the file timestamps of a file referenced by the supplied file descriptor
    */
  def futimes(fd: adoneLib.adoneNs.fsNs.INs.FD, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes the file timestamps of a file referenced by the supplied file descriptor
    */
  def futimesSync(fd: adoneLib.adoneNs.fsNs.INs.FD, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  /**
    * Creates a glob stream
    */
  def glob(patterns: java.lang.String): adoneLib.adoneNs.fsNs.INs.GlobNs.Stream[java.lang.String] = js.native
  /**
    * Creates a glob stream
    */
  def glob(
    patterns: java.lang.String,
    options: (adoneLib.adoneNs.fsNs.INs.GlobNs.StreamOptions with (Anon_PatternIndex | Anon_PatternIndexTrue | Anon_Stat)) | adoneLib.adoneNs.fsNs.INs.GlobNs.StreamOptions
  ): adoneLib.adoneNs.fsNs.INs.GlobNs.Stream[Anon_PathPatternIndex] = js.native
  def glob(patterns: js.Array[java.lang.String]): adoneLib.adoneNs.fsNs.INs.GlobNs.Stream[java.lang.String] = js.native
  def glob(
    patterns: js.Array[java.lang.String],
    options: (adoneLib.adoneNs.fsNs.INs.GlobNs.StreamOptions with (Anon_PatternIndex | Anon_PatternIndexTrue | Anon_Stat)) | adoneLib.adoneNs.fsNs.INs.GlobNs.StreamOptions
  ): adoneLib.adoneNs.fsNs.INs.GlobNs.Stream[Anon_PathPatternIndex] = js.native
  /**
    * Returns the current user homedir
    */
  def homeDir(): java.lang.String = js.native
  /**
    * Returns true if the given path refers to a direcotry
    */
  def isDirectory(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns true if the given path refers to a direcotry
    */
  def isDirectorySync(path: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if the given path refers to an executable file
    */
  def isExecutable(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns true if the given path refers to an executable file
    */
  def isExecutableSync(path: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if the given path refers to a file
    */
  def isFile(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns true if the given path refers to a file
    */
  def isFileSync(path: java.lang.String): scala.Boolean = js.native
  /**
    * TODO
    */
  def lookup(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def lstat(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  /**
    * Gets file status, identical to stat, except that if pathname is a symbolic link,
    * then it returns information about the link itself, not the file that it refers to
    */
  def lstat(path: java.lang.String): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  def lstat(path: nodeLib.Buffer): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  def lstatSync(path: adoneLib.adoneNs.fsNs.INs.URL): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Gets file status, identical to stat, except that if pathname is a symbolic link,
    * then it returns information about the link itself, not the file that it refers to
    */
  def lstatSync(path: java.lang.String): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  def lstatSync(path: nodeLib.Buffer): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Creates a new directory
    */
  def mkdir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Creates a new directory
    */
  def mkdirSync(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdirSync(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Creates a new directory and any necessary subdirectories
    */
  def mkdirp(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdirp(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Creates a new directory and any necessary subdirectories
    */
  def mkdirpSync(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdirpSync(path: java.lang.String, mode: scala.Double): js.Promise[scala.Unit] = js.native
  def open(path: adoneLib.adoneNs.fsNs.INs.URL, flags: adoneLib.adoneNs.fsNs.INs.Flag): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: adoneLib.adoneNs.fsNs.INs.URL, flags: adoneLib.adoneNs.fsNs.INs.Flag, mode: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: adoneLib.adoneNs.fsNs.INs.URL, flags: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: adoneLib.adoneNs.fsNs.INs.URL, flags: scala.Double, mode: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  /**
    * Opens and possibly creates a file
    */
  def open(path: java.lang.String, flags: adoneLib.adoneNs.fsNs.INs.Flag): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: java.lang.String, flags: adoneLib.adoneNs.fsNs.INs.Flag, mode: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: java.lang.String, flags: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: java.lang.String, flags: scala.Double, mode: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: nodeLib.Buffer, flags: adoneLib.adoneNs.fsNs.INs.Flag): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: nodeLib.Buffer, flags: adoneLib.adoneNs.fsNs.INs.Flag, mode: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: nodeLib.Buffer, flags: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def open(path: nodeLib.Buffer, flags: scala.Double, mode: scala.Double): js.Promise[adoneLib.adoneNs.fsNs.INs.FD] = js.native
  def openSync(path: adoneLib.adoneNs.fsNs.INs.URL, flags: adoneLib.adoneNs.fsNs.INs.Flag): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: adoneLib.adoneNs.fsNs.INs.URL, flags: adoneLib.adoneNs.fsNs.INs.Flag, mode: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: adoneLib.adoneNs.fsNs.INs.URL, flags: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: adoneLib.adoneNs.fsNs.INs.URL, flags: scala.Double, mode: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  /**
    * Opens and possibly creates a file
    */
  def openSync(path: java.lang.String, flags: adoneLib.adoneNs.fsNs.INs.Flag): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: java.lang.String, flags: adoneLib.adoneNs.fsNs.INs.Flag, mode: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: java.lang.String, flags: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: java.lang.String, flags: scala.Double, mode: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: nodeLib.Buffer, flags: adoneLib.adoneNs.fsNs.INs.Flag): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: nodeLib.Buffer, flags: adoneLib.adoneNs.fsNs.INs.Flag, mode: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: nodeLib.Buffer, flags: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  def openSync(path: nodeLib.Buffer, flags: scala.Double, mode: scala.Double): adoneLib.adoneNs.fsNs.INs.FD = js.native
  /**
    * Read data from the file specified by fd
    */
  def read(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: nodeLib.Buffer,
    /**
    * The offset in the buffer to start writing at
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: scala.Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: scala.Double
  ): js.Promise[scala.Double] = js.native
  def read(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: stdLib.Uint8Array,
    /**
    * The offset in the buffer to start writing at
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: scala.Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: scala.Double
  ): js.Promise[scala.Double] = js.native
  def readFile(filepath: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[nodeLib.Buffer] = js.native
  def readFile(filepath: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def readFile(
    filepath: adoneLib.adoneNs.fsNs.INs.URL,
    options: (adoneLib.adoneNs.fsNs.INs.ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue | Anon_Encoding | Anon_Encoding_1429386911)) | adoneLib.adoneNs.fsNs.INs.ReadFileOptions
  ): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  def readFile(filepath: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def readFile(filepath: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  /**
    * Reads a file
    */
  def readFile(
    filepath: java.lang.String,
    options: (adoneLib.adoneNs.fsNs.INs.ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue | Anon_Encoding | Anon_Encoding_1429386911)) | adoneLib.adoneNs.fsNs.INs.ReadFileOptions
  ): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  def readFile(filepath: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def readFile(filepath: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def readFile(
    filepath: nodeLib.Buffer,
    options: (adoneLib.adoneNs.fsNs.INs.ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue | Anon_Encoding | Anon_Encoding_1429386911)) | adoneLib.adoneNs.fsNs.INs.ReadFileOptions
  ): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  def readFileSync(filepath: adoneLib.adoneNs.fsNs.INs.URL): nodeLib.Buffer = js.native
  def readFileSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def readFileSync(
    filepath: adoneLib.adoneNs.fsNs.INs.URL,
    options: adoneLib.adoneNs.fsNs.INs.ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue)
  ): nodeLib.Buffer | scala.Null = js.native
  def readFileSync(filepath: java.lang.String): nodeLib.Buffer = js.native
  def readFileSync(filepath: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  /**
    * Reads a file
    */
  def readFileSync(
    filepath: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue)
  ): nodeLib.Buffer | scala.Null = js.native
  def readFileSync(filepath: nodeLib.Buffer): nodeLib.Buffer = js.native
  def readFileSync(filepath: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def readFileSync(
    filepath: nodeLib.Buffer,
    options: adoneLib.adoneNs.fsNs.INs.ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue)
  ): nodeLib.Buffer | scala.Null = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(
    filepath: adoneLib.adoneNs.fsNs.INs.URL,
    options: (adoneLib.adoneNs.fsNs.INs.ReadFileOptions with Anon_Encoding) | adoneLib.adoneNs.fsNs.INs.ReadFileOptions
  ): nodeLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(
    filepath: java.lang.String,
    options: (adoneLib.adoneNs.fsNs.INs.ReadFileOptions with Anon_Encoding) | adoneLib.adoneNs.fsNs.INs.ReadFileOptions
  ): nodeLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(
    filepath: nodeLib.Buffer,
    options: (adoneLib.adoneNs.fsNs.INs.ReadFileOptions with Anon_Encoding) | adoneLib.adoneNs.fsNs.INs.ReadFileOptions
  ): nodeLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_String(
    filepath: adoneLib.adoneNs.fsNs.INs.URL,
    options: adoneLib.adoneNs.fsNs.INs.ReadFileOptions with Anon_Encoding_1429386911
  ): java.lang.String = js.native
  @JSName("readFileSync")
  def readFileSync_String(
    filepath: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.ReadFileOptions with Anon_Encoding_1429386911
  ): java.lang.String = js.native
  @JSName("readFileSync")
  def readFileSync_String(
    filepath: nodeLib.Buffer,
    options: adoneLib.adoneNs.fsNs.INs.ReadFileOptions with Anon_Encoding_1429386911
  ): java.lang.String = js.native
  def readLines(filepath: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFlags): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def readLines(filepath: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: java.lang.String, options: Anon_CheckEncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Reads lines from a file
    */
  def readLines(filepath: java.lang.String, options: Anon_CheckEncodingFlags): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def readLines(filepath: nodeLib.Buffer): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  def readLines(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFlags): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def readLinesSync(filepath: adoneLib.adoneNs.fsNs.INs.URL): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFalse): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFlags): js.Array[java.lang.String] | scala.Null = js.native
  def readLinesSync(filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: java.lang.String, options: Anon_CheckEncodingFalse): js.Array[java.lang.String] = js.native
  /**
    * Reads lines from a file
    */
  def readLinesSync(filepath: java.lang.String, options: Anon_CheckEncodingFlags): js.Array[java.lang.String] | scala.Null = js.native
  def readLinesSync(filepath: nodeLib.Buffer): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFalse): js.Array[java.lang.String] = js.native
  def readLinesSync(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFlags): js.Array[java.lang.String] | scala.Null = js.native
  def readSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: nodeLib.Buffer,
    /**
    * The offset in the buffer to start writing at
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: scala.Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: scala.Double
  ): scala.Double = js.native
  def readSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: stdLib.Uint8Array,
    /**
    * The offset in the buffer to start writing at
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: scala.Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: scala.Double
  ): scala.Double = js.native
  def readWords(filepath: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFlags): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def readWords(filepath: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: java.lang.String, options: Anon_CheckEncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Reads words from a file
    */
  def readWords(filepath: java.lang.String, options: Anon_CheckEncodingFlags): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def readWords(filepath: nodeLib.Buffer): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  def readWords(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFlags): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  def readWordsSync(filepath: adoneLib.adoneNs.fsNs.INs.URL): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFalse): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_CheckEncodingFlags): js.Array[java.lang.String] | scala.Null = js.native
  def readWordsSync(filepath: java.lang.String): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: java.lang.String, options: Anon_CheckEncodingFalse): js.Array[java.lang.String] = js.native
  /**
    * Reads words from a file
    */
  def readWordsSync(filepath: java.lang.String, options: Anon_CheckEncodingFlags): js.Array[java.lang.String] | scala.Null = js.native
  def readWordsSync(filepath: nodeLib.Buffer): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFalse): js.Array[java.lang.String] = js.native
  def readWordsSync(filepath: nodeLib.Buffer, options: Anon_CheckEncodingFlags): js.Array[java.lang.String] | scala.Null = js.native
  def readdir(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readdir(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_Encoding): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_EncodingOptional): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Reads a directory
    */
  def readdir(path: java.lang.String): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readdir(path: java.lang.String, options: Anon_Encoding): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: java.lang.String, options: Anon_EncodingOptional): js.Promise[js.Array[java.lang.String]] = js.native
  def readdir(path: nodeLib.Buffer): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[js.Array[java.lang.String]] = js.native
  def readdir(path: nodeLib.Buffer, options: Anon_Encoding): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def readdir(path: nodeLib.Buffer, options: Anon_EncodingOptional): js.Promise[js.Array[java.lang.String]] = js.native
  def readdirSync(path: adoneLib.adoneNs.fsNs.INs.URL): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readdirSync(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_Encoding): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_EncodingOptional): js.Array[java.lang.String] = js.native
  /**
    * Reads a directory
    */
  def readdirSync(path: java.lang.String): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readdirSync(path: java.lang.String, options: Anon_Encoding): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: java.lang.String, options: Anon_EncodingOptional): js.Array[java.lang.String] = js.native
  def readdirSync(path: nodeLib.Buffer): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Array[java.lang.String] = js.native
  def readdirSync(path: nodeLib.Buffer, options: Anon_Encoding): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: nodeLib.Buffer, options: Anon_EncodingOptional): js.Array[java.lang.String] = js.native
  def readdirp(root: adoneLib.adoneNs.fsNs.INs.URL): adoneLib.adoneNs.streamNs.coreNs.Stream[scala.Nothing, adoneLib.adoneNs.fsNs.INs.ReaddirpEntry] = js.native
  def readdirp(root: adoneLib.adoneNs.fsNs.INs.URL, options: adoneLib.adoneNs.fsNs.INs.ReaddirpOptions): adoneLib.adoneNs.streamNs.coreNs.Stream[scala.Nothing, adoneLib.adoneNs.fsNs.INs.ReaddirpEntry] = js.native
  /**
    * Traverses the given path
    */
  def readdirp(root: java.lang.String): adoneLib.adoneNs.streamNs.coreNs.Stream[scala.Nothing, adoneLib.adoneNs.fsNs.INs.ReaddirpEntry] = js.native
  def readdirp(root: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.ReaddirpOptions): adoneLib.adoneNs.streamNs.coreNs.Stream[scala.Nothing, adoneLib.adoneNs.fsNs.INs.ReaddirpEntry] = js.native
  def readdirp(root: nodeLib.Buffer): adoneLib.adoneNs.streamNs.coreNs.Stream[scala.Nothing, adoneLib.adoneNs.fsNs.INs.ReaddirpEntry] = js.native
  def readdirp(root: nodeLib.Buffer, options: adoneLib.adoneNs.fsNs.INs.ReaddirpOptions): adoneLib.adoneNs.streamNs.coreNs.Stream[scala.Nothing, adoneLib.adoneNs.fsNs.INs.ReaddirpEntry] = js.native
  def readlink(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[nodeLib.Buffer] = js.native
  def readlink(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def readlink(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_Encoding): js.Promise[nodeLib.Buffer] = js.native
  def readlink(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_EncodingOptional): js.Promise[java.lang.String] = js.native
  /**
    * Reads the value of a symbolic link
    */
  def readlink(path: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def readlink(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def readlink(path: java.lang.String, options: Anon_Encoding): js.Promise[nodeLib.Buffer] = js.native
  def readlink(path: java.lang.String, options: Anon_EncodingOptional): js.Promise[java.lang.String] = js.native
  def readlink(path: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def readlink(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def readlink(path: nodeLib.Buffer, options: Anon_Encoding): js.Promise[nodeLib.Buffer] = js.native
  def readlink(path: nodeLib.Buffer, options: Anon_EncodingOptional): js.Promise[java.lang.String] = js.native
  def readlinkSync(path: adoneLib.adoneNs.fsNs.INs.URL): java.lang.String = js.native
  def readlinkSync(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def readlinkSync(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_Encoding): nodeLib.Buffer = js.native
  def readlinkSync(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_EncodingOptional): java.lang.String = js.native
  def readlinkSync(path: java.lang.String): java.lang.String = js.native
  def readlinkSync(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def readlinkSync(path: java.lang.String, options: Anon_Encoding): nodeLib.Buffer = js.native
  def readlinkSync(path: java.lang.String, options: Anon_EncodingOptional): java.lang.String = js.native
  def readlinkSync(path: nodeLib.Buffer): java.lang.String = js.native
  def readlinkSync(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def readlinkSync(path: nodeLib.Buffer, options: Anon_Encoding): nodeLib.Buffer = js.native
  def readlinkSync(path: nodeLib.Buffer, options: Anon_EncodingOptional): java.lang.String = js.native
  @JSName("readlinkSync")
  def readlinkSync_Buffer(path: adoneLib.adoneNs.fsNs.INs.URL): nodeLib.Buffer = js.native
  /**
    * Reads the value of a symbolic link
    */
  @JSName("readlinkSync")
  def readlinkSync_Buffer(path: java.lang.String): nodeLib.Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_Buffer(path: nodeLib.Buffer): nodeLib.Buffer = js.native
  def realpath(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[java.lang.String] = js.native
  def realpath(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def realpath(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_BufferEncoding): js.Promise[nodeLib.Buffer] = js.native
  def realpath(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_EncodingOptional): js.Promise[java.lang.String] = js.native
  def realpath(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def realpath(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def realpath(path: java.lang.String, options: Anon_BufferEncoding): js.Promise[nodeLib.Buffer] = js.native
  def realpath(path: java.lang.String, options: Anon_EncodingOptional): js.Promise[java.lang.String] = js.native
  def realpath(path: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def realpath(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  def realpath(path: nodeLib.Buffer, options: Anon_BufferEncoding): js.Promise[nodeLib.Buffer] = js.native
  def realpath(path: nodeLib.Buffer, options: Anon_EncodingOptional): js.Promise[java.lang.String] = js.native
  def realpathSync(path: adoneLib.adoneNs.fsNs.INs.URL): java.lang.String = js.native
  def realpathSync(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def realpathSync(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_BufferEncoding): nodeLib.Buffer = js.native
  def realpathSync(path: adoneLib.adoneNs.fsNs.INs.URL, options: Anon_EncodingOptional): java.lang.String = js.native
  def realpathSync(path: java.lang.String): java.lang.String = js.native
  def realpathSync(path: java.lang.String, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def realpathSync(path: java.lang.String, options: Anon_BufferEncoding): nodeLib.Buffer = js.native
  def realpathSync(path: java.lang.String, options: Anon_EncodingOptional): java.lang.String = js.native
  def realpathSync(path: nodeLib.Buffer): java.lang.String = js.native
  def realpathSync(path: nodeLib.Buffer, encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  def realpathSync(path: nodeLib.Buffer, options: Anon_BufferEncoding): nodeLib.Buffer = js.native
  def realpathSync(path: nodeLib.Buffer, options: Anon_EncodingOptional): java.lang.String = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneLibStrings.buffer): nodeLib.Buffer = js.native
  /**
    * Returns the canonicalized absolute pathname
    */
  @JSName("realpathSync")
  def realpathSync_buffer(path: java.lang.String, encoding: adoneLib.adoneLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: nodeLib.Buffer, encoding: adoneLib.adoneLibStrings.buffer): nodeLib.Buffer = js.native
  @JSName("realpath")
  def realpath_buffer(path: adoneLib.adoneNs.fsNs.INs.URL, encoding: adoneLib.adoneLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Returns the canonicalized absolute pathname
    */
  @JSName("realpath")
  def realpath_buffer(path: java.lang.String, encoding: adoneLib.adoneLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
  @JSName("realpath")
  def realpath_buffer(path: nodeLib.Buffer, encoding: adoneLib.adoneLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Renames a file
    */
  def rename(oldPath: java.lang.String, newPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String, options: Anon_Delay): js.Promise[scala.Unit] = js.native
  /**
    * Recursively deletes the given path, that can be a glob pattern
    */
  def rm(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def rm(path: java.lang.String, options: Anon_Cwd): js.Promise[scala.Unit] = js.native
  /**
    * Recursively deletes empty directiries inside the given directory
    */
  def rmEmpty(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def rmEmpty(path: java.lang.String, options: Anon_CwdFilename): js.Promise[scala.Unit] = js.native
  def rmdir(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Unit] = js.native
  /**
    * Deletes a directory
    */
  def rmdir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def rmdir(path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  /**
    * Repositions read/write file offset
    */
  def seek(fd: adoneLib.adoneNs.fsNs.INs.FD, offset: scala.Double, whence: scala.Double): js.Promise[scala.Double] = js.native
  def stat(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  /**
    * Gets file status
    */
  def stat(path: java.lang.String): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  def stat(path: nodeLib.Buffer): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  def statSync(path: adoneLib.adoneNs.fsNs.INs.URL): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Gets file status
    */
  def statSync(path: java.lang.String): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  def statSync(path: nodeLib.Buffer): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Returns information about a mounted file system
    */
  def statVFS(path: java.lang.String): js.Promise[adoneLib.adoneNs.fsNs.INs.StatVFS] = js.native
  def symlink(target: adoneLib.adoneNs.fsNs.INs.URL, path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Unit] = js.native
  def symlink(
    target: adoneLib.adoneNs.fsNs.INs.URL,
    path: adoneLib.adoneNs.fsNs.INs.URL,
    `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType
  ): js.Promise[scala.Unit] = js.native
  def symlink(target: adoneLib.adoneNs.fsNs.INs.URL, path: java.lang.String): js.Promise[scala.Unit] = js.native
  def symlink(
    target: adoneLib.adoneNs.fsNs.INs.URL,
    path: java.lang.String,
    `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType
  ): js.Promise[scala.Unit] = js.native
  def symlink(target: adoneLib.adoneNs.fsNs.INs.URL, path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def symlink(
    target: adoneLib.adoneNs.fsNs.INs.URL,
    path: nodeLib.Buffer,
    `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType
  ): js.Promise[scala.Unit] = js.native
  def symlink(target: java.lang.String, path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Unit] = js.native
  def symlink(
    target: java.lang.String,
    path: adoneLib.adoneNs.fsNs.INs.URL,
    `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType
  ): js.Promise[scala.Unit] = js.native
  /**
    * Makes a new name for a file
    */
  def symlink(target: java.lang.String, path: java.lang.String): js.Promise[scala.Unit] = js.native
  def symlink(target: java.lang.String, path: java.lang.String, `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType): js.Promise[scala.Unit] = js.native
  def symlink(target: java.lang.String, path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def symlink(target: java.lang.String, path: nodeLib.Buffer, `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType): js.Promise[scala.Unit] = js.native
  def symlink(target: nodeLib.Buffer, path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Unit] = js.native
  def symlink(
    target: nodeLib.Buffer,
    path: adoneLib.adoneNs.fsNs.INs.URL,
    `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType
  ): js.Promise[scala.Unit] = js.native
  def symlink(target: nodeLib.Buffer, path: java.lang.String): js.Promise[scala.Unit] = js.native
  def symlink(target: nodeLib.Buffer, path: java.lang.String, `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType): js.Promise[scala.Unit] = js.native
  def symlink(target: nodeLib.Buffer, path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def symlink(target: nodeLib.Buffer, path: nodeLib.Buffer, `type`: adoneLib.adoneNs.fsNs.INs.SymlinkType): js.Promise[scala.Unit] = js.native
  /**
    * Returns the last lines of a file
    *
    * @param path path to a file
    * @param n number of lines to return
    */
  def tail(path: java.lang.String, n: scala.Double): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def tail(path: java.lang.String, n: scala.Double, options: Anon_ChunkLength): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  /**
    * Generates a temporary filepath
    */
  def tmpName(): js.Promise[java.lang.String] = js.native
  def tmpName(options: adoneLib.adoneNs.fsNs.INs.TmpNameOptions): js.Promise[java.lang.String] = js.native
  /**
    * Truncates file to the given length
    */
  def truncate(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def truncate(path: java.lang.String, length: scala.Double): js.Promise[scala.Unit] = js.native
  def truncate(path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def truncate(path: nodeLib.Buffer, length: scala.Double): js.Promise[scala.Unit] = js.native
  def unlink(path: adoneLib.adoneNs.fsNs.INs.URL): js.Promise[scala.Unit] = js.native
  /**
    * Deletes a name and possibly the file it refers to
    */
  def unlink(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def unlink(path: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def unlinkSync(path: adoneLib.adoneNs.fsNs.INs.URL): scala.Unit = js.native
  /**
    * Deletes a name and possibly the file it refers to
    */
  def unlinkSync(path: java.lang.String): scala.Unit = js.native
  def unlinkSync(path: nodeLib.Buffer): scala.Unit = js.native
  /**
    * Changes the file system timestamps of the object referenced by path
    */
  def utimes(
    path: java.lang.String | nodeLib.Buffer | adoneLib.adoneNs.fsNs.INs.URL,
    atime: scala.Double | java.lang.String | stdLib.Date,
    mtime: scala.Double | java.lang.String | stdLib.Date
  ): js.Promise[scala.Unit] = js.native
  def utimesMillis(path: adoneLib.adoneNs.fsNs.INs.URL, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes the file system timestamps of the object referenced by path
    */
  def utimesMillis(path: java.lang.String, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def utimesMillis(path: nodeLib.Buffer, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Changes the file system timestamps of the object referenced by path
    */
  def utimesSync(
    path: java.lang.String | nodeLib.Buffer | adoneLib.adoneNs.fsNs.INs.URL,
    atime: scala.Double | java.lang.String | stdLib.Date,
    mtime: scala.Double | java.lang.String | stdLib.Date
  ): scala.Unit = js.native
  /**
    * Creates a Watcher instance with the given options and starts watching the given paths
    */
  def watch(paths: java.lang.String): adoneLib.adoneNs.fsNs.Watcher = js.native
  def watch(paths: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions): adoneLib.adoneNs.fsNs.Watcher = js.native
  def watch(paths: js.Array[java.lang.String]): adoneLib.adoneNs.fsNs.Watcher = js.native
  def watch(paths: js.Array[java.lang.String], options: adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions): adoneLib.adoneNs.fsNs.Watcher = js.native
  /**
    * Creates a new TailWatcher instance with the given arguments
    */
  def watchTail(filename: java.lang.String): adoneLib.adoneNs.fsNs.TailWatcher = js.native
  def watchTail(filename: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.TailWatcherNs.ConstructorOptions): adoneLib.adoneNs.fsNs.TailWatcher = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def which(cmd: java.lang.String): js.Promise[java.lang.String] = js.native
  def which(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.Options): js.Promise[java.lang.String] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def which(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.OptionsAll): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def which(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.OptionsAllNothrow): js.Promise[js.Array[java.lang.String] | scala.Null] = js.native
  /**
    * Finds the first instance of a specified executable in the PATH environment variable
    */
  def which(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.OptionsNothrow): js.Promise[java.lang.String | scala.Null] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: java.lang.String): java.lang.String = js.native
  def whichSync(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.Options): java.lang.String = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.OptionsAll): js.Array[java.lang.String] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.OptionsAllNothrow): js.Array[java.lang.String] | scala.Null = js.native
  /**
    * Finds the first instance of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.WhichNs.OptionsNothrow): java.lang.String | scala.Null = js.native
  /**
    * Writes buffer to the file specified by fd
    */
  def write(fd: adoneLib.adoneNs.fsNs.INs.FD, buffer: nodeLib.Buffer): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: nodeLib.Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: nodeLib.Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: nodeLib.Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(fd: adoneLib.adoneNs.fsNs.INs.FD, buffer: stdLib.Uint8Array): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: stdLib.Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: stdLib.Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: stdLib.Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double
  ): js.Promise[scala.Double] = js.native
  /**
    * Writes string to the file specified by fd
    */
  def write(fd: adoneLib.adoneNs.fsNs.INs.FD, string: java.lang.String): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    string: java.lang.String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double
  ): js.Promise[scala.Double] = js.native
  def write(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    string: java.lang.String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double,
    /**
    * The expected string encoding
    */
  encoding: adoneLib.adoneNs.fsNs.INs.Encoding
  ): js.Promise[scala.Double] = js.native
  /**
    * Writes data to a file, replacing the file if it already exists
    */
  def writeFile(file: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: java.lang.String, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: nodeLib.Buffer, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: stdLib.Uint8Array): js.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: stdLib.Uint8Array, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: java.lang.String, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: nodeLib.Buffer, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: stdLib.Uint8Array): js.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: stdLib.Uint8Array, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: java.lang.String, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: nodeLib.Buffer, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: stdLib.Uint8Array): js.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: stdLib.Uint8Array, options: Anon_EncodingFlag): js.Promise[scala.Unit] = js.native
  def writeFileAtomic(filename: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFileAtomic(
    filename: java.lang.String,
    data: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.WriteFileAtomicOptions
  ): js.Promise[scala.Unit] = js.native
  def writeFileAtomic(filename: java.lang.String, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def writeFileAtomic(
    filename: java.lang.String,
    data: nodeLib.Buffer,
    options: adoneLib.adoneNs.fsNs.INs.WriteFileAtomicOptions
  ): js.Promise[scala.Unit] = js.native
  def writeFileAtomic(filename: java.lang.String, data: stdLib.Uint8Array): js.Promise[scala.Unit] = js.native
  def writeFileAtomic(
    filename: java.lang.String,
    data: stdLib.Uint8Array,
    options: adoneLib.adoneNs.fsNs.INs.WriteFileAtomicOptions
  ): js.Promise[scala.Unit] = js.native
  /**
    * Writes data to a file, replacing the file if it already exists
    */
  def writeFileSync(file: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def writeFileSync(file: java.lang.String, data: java.lang.String, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: java.lang.String, data: nodeLib.Buffer): scala.Unit = js.native
  def writeFileSync(file: java.lang.String, data: nodeLib.Buffer, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: java.lang.String, data: stdLib.Uint8Array): scala.Unit = js.native
  def writeFileSync(file: java.lang.String, data: stdLib.Uint8Array, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: nodeLib.Buffer, data: java.lang.String): scala.Unit = js.native
  def writeFileSync(file: nodeLib.Buffer, data: java.lang.String, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: nodeLib.Buffer, data: nodeLib.Buffer): scala.Unit = js.native
  def writeFileSync(file: nodeLib.Buffer, data: nodeLib.Buffer, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: nodeLib.Buffer, data: stdLib.Uint8Array): scala.Unit = js.native
  def writeFileSync(file: nodeLib.Buffer, data: stdLib.Uint8Array, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: scala.Double, data: java.lang.String): scala.Unit = js.native
  def writeFileSync(file: scala.Double, data: java.lang.String, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: scala.Double, data: nodeLib.Buffer): scala.Unit = js.native
  def writeFileSync(file: scala.Double, data: nodeLib.Buffer, options: Anon_EncodingFlag): scala.Unit = js.native
  def writeFileSync(file: scala.Double, data: stdLib.Uint8Array): scala.Unit = js.native
  def writeFileSync(file: scala.Double, data: stdLib.Uint8Array, options: Anon_EncodingFlag): scala.Unit = js.native
  /**
    * Writes buffer to the file specified by fd
    */
  def writeSync(fd: adoneLib.adoneNs.fsNs.INs.FD, buffer: nodeLib.Buffer): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: nodeLib.Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: nodeLib.Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: nodeLib.Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double
  ): scala.Double = js.native
  def writeSync(fd: adoneLib.adoneNs.fsNs.INs.FD, buffer: stdLib.Uint8Array): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: stdLib.Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: stdLib.Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    buffer: stdLib.Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: scala.Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: scala.Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double
  ): scala.Double = js.native
  /**
    * Writes string to the file specified by fd
    */
  def writeSync(fd: adoneLib.adoneNs.fsNs.INs.FD, string: java.lang.String): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    string: java.lang.String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double
  ): scala.Double = js.native
  def writeSync(
    fd: adoneLib.adoneNs.fsNs.INs.FD,
    string: java.lang.String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: scala.Double,
    /**
    * The expected string encoding
    */
  encoding: adoneLib.adoneNs.fsNs.INs.Encoding
  ): scala.Double = js.native
}

