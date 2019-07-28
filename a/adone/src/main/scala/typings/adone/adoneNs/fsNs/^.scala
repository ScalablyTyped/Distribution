package typings.adone.adoneNs.fsNs

import typings.adone.Anon_BufferEncoding
import typings.adone.Anon_Check
import typings.adone.Anon_CheckEncoding
import typings.adone.Anon_CheckEncodingFalse
import typings.adone.Anon_CheckEncodingFlags
import typings.adone.Anon_CheckTrue
import typings.adone.Anon_ChunkLength
import typings.adone.Anon_Cwd
import typings.adone.Anon_CwdFilename
import typings.adone.Anon_Delay
import typings.adone.Anon_Encoding
import typings.adone.Anon_EncodingFlag
import typings.adone.Anon_EncodingOptional
import typings.adone.Anon_Encoding_1429386911
import typings.adone.adoneNs.fsNs.INs.CopyOptions
import typings.adone.adoneNs.fsNs.INs.CopyToOptions
import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.adone.adoneNs.fsNs.INs.FD
import typings.adone.adoneNs.fsNs.INs.Flag
import typings.adone.adoneNs.fsNs.INs.GlobNs.GlobFunction
import typings.adone.adoneNs.fsNs.INs.ReadFileOptions
import typings.adone.adoneNs.fsNs.INs.ReadStream
import typings.adone.adoneNs.fsNs.INs.ReadStreamOptions
import typings.adone.adoneNs.fsNs.INs.ReadStreamOptionsFD
import typings.adone.adoneNs.fsNs.INs.ReaddirpEntry
import typings.adone.adoneNs.fsNs.INs.ReaddirpOptions
import typings.adone.adoneNs.fsNs.INs.StatVFS
import typings.adone.adoneNs.fsNs.INs.Stats
import typings.adone.adoneNs.fsNs.INs.SymlinkType
import typings.adone.adoneNs.fsNs.INs.TmpNameOptions
import typings.adone.adoneNs.fsNs.INs.URL
import typings.adone.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions
import typings.adone.adoneNs.fsNs.INs.WhichNs.Options
import typings.adone.adoneNs.fsNs.INs.WhichNs.OptionsAll
import typings.adone.adoneNs.fsNs.INs.WhichNs.OptionsAllNothrow
import typings.adone.adoneNs.fsNs.INs.WhichNs.OptionsNothrow
import typings.adone.adoneNs.fsNs.INs.WriteFileAtomicOptions
import typings.adone.adoneNs.fsNs.INs.WriteStream
import typings.adone.adoneNs.fsNs.INs.WriteStreamOptions
import typings.adone.adoneNs.fsNs.INs.WriteStreamOptionsFD
import typings.adone.adoneNs.streamNs.coreNs.Stream
import typings.adone.adoneStrings.buffer
import typings.adone.adoneStrings.ex
import typings.adone.adoneStrings.exnb
import typings.adone.adoneStrings.sh
import typings.adone.adoneStrings.shnb
import typings.adone.adoneStrings.un
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fs")
@js.native
object ^ extends js.Object {
  /**
    * Creates a glob stream
    */
  val glob: GlobFunction = js.native
  /**
    * Tests a user's permissions for the file or directory specified by path
    */
  def access(file: String): js.Promise[Unit] = js.native
  def access(file: String, mode: Double): js.Promise[Unit] = js.native
  def access(file: URL): js.Promise[Unit] = js.native
  def access(file: URL, mode: Double): js.Promise[Unit] = js.native
  def access(file: Buffer): js.Promise[Unit] = js.native
  def access(file: Buffer, mode: Double): js.Promise[Unit] = js.native
  /**
    * Tests a user's permissions for the file or directory specified by path
    */
  def accessSync(file: String): Unit = js.native
  def accessSync(file: String, mode: Double): Unit = js.native
  def accessSync(file: URL): Unit = js.native
  def accessSync(file: URL, mode: Double): Unit = js.native
  def accessSync(file: Buffer): Unit = js.native
  def accessSync(file: Buffer, mode: Double): Unit = js.native
  /**
    * Appends data to a file, creating the file if it does not yet exist
    */
  def appendFile(file: String, data: String): js.Promise[Unit] = js.native
  def appendFile(file: String, data: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def appendFile(file: String, data: Buffer): js.Promise[Unit] = js.native
  def appendFile(file: String, data: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def appendFile(file: Double, data: String): js.Promise[Unit] = js.native
  def appendFile(file: Double, data: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def appendFile(file: Double, data: Buffer): js.Promise[Unit] = js.native
  def appendFile(file: Double, data: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def appendFile(file: Buffer, data: String): js.Promise[Unit] = js.native
  def appendFile(file: Buffer, data: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def appendFile(file: Buffer, data: Buffer): js.Promise[Unit] = js.native
  def appendFile(file: Buffer, data: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  /**
    * Appends data to a file, creating the file if it does not yet exist
    */
  def appendFileSync(file: String, data: String): Unit = js.native
  def appendFileSync(file: String, data: String, options: Anon_EncodingFlag): Unit = js.native
  def appendFileSync(file: String, data: Buffer): Unit = js.native
  def appendFileSync(file: String, data: Buffer, options: Anon_EncodingFlag): Unit = js.native
  def appendFileSync(file: Double, data: String): Unit = js.native
  def appendFileSync(file: Double, data: String, options: Anon_EncodingFlag): Unit = js.native
  def appendFileSync(file: Double, data: Buffer): Unit = js.native
  def appendFileSync(file: Double, data: Buffer, options: Anon_EncodingFlag): Unit = js.native
  def appendFileSync(file: Buffer, data: String): Unit = js.native
  def appendFileSync(file: Buffer, data: String, options: Anon_EncodingFlag): Unit = js.native
  def appendFileSync(file: Buffer, data: Buffer): Unit = js.native
  def appendFileSync(file: Buffer, data: Buffer, options: Anon_EncodingFlag): Unit = js.native
  /**
    * Changes permissions of a file
    */
  def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmod(path: URL, mode: Double): js.Promise[Unit] = js.native
  def chmod(path: Buffer, mode: Double): js.Promise[Unit] = js.native
  /**
    * Changes ownership of a file
    */
  def chown(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def chown(path: URL, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def chown(path: Buffer, uid: Double, gid: Double): js.Promise[Unit] = js.native
  /**
    * Changes ownership recursively for a given path
    */
  def chownr(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def chownr(path: URL, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def chownr(path: Buffer, uid: Double, gid: Double): js.Promise[Unit] = js.native
  /**
    * Closes a file descriptor
    */
  def close(fd: FD): js.Promise[Unit] = js.native
  /**
    * Closes a file descriptor
    */
  def closeSync(fd: FD): Unit = js.native
  /**
    * Recursively copies all the files from src to dst
    */
  def copy(src: String, dst: String): js.Promise[Unit] = js.native
  def copy(src: String, dst: String, options: CopyOptions): js.Promise[Unit] = js.native
  /**
    * Copies all files from src to dst
    */
  def copyTo(src: String, dst: String): js.Promise[Unit] = js.native
  def copyTo(src: String, dst: String, options: CopyToOptions): js.Promise[Unit] = js.native
  def createReadStream(path: js.UndefOr[scala.Nothing], options: ReadStreamOptionsFD): ReadStream = js.native
  def createReadStream(path: String): ReadStream = js.native
  def createReadStream(path: String, encoding: Encoding): ReadStream = js.native
  def createReadStream(path: String, options: ReadStreamOptions): ReadStream = js.native
  /**
    * Returns a read stream for the given file
    */
  def createReadStream(path: Null, options: ReadStreamOptionsFD): ReadStream = js.native
  def createReadStream(path: URL): ReadStream = js.native
  def createReadStream(path: URL, encoding: Encoding): ReadStream = js.native
  def createReadStream(path: URL, options: ReadStreamOptions): ReadStream = js.native
  def createReadStream(path: Buffer): ReadStream = js.native
  def createReadStream(path: Buffer, encoding: Encoding): ReadStream = js.native
  def createReadStream(path: Buffer, options: ReadStreamOptions): ReadStream = js.native
  def createWriteStream(path: js.UndefOr[scala.Nothing], options: WriteStreamOptionsFD): WriteStream = js.native
  def createWriteStream(path: String): WriteStream = js.native
  def createWriteStream(path: String, encoding: Encoding): WriteStream = js.native
  def createWriteStream(path: String, options: WriteStreamOptions): WriteStream = js.native
  /**
    * Returns a write stream to the given file
    */
  def createWriteStream(path: Null, options: WriteStreamOptionsFD): WriteStream = js.native
  def createWriteStream(path: URL): WriteStream = js.native
  def createWriteStream(path: URL, encoding: Encoding): WriteStream = js.native
  def createWriteStream(path: URL, options: WriteStreamOptions): WriteStream = js.native
  def createWriteStream(path: Buffer): WriteStream = js.native
  def createWriteStream(path: Buffer, encoding: Encoding): WriteStream = js.native
  def createWriteStream(path: Buffer, options: WriteStreamOptions): WriteStream = js.native
  /**
    * Checks whether a file exists
    */
  def exists(path: String): js.Promise[Boolean] = js.native
  def exists(path: URL): js.Promise[Boolean] = js.native
  def exists(path: Buffer): js.Promise[Boolean] = js.native
  /**
    * Checks whether a file exists
    */
  def existsSync(path: String): Boolean = js.native
  def existsSync(path: URL): Boolean = js.native
  def existsSync(path: Buffer): Boolean = js.native
  /**
    * Changes permissions of a file
    */
  def fchmod(fd: FD, mode: Double): js.Promise[Unit] = js.native
  /**
    * Changes permissions of a file
    */
  def fchmodSync(fd: FD, mode: Double): Unit = js.native
  /**
    * Changes ownership of a file
    */
  def fchown(fd: FD, uid: Double, gid: Double): js.Promise[Unit] = js.native
  /**
    * Changes ownership of a file
    */
  def fchownSync(fd: FD, uid: Double, gid: Double): Unit = js.native
  def flock(fd: FD, flags: Double): js.Promise[Unit] = js.native
  @JSName("flock")
  def flock_ex(fd: FD, flags: ex): js.Promise[Unit] = js.native
  @JSName("flock")
  def flock_exnb(fd: FD, flags: exnb): js.Promise[Unit] = js.native
  /**
    * Applies or removes an advisory lock on an open file
    */
  @JSName("flock")
  def flock_sh(fd: FD, flags: sh): js.Promise[Unit] = js.native
  @JSName("flock")
  def flock_shnb(fd: FD, flags: shnb): js.Promise[Unit] = js.native
  @JSName("flock")
  def flock_un(fd: FD, flags: un): js.Promise[Unit] = js.native
  /**
    * Gets file status
    */
  def fstat(fd: FD): js.Promise[Stats] = js.native
  /**
    * Gets file status
    */
  def fstatSync(fd: FD): Stats = js.native
  /**
    * Synchronizes a file's in-core state with storage
    */
  def fsync(fd: FD): js.Promise[Unit] = js.native
  /**
    * Synchronizes a file's in-core state with storage
    */
  def fsyncSync(fd: FD): Unit = js.native
  /**
    * Truncates a file to a specified length
    */
  def ftruncate(fd: FD): js.Promise[Unit] = js.native
  def ftruncate(fd: FD, length: Double): js.Promise[Unit] = js.native
  /**
    * Truncates a file to a specified length
    */
  def ftruncateSync(fd: FD): Unit = js.native
  def ftruncateSync(fd: FD, length: Double): Unit = js.native
  /**
    * Changes the file timestamps of a file referenced by the supplied file descriptor
    */
  def futimes(fd: FD, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  /**
    * Changes the file timestamps of a file referenced by the supplied file descriptor
    */
  def futimesSync(fd: FD, atime: Double, mtime: Double): Unit = js.native
  /**
    * Returns the current user homedir
    */
  def homeDir(): String = js.native
  /**
    * Returns true if the given path refers to a direcotry
    */
  def isDirectory(path: String): js.Promise[Boolean] = js.native
  /**
    * Returns true if the given path refers to a direcotry
    */
  def isDirectorySync(path: String): Boolean = js.native
  /**
    * Returns true if the given path refers to an executable file
    */
  def isExecutable(path: String): js.Promise[Boolean] = js.native
  /**
    * Returns true if the given path refers to an executable file
    */
  def isExecutableSync(path: String): Boolean = js.native
  /**
    * Returns true if the given path refers to a file
    */
  def isFile(path: String): js.Promise[Boolean] = js.native
  /**
    * Returns true if the given path refers to a file
    */
  def isFileSync(path: String): Boolean = js.native
  /**
    * TODO
    */
  def lookup(path: String): js.Promise[String] = js.native
  /**
    * Gets file status, identical to stat, except that if pathname is a symbolic link,
    * then it returns information about the link itself, not the file that it refers to
    */
  def lstat(path: String): js.Promise[Stats] = js.native
  def lstat(path: URL): js.Promise[Stats] = js.native
  def lstat(path: Buffer): js.Promise[Stats] = js.native
  /**
    * Gets file status, identical to stat, except that if pathname is a symbolic link,
    * then it returns information about the link itself, not the file that it refers to
    */
  def lstatSync(path: String): Stats = js.native
  def lstatSync(path: URL): Stats = js.native
  def lstatSync(path: Buffer): Stats = js.native
  /**
    * Creates a new directory
    */
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(path: String, mode: Double): js.Promise[Unit] = js.native
  /**
    * Creates a new directory
    */
  def mkdirSync(path: String): js.Promise[Unit] = js.native
  def mkdirSync(path: String, mode: Double): js.Promise[Unit] = js.native
  /**
    * Creates a new directory and any necessary subdirectories
    */
  def mkdirp(path: String): js.Promise[Unit] = js.native
  def mkdirp(path: String, mode: Double): js.Promise[Unit] = js.native
  /**
    * Creates a new directory and any necessary subdirectories
    */
  def mkdirpSync(path: String): js.Promise[Unit] = js.native
  def mkdirpSync(path: String, mode: Double): js.Promise[Unit] = js.native
  def open(path: String, flags: Double): js.Promise[FD] = js.native
  def open(path: String, flags: Double, mode: Double): js.Promise[FD] = js.native
  /**
    * Opens and possibly creates a file
    */
  def open(path: String, flags: Flag): js.Promise[FD] = js.native
  def open(path: String, flags: Flag, mode: Double): js.Promise[FD] = js.native
  def open(path: URL, flags: Double): js.Promise[FD] = js.native
  def open(path: URL, flags: Double, mode: Double): js.Promise[FD] = js.native
  def open(path: URL, flags: Flag): js.Promise[FD] = js.native
  def open(path: URL, flags: Flag, mode: Double): js.Promise[FD] = js.native
  def open(path: Buffer, flags: Double): js.Promise[FD] = js.native
  def open(path: Buffer, flags: Double, mode: Double): js.Promise[FD] = js.native
  def open(path: Buffer, flags: Flag): js.Promise[FD] = js.native
  def open(path: Buffer, flags: Flag, mode: Double): js.Promise[FD] = js.native
  def openSync(path: String, flags: Double): FD = js.native
  def openSync(path: String, flags: Double, mode: Double): FD = js.native
  /**
    * Opens and possibly creates a file
    */
  def openSync(path: String, flags: Flag): FD = js.native
  def openSync(path: String, flags: Flag, mode: Double): FD = js.native
  def openSync(path: URL, flags: Double): FD = js.native
  def openSync(path: URL, flags: Double, mode: Double): FD = js.native
  def openSync(path: URL, flags: Flag): FD = js.native
  def openSync(path: URL, flags: Flag, mode: Double): FD = js.native
  def openSync(path: Buffer, flags: Double): FD = js.native
  def openSync(path: Buffer, flags: Double, mode: Double): FD = js.native
  def openSync(path: Buffer, flags: Flag): FD = js.native
  def openSync(path: Buffer, flags: Flag, mode: Double): FD = js.native
  /**
    * Read data from the file specified by fd
    */
  def read(
    fd: FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: Buffer,
    /**
    * The offset in the buffer to start writing at
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: Double
  ): js.Promise[Double] = js.native
  def read(
    fd: FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: Uint8Array,
    /**
    * The offset in the buffer to start writing at
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: Double
  ): js.Promise[Double] = js.native
  def readFile(filepath: String): js.Promise[Buffer] = js.native
  def readFile(filepath: String, encoding: Encoding): js.Promise[String] = js.native
  /**
    * Reads a file
    */
  def readFile(
    filepath: String,
    options: (ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue | Anon_Encoding | Anon_Encoding_1429386911)) | ReadFileOptions
  ): js.Promise[Buffer | Null] = js.native
  def readFile(filepath: URL): js.Promise[Buffer] = js.native
  def readFile(filepath: URL, encoding: Encoding): js.Promise[String] = js.native
  def readFile(
    filepath: URL,
    options: (ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue | Anon_Encoding | Anon_Encoding_1429386911)) | ReadFileOptions
  ): js.Promise[Buffer | Null] = js.native
  def readFile(filepath: Buffer): js.Promise[Buffer] = js.native
  def readFile(filepath: Buffer, encoding: Encoding): js.Promise[String] = js.native
  def readFile(
    filepath: Buffer,
    options: (ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue | Anon_Encoding | Anon_Encoding_1429386911)) | ReadFileOptions
  ): js.Promise[Buffer | Null] = js.native
  def readFileSync(filepath: String): Buffer = js.native
  def readFileSync(filepath: String, encoding: Encoding): String = js.native
  def readFileSync(filepath: String, options: (ReadFileOptions with Anon_Encoding) | ReadFileOptions): Buffer = js.native
  def readFileSync(filepath: URL): Buffer = js.native
  def readFileSync(filepath: URL, encoding: Encoding): String = js.native
  def readFileSync(filepath: URL, options: (ReadFileOptions with Anon_Encoding) | ReadFileOptions): Buffer = js.native
  def readFileSync(filepath: Buffer): Buffer = js.native
  def readFileSync(filepath: Buffer, encoding: Encoding): String = js.native
  def readFileSync(filepath: Buffer, options: (ReadFileOptions with Anon_Encoding) | ReadFileOptions): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_String(filepath: String, options: ReadFileOptions with Anon_Encoding_1429386911): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(filepath: URL, options: ReadFileOptions with Anon_Encoding_1429386911): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(filepath: Buffer, options: ReadFileOptions with Anon_Encoding_1429386911): String = js.native
  /**
    * Reads a file
    */
  @JSName("readFileSync")
  def readFileSync_Union(filepath: String, options: ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue)): Buffer | Null = js.native
  @JSName("readFileSync")
  def readFileSync_Union(filepath: URL, options: ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue)): Buffer | Null = js.native
  @JSName("readFileSync")
  def readFileSync_Union(filepath: Buffer, options: ReadFileOptions with (Anon_Check | Anon_CheckEncoding | Anon_CheckTrue)): Buffer | Null = js.native
  def readLines(filepath: String): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: String, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: String, options: Anon_CheckEncodingFalse): js.Promise[js.Array[String]] = js.native
  /**
    * Reads lines from a file
    */
  def readLines(filepath: String, options: Anon_CheckEncodingFlags): js.Promise[js.Array[String] | Null] = js.native
  def readLines(filepath: URL): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: URL, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: URL, options: Anon_CheckEncodingFalse): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: URL, options: Anon_CheckEncodingFlags): js.Promise[js.Array[String] | Null] = js.native
  def readLines(filepath: Buffer): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: Buffer, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: Buffer, options: Anon_CheckEncodingFalse): js.Promise[js.Array[String]] = js.native
  def readLines(filepath: Buffer, options: Anon_CheckEncodingFlags): js.Promise[js.Array[String] | Null] = js.native
  def readLinesSync(filepath: String): js.Array[String] = js.native
  def readLinesSync(filepath: String, encoding: Encoding): js.Array[String] = js.native
  def readLinesSync(filepath: String, options: Anon_CheckEncodingFalse): js.Array[String] = js.native
  /**
    * Reads lines from a file
    */
  def readLinesSync(filepath: String, options: Anon_CheckEncodingFlags): js.Array[String] | Null = js.native
  def readLinesSync(filepath: URL): js.Array[String] = js.native
  def readLinesSync(filepath: URL, encoding: Encoding): js.Array[String] = js.native
  def readLinesSync(filepath: URL, options: Anon_CheckEncodingFalse): js.Array[String] = js.native
  def readLinesSync(filepath: URL, options: Anon_CheckEncodingFlags): js.Array[String] | Null = js.native
  def readLinesSync(filepath: Buffer): js.Array[String] = js.native
  def readLinesSync(filepath: Buffer, encoding: Encoding): js.Array[String] = js.native
  def readLinesSync(filepath: Buffer, options: Anon_CheckEncodingFalse): js.Array[String] = js.native
  def readLinesSync(filepath: Buffer, options: Anon_CheckEncodingFlags): js.Array[String] | Null = js.native
  def readSync(
    fd: FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: Buffer,
    /**
    * The offset in the buffer to start writing at
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: Double
  ): Double = js.native
  def readSync(
    fd: FD,
    /**
    * The buffer that the data will be written to
    */
  buffer: Uint8Array,
    /**
    * The offset in the buffer to start writing at
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to read
    */
  length: Double,
    /**
    * An argument specifying where to begin reading from in the file
    */
  position: Double
  ): Double = js.native
  def readWords(filepath: String): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: String, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: String, options: Anon_CheckEncodingFalse): js.Promise[js.Array[String]] = js.native
  /**
    * Reads words from a file
    */
  def readWords(filepath: String, options: Anon_CheckEncodingFlags): js.Promise[js.Array[String] | Null] = js.native
  def readWords(filepath: URL): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: URL, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: URL, options: Anon_CheckEncodingFalse): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: URL, options: Anon_CheckEncodingFlags): js.Promise[js.Array[String] | Null] = js.native
  def readWords(filepath: Buffer): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: Buffer, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: Buffer, options: Anon_CheckEncodingFalse): js.Promise[js.Array[String]] = js.native
  def readWords(filepath: Buffer, options: Anon_CheckEncodingFlags): js.Promise[js.Array[String] | Null] = js.native
  def readWordsSync(filepath: String): js.Array[String] = js.native
  def readWordsSync(filepath: String, encoding: Encoding): js.Array[String] = js.native
  def readWordsSync(filepath: String, options: Anon_CheckEncodingFalse): js.Array[String] = js.native
  /**
    * Reads words from a file
    */
  def readWordsSync(filepath: String, options: Anon_CheckEncodingFlags): js.Array[String] | Null = js.native
  def readWordsSync(filepath: URL): js.Array[String] = js.native
  def readWordsSync(filepath: URL, encoding: Encoding): js.Array[String] = js.native
  def readWordsSync(filepath: URL, options: Anon_CheckEncodingFalse): js.Array[String] = js.native
  def readWordsSync(filepath: URL, options: Anon_CheckEncodingFlags): js.Array[String] | Null = js.native
  def readWordsSync(filepath: Buffer): js.Array[String] = js.native
  def readWordsSync(filepath: Buffer, encoding: Encoding): js.Array[String] = js.native
  def readWordsSync(filepath: Buffer, options: Anon_CheckEncodingFalse): js.Array[String] = js.native
  def readWordsSync(filepath: Buffer, options: Anon_CheckEncodingFlags): js.Array[String] | Null = js.native
  /**
    * Reads a directory
    */
  def readdir(path: String): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: String, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readdir(path: String, options: Anon_Encoding): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: String, options: Anon_EncodingOptional): js.Promise[js.Array[String]] = js.native
  def readdir(path: URL): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: URL, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readdir(path: URL, options: Anon_Encoding): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: URL, options: Anon_EncodingOptional): js.Promise[js.Array[String]] = js.native
  def readdir(path: Buffer): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: Buffer, encoding: Encoding): js.Promise[js.Array[String]] = js.native
  def readdir(path: Buffer, options: Anon_Encoding): js.Promise[js.Array[Buffer]] = js.native
  def readdir(path: Buffer, options: Anon_EncodingOptional): js.Promise[js.Array[String]] = js.native
  /**
    * Reads a directory
    */
  def readdirSync(path: String): js.Array[Buffer] = js.native
  def readdirSync(path: String, encoding: Encoding): js.Array[String] = js.native
  def readdirSync(path: String, options: Anon_Encoding): js.Array[Buffer] = js.native
  def readdirSync(path: String, options: Anon_EncodingOptional): js.Array[String] = js.native
  def readdirSync(path: URL): js.Array[Buffer] = js.native
  def readdirSync(path: URL, encoding: Encoding): js.Array[String] = js.native
  def readdirSync(path: URL, options: Anon_Encoding): js.Array[Buffer] = js.native
  def readdirSync(path: URL, options: Anon_EncodingOptional): js.Array[String] = js.native
  def readdirSync(path: Buffer): js.Array[Buffer] = js.native
  def readdirSync(path: Buffer, encoding: Encoding): js.Array[String] = js.native
  def readdirSync(path: Buffer, options: Anon_Encoding): js.Array[Buffer] = js.native
  def readdirSync(path: Buffer, options: Anon_EncodingOptional): js.Array[String] = js.native
  /**
    * Traverses the given path
    */
  def readdirp(root: String): Stream[scala.Nothing, ReaddirpEntry] = js.native
  def readdirp(root: String, options: ReaddirpOptions): Stream[scala.Nothing, ReaddirpEntry] = js.native
  def readdirp(root: URL): Stream[scala.Nothing, ReaddirpEntry] = js.native
  def readdirp(root: URL, options: ReaddirpOptions): Stream[scala.Nothing, ReaddirpEntry] = js.native
  def readdirp(root: Buffer): Stream[scala.Nothing, ReaddirpEntry] = js.native
  def readdirp(root: Buffer, options: ReaddirpOptions): Stream[scala.Nothing, ReaddirpEntry] = js.native
  /**
    * Reads the value of a symbolic link
    */
  def readlink(path: String): js.Promise[Buffer] = js.native
  def readlink(path: String, encoding: Encoding): js.Promise[String] = js.native
  def readlink(path: String, options: Anon_Encoding): js.Promise[Buffer] = js.native
  def readlink(path: String, options: Anon_EncodingOptional): js.Promise[String] = js.native
  def readlink(path: URL): js.Promise[Buffer] = js.native
  def readlink(path: URL, encoding: Encoding): js.Promise[String] = js.native
  def readlink(path: URL, options: Anon_Encoding): js.Promise[Buffer] = js.native
  def readlink(path: URL, options: Anon_EncodingOptional): js.Promise[String] = js.native
  def readlink(path: Buffer): js.Promise[Buffer] = js.native
  def readlink(path: Buffer, encoding: Encoding): js.Promise[String] = js.native
  def readlink(path: Buffer, options: Anon_Encoding): js.Promise[Buffer] = js.native
  def readlink(path: Buffer, options: Anon_EncodingOptional): js.Promise[String] = js.native
  /**
    * Reads the value of a symbolic link
    */
  def readlinkSync(path: String): Buffer = js.native
  def readlinkSync(path: String, encoding: Encoding): String = js.native
  def readlinkSync(path: String, options: Anon_Encoding): Buffer = js.native
  def readlinkSync(path: String, options: Anon_EncodingOptional): String = js.native
  def readlinkSync(path: URL): Buffer = js.native
  def readlinkSync(path: URL, encoding: Encoding): String = js.native
  def readlinkSync(path: URL, options: Anon_Encoding): Buffer = js.native
  def readlinkSync(path: URL, options: Anon_EncodingOptional): String = js.native
  def readlinkSync(path: Buffer): Buffer = js.native
  def readlinkSync(path: Buffer, encoding: Encoding): String = js.native
  def readlinkSync(path: Buffer, options: Anon_Encoding): Buffer = js.native
  def readlinkSync(path: Buffer, options: Anon_EncodingOptional): String = js.native
  @JSName("readlinkSync")
  def readlinkSync_String(path: String): String = js.native
  @JSName("readlinkSync")
  def readlinkSync_String(path: URL): String = js.native
  @JSName("readlinkSync")
  def readlinkSync_String(path: Buffer): String = js.native
  def realpath(path: String): js.Promise[String] = js.native
  def realpath(path: String, encoding: Encoding): js.Promise[String] = js.native
  def realpath(path: String, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def realpath(path: String, options: Anon_EncodingOptional): js.Promise[String] = js.native
  def realpath(path: URL): js.Promise[String] = js.native
  def realpath(path: URL, encoding: Encoding): js.Promise[String] = js.native
  def realpath(path: URL, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def realpath(path: URL, options: Anon_EncodingOptional): js.Promise[String] = js.native
  def realpath(path: Buffer): js.Promise[String] = js.native
  def realpath(path: Buffer, encoding: Encoding): js.Promise[String] = js.native
  def realpath(path: Buffer, options: Anon_BufferEncoding): js.Promise[Buffer] = js.native
  def realpath(path: Buffer, options: Anon_EncodingOptional): js.Promise[String] = js.native
  def realpathSync(path: String): String = js.native
  def realpathSync(path: String, encoding: Encoding): String = js.native
  def realpathSync(path: String, options: Anon_BufferEncoding): Buffer = js.native
  def realpathSync(path: String, options: Anon_EncodingOptional): String = js.native
  def realpathSync(path: URL): String = js.native
  def realpathSync(path: URL, encoding: Encoding): String = js.native
  def realpathSync(path: URL, options: Anon_BufferEncoding): Buffer = js.native
  def realpathSync(path: URL, options: Anon_EncodingOptional): String = js.native
  def realpathSync(path: Buffer): String = js.native
  def realpathSync(path: Buffer, encoding: Encoding): String = js.native
  def realpathSync(path: Buffer, options: Anon_BufferEncoding): Buffer = js.native
  def realpathSync(path: Buffer, options: Anon_EncodingOptional): String = js.native
  /**
    * Returns the canonicalized absolute pathname
    */
  @JSName("realpathSync")
  def realpathSync_buffer(path: String, encoding: buffer): Buffer = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: URL, encoding: buffer): Buffer = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: Buffer, encoding: buffer): Buffer = js.native
  /**
    * Returns the canonicalized absolute pathname
    */
  @JSName("realpath")
  def realpath_buffer(path: String, encoding: buffer): js.Promise[Buffer] = js.native
  @JSName("realpath")
  def realpath_buffer(path: URL, encoding: buffer): js.Promise[Buffer] = js.native
  @JSName("realpath")
  def realpath_buffer(path: Buffer, encoding: buffer): js.Promise[Buffer] = js.native
  /**
    * Renames a file
    */
  def rename(oldPath: String, newPath: String): js.Promise[Unit] = js.native
  def rename(oldPath: String, newPath: String, options: Anon_Delay): js.Promise[Unit] = js.native
  /**
    * Recursively deletes the given path, that can be a glob pattern
    */
  def rm(path: String): js.Promise[Unit] = js.native
  def rm(path: String, options: Anon_Cwd): js.Promise[Unit] = js.native
  /**
    * Recursively deletes empty directiries inside the given directory
    */
  def rmEmpty(path: String): js.Promise[Unit] = js.native
  def rmEmpty(path: String, options: Anon_CwdFilename): js.Promise[Unit] = js.native
  /**
    * Deletes a directory
    */
  def rmdir(path: String): js.Promise[Unit] = js.native
  def rmdir(path: URL): js.Promise[Unit] = js.native
  def rmdir(path: Buffer): js.Promise[Unit] = js.native
  /**
    * Repositions read/write file offset
    */
  def seek(fd: FD, offset: Double, whence: Double): js.Promise[Double] = js.native
  /**
    * Gets file status
    */
  def stat(path: String): js.Promise[Stats] = js.native
  def stat(path: URL): js.Promise[Stats] = js.native
  def stat(path: Buffer): js.Promise[Stats] = js.native
  /**
    * Gets file status
    */
  def statSync(path: String): Stats = js.native
  def statSync(path: URL): Stats = js.native
  def statSync(path: Buffer): Stats = js.native
  /**
    * Returns information about a mounted file system
    */
  def statVFS(path: String): js.Promise[StatVFS] = js.native
  /**
    * Makes a new name for a file
    */
  def symlink(target: String, path: String): js.Promise[Unit] = js.native
  def symlink(target: String, path: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: String, path: URL): js.Promise[Unit] = js.native
  def symlink(target: String, path: URL, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: String, path: Buffer): js.Promise[Unit] = js.native
  def symlink(target: String, path: Buffer, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: URL, path: String): js.Promise[Unit] = js.native
  def symlink(target: URL, path: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: URL, path: URL): js.Promise[Unit] = js.native
  def symlink(target: URL, path: URL, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: URL, path: Buffer): js.Promise[Unit] = js.native
  def symlink(target: URL, path: Buffer, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: Buffer, path: String): js.Promise[Unit] = js.native
  def symlink(target: Buffer, path: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: Buffer, path: URL): js.Promise[Unit] = js.native
  def symlink(target: Buffer, path: URL, `type`: SymlinkType): js.Promise[Unit] = js.native
  def symlink(target: Buffer, path: Buffer): js.Promise[Unit] = js.native
  def symlink(target: Buffer, path: Buffer, `type`: SymlinkType): js.Promise[Unit] = js.native
  /**
    * Returns the last lines of a file
    *
    * @param path path to a file
    * @param n number of lines to return
    */
  def tail(path: String, n: Double): js.Promise[js.Array[Buffer]] = js.native
  def tail(path: String, n: Double, options: Anon_ChunkLength): js.Promise[js.Array[Buffer]] = js.native
  /**
    * Generates a temporary filepath
    */
  def tmpName(): js.Promise[String] = js.native
  def tmpName(options: TmpNameOptions): js.Promise[String] = js.native
  /**
    * Truncates file to the given length
    */
  def truncate(path: String): js.Promise[Unit] = js.native
  def truncate(path: String, length: Double): js.Promise[Unit] = js.native
  def truncate(path: Buffer): js.Promise[Unit] = js.native
  def truncate(path: Buffer, length: Double): js.Promise[Unit] = js.native
  /**
    * Deletes a name and possibly the file it refers to
    */
  def unlink(path: String): js.Promise[Unit] = js.native
  def unlink(path: URL): js.Promise[Unit] = js.native
  def unlink(path: Buffer): js.Promise[Unit] = js.native
  /**
    * Deletes a name and possibly the file it refers to
    */
  def unlinkSync(path: String): Unit = js.native
  def unlinkSync(path: URL): Unit = js.native
  def unlinkSync(path: Buffer): Unit = js.native
  /**
    * Changes the file system timestamps of the object referenced by path
    */
  def utimes(
    path: String | Buffer | URL,
    atime: Double | String | typings.std.Date,
    mtime: Double | String | typings.std.Date
  ): js.Promise[Unit] = js.native
  /**
    * Changes the file system timestamps of the object referenced by path
    */
  def utimesMillis(path: String, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def utimesMillis(path: URL, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def utimesMillis(path: Buffer, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  /**
    * Changes the file system timestamps of the object referenced by path
    */
  def utimesSync(
    path: String | Buffer | URL,
    atime: Double | String | typings.std.Date,
    mtime: Double | String | typings.std.Date
  ): Unit = js.native
  /**
    * Creates a Watcher instance with the given options and starts watching the given paths
    */
  def watch(paths: String): Watcher = js.native
  def watch(paths: String, options: ConstructorOptions): Watcher = js.native
  def watch(paths: js.Array[String]): Watcher = js.native
  def watch(paths: js.Array[String], options: ConstructorOptions): Watcher = js.native
  /**
    * Creates a new TailWatcher instance with the given arguments
    */
  def watchTail(filename: String): TailWatcher = js.native
  def watchTail(filename: String, options: typings.adone.adoneNs.fsNs.INs.TailWatcherNs.ConstructorOptions): TailWatcher = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def which(cmd: String): js.Promise[String] = js.native
  def which(cmd: String, options: Options): js.Promise[String] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def which(cmd: String, options: OptionsAll): js.Promise[js.Array[String]] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def which(cmd: String, options: OptionsAllNothrow): js.Promise[js.Array[String] | Null] = js.native
  /**
    * Finds the first instance of a specified executable in the PATH environment variable
    */
  def which(cmd: String, options: OptionsNothrow): js.Promise[String | Null] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: String): String = js.native
  def whichSync(cmd: String, options: Options): String = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: String, options: OptionsAll): js.Array[String] = js.native
  /**
    * Finds instances of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: String, options: OptionsAllNothrow): js.Array[String] | Null = js.native
  /**
    * Finds the first instance of a specified executable in the PATH environment variable
    */
  def whichSync(cmd: String, options: OptionsNothrow): String | Null = js.native
  /**
    * Writes buffer to the file specified by fd
    */
  def write(fd: FD, buffer: Buffer): js.Promise[Double] = js.native
  def write(
    fd: FD,
    buffer: Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double
  ): js.Promise[Double] = js.native
  def write(
    fd: FD,
    buffer: Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double
  ): js.Promise[Double] = js.native
  def write(
    fd: FD,
    buffer: Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double
  ): js.Promise[Double] = js.native
  def write(fd: FD, buffer: Uint8Array): js.Promise[Double] = js.native
  def write(
    fd: FD,
    buffer: Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double
  ): js.Promise[Double] = js.native
  def write(
    fd: FD,
    buffer: Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double
  ): js.Promise[Double] = js.native
  def write(
    fd: FD,
    buffer: Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double
  ): js.Promise[Double] = js.native
  /**
    * Writes string to the file specified by fd
    */
  def write(fd: FD, string: String): js.Promise[Double] = js.native
  def write(
    fd: FD,
    string: String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double
  ): js.Promise[Double] = js.native
  def write(
    fd: FD,
    string: String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double,
    /**
    * The expected string encoding
    */
  encoding: Encoding
  ): js.Promise[Double] = js.native
  /**
    * Writes data to a file, replacing the file if it already exists
    */
  def writeFile(file: String, data: String): js.Promise[Unit] = js.native
  def writeFile(file: String, data: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: String, data: Buffer): js.Promise[Unit] = js.native
  def writeFile(file: String, data: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: String, data: Uint8Array): js.Promise[Unit] = js.native
  def writeFile(file: String, data: Uint8Array, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: Double, data: String): js.Promise[Unit] = js.native
  def writeFile(file: Double, data: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: Double, data: Buffer): js.Promise[Unit] = js.native
  def writeFile(file: Double, data: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: Double, data: Uint8Array): js.Promise[Unit] = js.native
  def writeFile(file: Double, data: Uint8Array, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: Buffer, data: String): js.Promise[Unit] = js.native
  def writeFile(file: Buffer, data: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: Buffer, data: Buffer): js.Promise[Unit] = js.native
  def writeFile(file: Buffer, data: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFile(file: Buffer, data: Uint8Array): js.Promise[Unit] = js.native
  def writeFile(file: Buffer, data: Uint8Array, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def writeFileAtomic(filename: String, data: String): js.Promise[Unit] = js.native
  def writeFileAtomic(filename: String, data: String, options: WriteFileAtomicOptions): js.Promise[Unit] = js.native
  def writeFileAtomic(filename: String, data: Buffer): js.Promise[Unit] = js.native
  def writeFileAtomic(filename: String, data: Buffer, options: WriteFileAtomicOptions): js.Promise[Unit] = js.native
  def writeFileAtomic(filename: String, data: Uint8Array): js.Promise[Unit] = js.native
  def writeFileAtomic(filename: String, data: Uint8Array, options: WriteFileAtomicOptions): js.Promise[Unit] = js.native
  /**
    * Writes data to a file, replacing the file if it already exists
    */
  def writeFileSync(file: String, data: String): Unit = js.native
  def writeFileSync(file: String, data: String, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: String, data: Buffer): Unit = js.native
  def writeFileSync(file: String, data: Buffer, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: String, data: Uint8Array): Unit = js.native
  def writeFileSync(file: String, data: Uint8Array, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: Double, data: String): Unit = js.native
  def writeFileSync(file: Double, data: String, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: Double, data: Buffer): Unit = js.native
  def writeFileSync(file: Double, data: Buffer, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: Double, data: Uint8Array): Unit = js.native
  def writeFileSync(file: Double, data: Uint8Array, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: Buffer, data: String): Unit = js.native
  def writeFileSync(file: Buffer, data: String, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: Buffer, data: Buffer): Unit = js.native
  def writeFileSync(file: Buffer, data: Buffer, options: Anon_EncodingFlag): Unit = js.native
  def writeFileSync(file: Buffer, data: Uint8Array): Unit = js.native
  def writeFileSync(file: Buffer, data: Uint8Array, options: Anon_EncodingFlag): Unit = js.native
  /**
    * Writes buffer to the file specified by fd
    */
  def writeSync(fd: FD, buffer: Buffer): Double = js.native
  def writeSync(
    fd: FD,
    buffer: Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double
  ): Double = js.native
  def writeSync(
    fd: FD,
    buffer: Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double
  ): Double = js.native
  def writeSync(
    fd: FD,
    buffer: Buffer,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double
  ): Double = js.native
  def writeSync(fd: FD, buffer: Uint8Array): Double = js.native
  def writeSync(
    fd: FD,
    buffer: Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double
  ): Double = js.native
  def writeSync(
    fd: FD,
    buffer: Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double
  ): Double = js.native
  def writeSync(
    fd: FD,
    buffer: Uint8Array,
    /**
    * Determines the part of the buffer to be written
    */
  offset: Double,
    /**
    * An integer specifying the number of bytes to write
    */
  length: Double,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double
  ): Double = js.native
  /**
    * Writes string to the file specified by fd
    */
  def writeSync(fd: FD, string: String): Double = js.native
  def writeSync(
    fd: FD,
    string: String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double
  ): Double = js.native
  def writeSync(
    fd: FD,
    string: String,
    /**
    * The offset from the beginning of the file where this data should be written
    */
  position: Double,
    /**
    * The expected string encoding
    */
  encoding: Encoding
  ): Double = js.native
}

