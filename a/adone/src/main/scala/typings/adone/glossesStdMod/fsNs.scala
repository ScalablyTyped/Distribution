package typings.adone.glossesStdMod

import typings.adone.adoneStrings.buffer
import typings.node.Anon_AutoClose
import typings.node.Anon_AutoCloseEncoding
import typings.node.Anon_BufferBytesRead
import typings.node.Anon_BufferBytesReadFloat32Array
import typings.node.Anon_BufferBytesReadFloat64Array
import typings.node.Anon_BufferBytesReadInt16Array
import typings.node.Anon_BufferBytesReadInt32Array
import typings.node.Anon_BufferBytesReadInt8Array
import typings.node.Anon_BufferBytesReadNumber
import typings.node.Anon_BufferBytesReadNumberTBuffer
import typings.node.Anon_BufferBytesReadNumberUint16Array
import typings.node.Anon_BufferBytesReadNumberUint32Array
import typings.node.Anon_BufferBytesReadNumberUint8ClampedArray
import typings.node.Anon_BufferBytesWritten
import typings.node.Anon_BufferBytesWrittenFloat32Array
import typings.node.Anon_BufferBytesWrittenFloat64Array
import typings.node.Anon_BufferBytesWrittenInt16Array
import typings.node.Anon_BufferBytesWrittenInt32Array
import typings.node.Anon_BufferBytesWrittenInt8Array
import typings.node.Anon_BufferBytesWrittenNumber
import typings.node.Anon_BufferBytesWrittenNumberString
import typings.node.Anon_BufferBytesWrittenNumberTBuffer
import typings.node.Anon_BufferBytesWrittenNumberUint16Array
import typings.node.Anon_BufferBytesWrittenNumberUint32Array
import typings.node.Anon_BufferBytesWrittenNumberUint8ClampedArray
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_BufferEncodingPersistent
import typings.node.Anon_EncodingBufferEncoding
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingFalseWithFileTypesBufferEncoding
import typings.node.Anon_EncodingFlagBufferEncoding
import typings.node.Anon_EncodingFlagModeNull
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagNullNumber
import typings.node.Anon_EncodingFlagNullNumberString
import typings.node.Anon_EncodingFlagString
import typings.node.Anon_EncodingNull
import typings.node.Anon_EncodingPersistent
import typings.node.Anon_EncodingPersistentRecursive
import typings.node.Anon_EncodingTrue
import typings.node.Anon_Interval
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.BinaryData
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.promisesNs.FileHandle
import typings.node.fsMod.symlinkNs.Type
import typings.std.DataView
import typings.std.Date
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "fs")
@js.native
object fsNs extends js.Object {
  @js.native
  class Dirent ()
    extends typings.node.fsMod.Dirent
  
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream
  
  @js.native
  class Stats ()
    extends typings.node.fsMod.Stats
  
  @js.native
  class WriteStream ()
    extends typings.node.fsMod.WriteStream
  
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def access(path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def access(
    path: PathLike,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def access(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def accessSync(path: PathLike): Unit = js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  def appendFile(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def appendFile(
    file: Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    */
  def appendFile(file: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  def appendFile(
    file: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def appendFileSync(file: Double, data: js.Any): Unit = js.native
  def appendFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  def appendFileSync(file: PathLike, data: js.Any): Unit = js.native
  def appendFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def chmod(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def chmod(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def chmodSync(path: PathLike, mode: String): Unit = js.native
  def chmodSync(path: PathLike, mode: Double): Unit = js.native
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def chown(
    path: PathLike,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def close(fd: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def closeSync(fd: Double): Unit = js.native
  /**
    * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
    * No arguments other than a possible exception are given to the callback function.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    */
  def copyFile(src: PathLike, dest: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
    * No arguments other than a possible exception are given to the callback function.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An integer that specifies the behavior of the copy operation. The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
    */
  def copyFile(
    src: PathLike,
    dest: PathLike,
    flags: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation.
    * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
    */
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = js.native
  def createReadStream(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  def createReadStream(path: PathLike, options: Anon_AutoClose): typings.node.fsMod.ReadStream = js.native
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  def createWriteStream(path: PathLike, options: Anon_AutoCloseEncoding): typings.node.fsMod.WriteStream = js.native
  /**
    * Asynchronously tests whether or not the given path exists by checking with the file system.
    * @deprecated
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /**
    * Synchronously tests whether or not the given path exists by checking with the file system.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def existsSync(path: PathLike): Boolean = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def fchmod(fd: Double, mode: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def fchmod(fd: Double, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def fchown(
    fd: Double,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def fdatasync(fd: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def fdatasyncSync(fd: Double): Unit = js.native
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def fstat(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Synchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def fstatSync(fd: Double): typings.node.fsMod.Stats = js.native
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def fsync(fd: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def fsyncSync(fd: Double): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    */
  def ftruncate(fd: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def ftruncate(
    fd: Double,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def ftruncate(fd: Double, len: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def ftruncate(fd: Double, len: Null, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def futimes(
    fd: Double,
    atime: String,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: String,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: String,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: Double,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: Double,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: Date,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: Date,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def futimes(
    fd: Double,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def futimesSync(fd: Double, atime: String, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: String, mtime: Date): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Date): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: String): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def lchmod(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def lchmod(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def lchmodSync(path: PathLike, mode: String): Unit = js.native
  def lchmodSync(path: PathLike, mode: Double): Unit = js.native
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lchown(
    path: PathLike,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def link(
    existingPath: PathLike,
    newPath: PathLike,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lstat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def lstatSync(path: PathLike): typings.node.fsMod.Stats = js.native
  /**
    * Asynchronous mkdir(2) - create a directory with a mode of `0o777`.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def mkdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def mkdir(path: PathLike, options: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdir(path: PathLike, options: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(path: PathLike, options: Null, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def mkdirSync(path: PathLike): Unit = js.native
  def mkdirSync(path: PathLike, options: String): Unit = js.native
  def mkdirSync(path: PathLike, options: Double): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    */
  def mkdtemp(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
  def mkdtemp(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def mkdtemp(
    prefix: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def mkdtemp(
    prefix: String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def mkdtemp(
    prefix: String,
    options: typings.node.Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtemp(
    prefix: String,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtemp(
    prefix: String,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def mkdtemp(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtempSync(prefix: String): String | Buffer = js.native
  def mkdtempSync(prefix: String, options: String): String | Buffer = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def mkdtempSync(prefix: String, options: typings.node.Anon_BufferEncoding): Buffer = js.native
  def mkdtempSync(prefix: String, options: Anon_EncodingBufferEncoding): String = js.native
  def mkdtempSync(prefix: String, options: Anon_EncodingNull): String | Buffer = js.native
  def mkdtempSync(prefix: String, options: BufferEncoding): String = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("mkdtempSync")
  def mkdtempSync_String(prefix: String): String = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_buffer(prefix: String, options: buffer): Buffer = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("mkdtemp")
  def mkdtemp_buffer(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file. If the file is created, its mode will be `0o666`.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def open(
    path: PathLike,
    flags: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def open(
    path: PathLike,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: String,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: String,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: Double,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: Double,
    mode: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: Double,
    mode: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  def open(
    path: PathLike,
    flags: Double,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = js.native
  /**
    * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def openSync(path: PathLike, flags: String): Double = js.native
  def openSync(path: PathLike, flags: String, mode: String): Double = js.native
  def openSync(path: PathLike, flags: String, mode: Double): Double = js.native
  def openSync(path: PathLike, flags: Double): Double = js.native
  def openSync(path: PathLike, flags: Double, mode: String): Double = js.native
  def openSync(path: PathLike, flags: Double, mode: Double): Double = js.native
  /**
    * Asynchronously reads data from the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def read(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def readFile(path: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    path: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Anon_EncodingFlagNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Anon_EncodingFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: typings.node.Anon_EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    */
  def readFile(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(
    path: PathLike,
    options: Anon_EncodingFlagNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(
    path: PathLike,
    options: Anon_EncodingFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFile(
    path: PathLike,
    options: typings.node.Anon_EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def readFileSync(path: Double): Buffer = js.native
  def readFileSync(path: Double, options: String): String | Buffer = js.native
  def readFileSync(path: Double, options: typings.node.Anon_EncodingFlag): Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
    */
  def readFileSync(path: PathLike): Buffer = js.native
  def readFileSync(path: PathLike, options: String): String | Buffer = js.native
  def readFileSync(path: PathLike, options: typings.node.Anon_EncodingFlag): Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: Double, options: String): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: PathLike, options: String): String = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double): String | Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike): String | Buffer = js.native
  def readSync(fd: Double, buffer: BinaryData, offset: Double, length: Double): Double = js.native
  /**
    * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def readSync(fd: Double, buffer: BinaryData, offset: Double, length: Double, position: Double): Double = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def readdir(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(
    path: PathLike,
    options: Anon_BufferEncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(
    path: PathLike,
    options: Anon_EncodingFalseWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdir(
    path: PathLike,
    options: Anon_EncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdir(
    path: PathLike,
    options: Anon_EncodingTrue,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.Array[typings.node.fsMod.Dirent], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: PathLike): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  /**
    * Synchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[typings.node.fsMod.Dirent] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  @JSName("readdir")
  def readdir_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def readlink(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  def readlink(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
  def readlink(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String | Buffer, Unit]
  ): Unit = js.native
  def readlink(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(
    path: PathLike,
    options: typings.node.Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(
    path: PathLike,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlink(
    path: PathLike,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String | Buffer, Unit]
  ): Unit = js.native
  def readlink(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: PathLike): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def readlinkSync(path: PathLike, options: typings.node.Anon_BufferEncoding): Buffer = js.native
  def readlinkSync(path: PathLike, options: Anon_EncodingBufferEncoding): String = js.native
  def readlinkSync(path: PathLike, options: Anon_EncodingNull): String | Buffer = js.native
  def readlinkSync(path: PathLike, options: BufferEncoding): String = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("readlinkSync")
  def readlinkSync_String(path: PathLike): String = js.native
  @JSName("readlinkSync")
  def readlinkSync_buffer(path: PathLike, options: buffer): Buffer = js.native
  @JSName("readlink")
  def readlink_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def realpath(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def realpath(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def realpath(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def realpath(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(
    path: PathLike,
    options: typings.node.Anon_BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(
    path: PathLike,
    options: Anon_EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpath(
    path: PathLike,
    options: Anon_EncodingNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def realpath(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpathSync(path: PathLike): String | Buffer = js.native
  def realpathSync(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def realpathSync(path: PathLike, options: typings.node.Anon_BufferEncoding): Buffer = js.native
  def realpathSync(path: PathLike, options: Anon_EncodingBufferEncoding): String = js.native
  def realpathSync(path: PathLike, options: Anon_EncodingNull): String | Buffer = js.native
  def realpathSync(path: PathLike, options: BufferEncoding): String = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("realpathSync")
  def realpathSync_String(path: PathLike): String = js.native
  @JSName("realpathSync")
  def realpathSync_buffer(path: PathLike, options: buffer): Buffer = js.native
  @JSName("realpath")
  def realpath_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def rename(
    oldPath: PathLike,
    newPath: PathLike,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def rmdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def rmdirSync(path: PathLike): Unit = js.native
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def stat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Synchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def statSync(path: PathLike): typings.node.fsMod.Stats = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    */
  def symlink(target: PathLike, path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: Null,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: Type,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def truncate(path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def truncate(
    path: PathLike,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def truncate(path: PathLike, len: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def truncate(path: PathLike, len: Null, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  def truncateSync(path: PathLike): Unit = js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def unlink(path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Synchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def unlinkSync(path: PathLike): Unit = js.native
  /**
    * Stop watching for changes on `filename`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def unwatchFile(filename: PathLike): Unit = js.native
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def utimes(
    path: PathLike,
    atime: String,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: String,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: String,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: Double,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: Double,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: Date,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: Date,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def utimes(
    path: PathLike,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  def utimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  def utimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  def watch(filename: PathLike): FSWatcher = js.native
  def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: Anon_BufferEncodingPersistent): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Anon_BufferEncodingPersistent,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: Anon_EncodingPersistent): FSWatcher = js.native
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  def watch(filename: PathLike, options: Anon_EncodingPersistentRecursive): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Anon_EncodingPersistentRecursive,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: Anon_EncodingPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def watch(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def watchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  /**
    * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
    */
  def watchFile(
    filename: PathLike,
    options: Anon_Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = js.native
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSName("watch")
  def watch_buffer(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    */
  def write(
    fd: Double,
    buffer: DataView,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def write(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    */
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    */
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: DataView,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float32Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Float64Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int16Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int32Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Int8Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint16Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint32Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8Array,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def write(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    */
  def write(
    fd: Double,
    string: js.Any,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def write(
    fd: Double,
    string: js.Any,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: Double,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def write(
    fd: Double,
    string: js.Any,
    position: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: Double,
    encoding: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: Null,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: Null,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def write(
    fd: Double,
    string: js.Any,
    position: Null,
    encoding: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def writeFile(path: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def writeFile(
    path: Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    */
  def writeFile(path: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  def writeFile(
    path: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def writeFileSync(path: Double, data: js.Any): Unit = js.native
  def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronously writes data to a file, replacing the file if it already exists.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
  def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  /**
    * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def writeSync(fd: Double, buffer: BinaryData): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Double, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Null, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Null, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: BinaryData, offset: Null, length: Null, position: Double): Double = js.native
  /**
    * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
    * @param fd A file descriptor.
    * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def writeSync(fd: Double, string: js.Any): Double = js.native
  def writeSync(fd: Double, string: js.Any, position: Double): Double = js.native
  def writeSync(fd: Double, string: js.Any, position: Double, encoding: String): Double = js.native
  def writeSync(fd: Double, string: js.Any, position: Null, encoding: String): Double = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("access")
  @js.native
  object accessNs extends js.Object {
    /**
      * Asynchronously tests a user's permissions for the file specified by path.
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("appendFile")
  @js.native
  object appendFileNs extends js.Object {
    def __promisify__(file: Double, data: js.Any): js.Promise[Unit] = js.native
    def __promisify__(file: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
    /**
      * Asynchronously append data to a file, creating the file if it does not exist.
      * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    def __promisify__(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
    def __promisify__(file: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("chmod")
  @js.native
  object chmodNs extends js.Object {
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def __promisify__(path: PathLike, mode: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("chown")
  @js.native
  object chownNs extends js.Object {
    /**
      * Asynchronous chown(2) - Change ownership of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("close")
  @js.native
  object closeNs extends js.Object {
    /**
      * Asynchronous close(2) - close a file descriptor.
      * @param fd A file descriptor.
      */
    def __promisify__(fd: Double): js.Promise[Unit] = js.native
  }
  
  @JSName("constants")
  @js.native
  object constantsNs extends js.Object {
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    val COPYFILE_EXCL: Double = js.native
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    val COPYFILE_FICLONE: Double = js.native
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    val COPYFILE_FICLONE_FORCE: Double = js.native
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    val F_OK: Double = js.native
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    val O_APPEND: Double = js.native
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    val O_CREAT: Double = js.native
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    val O_DIRECT: Double = js.native
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    val O_DIRECTORY: Double = js.native
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    val O_DSYNC: Double = js.native
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    val O_EXCL: Double = js.native
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    val O_NOATIME: Double = js.native
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    val O_NOCTTY: Double = js.native
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    val O_NOFOLLOW: Double = js.native
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    val O_NONBLOCK: Double = js.native
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    val O_RDONLY: Double = js.native
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    val O_RDWR: Double = js.native
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    val O_SYMLINK: Double = js.native
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    val O_SYNC: Double = js.native
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    val O_TRUNC: Double = js.native
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    val O_WRONLY: Double = js.native
    /** Constant for fs.access(). File can be read by the calling process. */
    val R_OK: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    val S_IFBLK: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    val S_IFCHR: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    val S_IFDIR: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    val S_IFIFO: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    val S_IFLNK: Double = js.native
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    val S_IFMT: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    val S_IFREG: Double = js.native
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    val S_IFSOCK: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    val S_IRGRP: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    val S_IROTH: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    val S_IRUSR: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    val S_IRWXG: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    val S_IRWXO: Double = js.native
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    val S_IRWXU: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    val S_IWGRP: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    val S_IWOTH: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    val S_IWUSR: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    val S_IXGRP: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    val S_IXOTH: Double = js.native
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    val S_IXUSR: Double = js.native
    /** Constant for fs.access(). File can be written by the calling process. */
    val W_OK: Double = js.native
    /** Constant for fs.access(). File can be executed by the calling process. */
    val X_OK: Double = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("copyFile")
  @js.native
  object copyFileNs extends js.Object {
    /**
      * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
      * No arguments other than a possible exception are given to the callback function.
      * Node.js makes no guarantees about the atomicity of the copy operation.
      * If an error occurs after the destination file has been opened for writing, Node.js will attempt
      * to remove the destination.
      * @param src A path to the source file.
      * @param dest A path to the destination file.
      * @param flags An optional integer that specifies the behavior of the copy operation.
      * The only supported flag is fs.constants.COPYFILE_EXCL,
      * which causes the copy operation to fail if dest already exists.
      */
    def __promisify__(src: PathLike, dst: PathLike): js.Promise[Unit] = js.native
    def __promisify__(src: PathLike, dst: PathLike, flags: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("exists")
  @js.native
  object existsNs extends js.Object {
    /**
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def __promisify__(path: PathLike): js.Promise[Boolean] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("fchmod")
  @js.native
  object fchmodNs extends js.Object {
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param fd A file descriptor.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def __promisify__(fd: Double, mode: String): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, mode: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("fchown")
  @js.native
  object fchownNs extends js.Object {
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      * @param fd A file descriptor.
      */
    def __promisify__(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("fdatasync")
  @js.native
  object fdatasyncNs extends js.Object {
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      * @param fd A file descriptor.
      */
    def __promisify__(fd: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("fstat")
  @js.native
  object fstatNs extends js.Object {
    /**
      * Asynchronous fstat(2) - Get file status.
      * @param fd A file descriptor.
      */
    def __promisify__(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("fsync")
  @js.native
  object fsyncNs extends js.Object {
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      * @param fd A file descriptor.
      */
    def __promisify__(fd: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("ftruncate")
  @js.native
  object ftruncateNs extends js.Object {
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param fd A file descriptor.
      * @param len If not specified, defaults to `0`.
      */
    def __promisify__(fd: Double): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, len: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("futimes")
  @js.native
  object futimesNs extends js.Object {
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
      * @param fd A file descriptor.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def __promisify__(fd: Double, atime: String, mtime: String): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: String, mtime: Date): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: Date, mtime: String): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    def __promisify__(fd: Double, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("lchmod")
  @js.native
  object lchmodNs extends js.Object {
    /**
      * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def __promisify__(path: PathLike, mode: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("lchown")
  @js.native
  object lchownNs extends js.Object {
    /**
      * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("link")
  @js.native
  object linkNs extends js.Object {
    /**
      * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
      * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("lstat")
  @js.native
  object lstatNs extends js.Object {
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("mkdir")
  @js.native
  object mkdirNs extends js.Object {
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, options: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, options: Double): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("mkdtemp")
  @js.native
  object mkdtempNs extends js.Object {
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(prefix: String): js.Promise[String] = js.native
    def __promisify__(prefix: String, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(prefix: String, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
    def __promisify__(prefix: String, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
    def __promisify__(prefix: String, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
    def __promisify__(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
    @JSName("__promisify__")
    def __promisify___buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("open")
  @js.native
  object openNs extends js.Object {
    /**
      * Asynchronous open(2) - open and possibly create a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
      */
    def __promisify__(path: PathLike, flags: String): js.Promise[Double] = js.native
    def __promisify__(path: PathLike, flags: String, mode: String): js.Promise[Double] = js.native
    def __promisify__(path: PathLike, flags: String, mode: Double): js.Promise[Double] = js.native
    def __promisify__(path: PathLike, flags: Double): js.Promise[Double] = js.native
    def __promisify__(path: PathLike, flags: Double, mode: String): js.Promise[Double] = js.native
    def __promisify__(path: PathLike, flags: Double, mode: Double): js.Promise[Double] = js.native
  }
  
  @JSName("promises")
  @js.native
  object promisesNs extends js.Object {
    /**
      * Asynchronously tests a user's permissions for the file specified by path.
      * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def access(path: PathLike): js.Promise[Unit] = js.native
    def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronously append data to a file, creating the file if it does not exist.
      * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    def appendFile(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: js.Any, options: String): js.Promise[Unit] = js.native
    def appendFile(path: PathLike, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: js.Any): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: js.Any, options: String): js.Promise[Unit] = js.native
    def appendFile(path: FileHandle, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def chmod(path: PathLike, mode: String): js.Promise[Unit] = js.native
    def chmod(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous chown(2) - Change ownership of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
      * Node.js makes no guarantees about the atomicity of the copy operation.
      * If an error occurs after the destination file has been opened for writing, Node.js will attempt
      * to remove the destination.
      * @param src A path to the source file.
      * @param dest A path to the destination file.
      * @param flags An optional integer that specifies the behavior of the copy operation. The only
      * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
      * `dest` already exists.
      */
    def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
    def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param handle A `FileHandle`.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def fchmod(handle: FileHandle, mode: String): js.Promise[Unit] = js.native
    def fchmod(handle: FileHandle, mode: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      * @param handle A `FileHandle`.
      */
    def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      * @param handle A `FileHandle`.
      */
    def fdatasync(handle: FileHandle): js.Promise[Unit] = js.native
    /**
      * Asynchronous fstat(2) - Get file status.
      * @param handle A `FileHandle`.
      */
    def fstat(handle: FileHandle): js.Promise[typings.node.fsMod.Stats] = js.native
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      * @param handle A `FileHandle`.
      */
    def fsync(handle: FileHandle): js.Promise[Unit] = js.native
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param handle A `FileHandle`.
      * @param len If not specified, defaults to `0`.
      */
    def ftruncate(handle: FileHandle): js.Promise[Unit] = js.native
    def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: String, mtime: Date): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Date, mtime: String): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    def futimes(handle: FileHandle, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    /**
      * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def lchmod(path: PathLike, mode: String): js.Promise[Unit] = js.native
    def lchmod(path: PathLike, mode: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
      * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def lstat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
    /**
      * Asynchronous mkdir(2) - create a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
      * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
      */
    def mkdir(path: PathLike): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: String): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: Double): js.Promise[Unit] = js.native
    def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def mkdtemp(prefix: String): js.Promise[String] = js.native
    def mkdtemp(prefix: String, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously creates a unique temporary directory.
      * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def mkdtemp(prefix: String, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
    def mkdtemp(prefix: String, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
    def mkdtemp(prefix: String, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
    def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
    @JSName("mkdtemp")
    def mkdtemp_buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
    /**
      * Asynchronous open(2) - open and possibly create a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
      * supplied, defaults to `0o666`.
      */
    def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: String, mode: String): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: String, mode: Double): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: Double, mode: String): js.Promise[FileHandle] = js.native
    def open(path: PathLike, flags: Double, mode: Double): js.Promise[FileHandle] = js.native
    /**
      * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If
      * `null`, data will be read from the current position.
      */
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[Anon_BufferBytesReadNumberTBuffer[TBuffer]] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(path: PathLike): js.Promise[Buffer] = js.native
    def readFile(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(path: PathLike, options: Anon_EncodingFlagBufferEncoding): js.Promise[String] = js.native
    def readFile(path: PathLike, options: Anon_EncodingFlagNullNumber): js.Promise[Buffer] = js.native
    def readFile(path: PathLike, options: Anon_EncodingFlagNullNumberString): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    def readFile(path: FileHandle): js.Promise[Buffer] = js.native
    def readFile(path: FileHandle, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: FileHandle, options: Anon_EncodingFlagBufferEncoding): js.Promise[String] = js.native
    def readFile(path: FileHandle, options: Anon_EncodingFlagNullNumber): js.Promise[Buffer] = js.native
    def readFile(path: FileHandle, options: Anon_EncodingFlagNullNumberString): js.Promise[String | Buffer] = js.native
    def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
    def readdir(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readdir(path: PathLike, options: Anon_BufferEncodingFalse): js.Promise[js.Array[Buffer]] = js.native
    def readdir(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Promise[js.Array[Buffer | String]] = js.native
    def readdir(path: PathLike, options: Anon_EncodingFalseWithFileTypesBufferEncoding): js.Promise[js.Array[String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
      */
    def readdir(path: PathLike, options: Anon_EncodingTrue): js.Promise[js.Array[typings.node.fsMod.Dirent]] = js.native
    def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    @JSName("readdir")
    def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readlink(path: PathLike): js.Promise[String] = js.native
    def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def readlink(path: PathLike, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
    def readlink(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
    def readlink(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
    def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSName("readlink")
    def readlink_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def realpath(path: PathLike): js.Promise[String] = js.native
    def realpath(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def realpath(path: PathLike, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
    def realpath(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
    def realpath(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
    def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSName("realpath")
    def realpath_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
    /**
      * Asynchronous rename(2) - Change the name or location of a file or directory.
      * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def rmdir(path: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def stat(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
    /**
      * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
      * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
      * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
      * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
      * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
      */
    def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
    /**
      * Asynchronous truncate(2) - Truncate a file to a specified length.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param len If not specified, defaults to `0`.
      */
    def truncate(path: PathLike): js.Promise[Unit] = js.native
    def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def unlink(path: PathLike): js.Promise[Unit] = js.native
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied path.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
    /**
      * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    def write(handle: FileHandle, string: js.Any): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    def write(handle: FileHandle, string: js.Any, position: Double): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    def write(handle: FileHandle, string: js.Any, position: Double, encoding: String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    def write(handle: FileHandle, string: js.Any, position: Null, encoding: String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    /**
      * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
      * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param handle A `FileHandle`.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]] = js.native
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.
      * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    def writeFile(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: js.Any, options: String): js.Promise[Unit] = js.native
    def writeFile(path: PathLike, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: js.Any): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: js.Any, options: String): js.Promise[Unit] = js.native
    def writeFile(path: FileHandle, data: js.Any, options: Anon_EncodingFlagModeNull): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("readFile")
  @js.native
  object readFileNs extends js.Object {
    def __promisify__(path: Double): js.Promise[Buffer] = js.native
    def __promisify__(path: Double, options: String): js.Promise[String] = js.native
    def __promisify__(path: Double, options: typings.node.Anon_EncodingFlag): js.Promise[Buffer] = js.native
    def __promisify__(path: Double, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
    def __promisify__(path: Double, options: Anon_EncodingFlagString): js.Promise[String] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
      * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def __promisify__(path: PathLike): js.Promise[Buffer] = js.native
    def __promisify__(path: PathLike, options: String): js.Promise[String] = js.native
    def __promisify__(path: PathLike, options: typings.node.Anon_EncodingFlag): js.Promise[Buffer] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
      * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def __promisify__(path: PathLike, options: Anon_EncodingFlagString): js.Promise[String] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("read")
  @js.native
  object readNs extends js.Object {
    def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[Anon_BufferBytesRead] = js.native
    /**
      * @param fd A file descriptor.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
      */
    def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesRead] = js.native
    def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadFloat32Array] = js.native
    def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadFloat32Array] = js.native
    def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadFloat64Array] = js.native
    def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadFloat64Array] = js.native
    def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadInt16Array] = js.native
    def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadInt16Array] = js.native
    def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadInt32Array] = js.native
    def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadInt32Array] = js.native
    def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadInt8Array] = js.native
    def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadInt8Array] = js.native
    def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberUint16Array] = js.native
    def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberUint16Array] = js.native
    def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberUint32Array] = js.native
    def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberUint32Array] = js.native
    def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumber] = js.native
    def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumber] = js.native
    def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberUint8ClampedArray] = js.native
    def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberUint8ClampedArray] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("readdir")
  @js.native
  object readdirNs extends js.Object {
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(path: PathLike): js.Promise[js.Array[String]] = js.native
    def __promisify__(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
    def __promisify__(path: PathLike, options: Anon_BufferEncodingFalse): js.Promise[js.Array[Buffer]] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingFalse): js.Promise[js.Array[String]] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Promise[js.Array[Buffer | String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
      */
    def __promisify__(path: PathLike, options: Anon_EncodingTrue): js.Promise[js.Array[typings.node.fsMod.Dirent]] = js.native
    def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
    /**
      * Asynchronous readdir(3) - read a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    @JSName("__promisify__")
    def __promisify___buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("readlink")
  @js.native
  object readlinkNs extends js.Object {
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(path: PathLike): js.Promise[String] = js.native
    def __promisify__(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronous readlink(2) - read value of a symbolic link.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(path: PathLike, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
    def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSName("__promisify__")
    def __promisify___buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("realpath")
  @js.native
  object realpathNs extends js.Object {
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(path: PathLike): js.Promise[String] = js.native
    def __promisify__(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    /**
      * Asynchronous realpath(3) - return the canonicalized absolute pathname.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
      */
    def __promisify__(path: PathLike, options: typings.node.Anon_BufferEncoding): js.Promise[Buffer] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingBufferEncoding): js.Promise[String] = js.native
    def __promisify__(path: PathLike, options: Anon_EncodingNull): js.Promise[String | Buffer] = js.native
    def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    @JSName("__promisify__")
    def __promisify___buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
    def native(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: typings.node.Anon_BufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: Anon_EncodingBufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: Anon_EncodingNull,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
    ): Unit = js.native
    def native(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
    ): Unit = js.native
    @JSName("native")
    def native_buffer(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = js.native
  }
  
  @JSName("realpathSync")
  @js.native
  object realpathSyncNs extends js.Object {
    def native(path: PathLike): String | Buffer = js.native
    def native(path: PathLike, options: String): String | Buffer = js.native
    def native(path: PathLike, options: typings.node.Anon_BufferEncoding): Buffer = js.native
    def native(path: PathLike, options: Anon_EncodingBufferEncoding): String = js.native
    def native(path: PathLike, options: Anon_EncodingNull): String | Buffer = js.native
    def native(path: PathLike, options: BufferEncoding): String = js.native
    @JSName("native")
    def native_String(path: PathLike): String = js.native
    @JSName("native")
    def native_buffer(path: PathLike, options: buffer): Buffer = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("rename")
  @js.native
  object renameNs extends js.Object {
    /**
      * Asynchronous rename(2) - Change the name or location of a file or directory.
      * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      */
    def __promisify__(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("rmdir")
  @js.native
  object rmdirNs extends js.Object {
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("stat")
  @js.native
  object statNs extends js.Object {
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[typings.node.fsMod.Stats] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("symlink")
  @js.native
  object symlinkNs extends js.Object {
    /**
      * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
      * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
      * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
      * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
      * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
      */
    def __promisify__(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
    def __promisify__(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("truncate")
  @js.native
  object truncateNs extends js.Object {
    /**
      * Asynchronous truncate(2) - Truncate a file to a specified length.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param len If not specified, defaults to `0`.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, len: Double): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("unlink")
  @js.native
  object unlinkNs extends js.Object {
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("utimes")
  @js.native
  object utimesNs extends js.Object {
    /**
      * Asynchronously change file timestamps of the file referenced by the supplied path.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def __promisify__(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("writeFile")
  @js.native
  object writeFileNs extends js.Object {
    def __promisify__(path: Double, data: js.Any): js.Promise[Unit] = js.native
    def __promisify__(path: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * URL support is _experimental_.
      * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
      * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    def __promisify__(path: PathLike, data: js.Any): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSName("write")
  @js.native
  object writeNs extends js.Object {
    /**
      * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
      * @param fd A file descriptor.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    def __promisify__(fd: Double): js.Promise[Anon_BufferBytesWritten] = js.native
    def __promisify__(fd: Double, buffer: DataView): js.Promise[Anon_BufferBytesWritten] = js.native
    def __promisify__(fd: Double, buffer: DataView, offset: Double): js.Promise[Anon_BufferBytesWritten] = js.native
    def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[Anon_BufferBytesWritten] = js.native
    def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWritten] = js.native
    def __promisify__(fd: Double, buffer: Float32Array): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
    def __promisify__(fd: Double, buffer: Float32Array, offset: Double): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
    def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
    def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenFloat32Array] = js.native
    def __promisify__(fd: Double, buffer: Float64Array): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
    def __promisify__(fd: Double, buffer: Float64Array, offset: Double): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
    def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
    def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenFloat64Array] = js.native
    def __promisify__(fd: Double, buffer: Int16Array): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
    def __promisify__(fd: Double, buffer: Int16Array, offset: Double): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
    def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
    def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenInt16Array] = js.native
    def __promisify__(fd: Double, buffer: Int32Array): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
    def __promisify__(fd: Double, buffer: Int32Array, offset: Double): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
    def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
    def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenInt32Array] = js.native
    def __promisify__(fd: Double, buffer: Int8Array): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
    def __promisify__(fd: Double, buffer: Int8Array, offset: Double): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
    def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
    def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenInt8Array] = js.native
    def __promisify__(fd: Double, buffer: Uint16Array): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
    def __promisify__(fd: Double, buffer: Uint16Array, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
    def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
    def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberUint16Array] = js.native
    def __promisify__(fd: Double, buffer: Uint32Array): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
    def __promisify__(fd: Double, buffer: Uint32Array, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
    def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
    def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberUint32Array] = js.native
    def __promisify__(fd: Double, buffer: Uint8Array): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
    def __promisify__(fd: Double, buffer: Uint8Array, offset: Double): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
    def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
    def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumber] = js.native
    def __promisify__(fd: Double, buffer: Uint8ClampedArray): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
    def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
    def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
    def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesWrittenNumberUint8ClampedArray] = js.native
    /**
      * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
      * @param fd A file descriptor.
      * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    def __promisify__(fd: Double, string: js.Any): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    def __promisify__(fd: Double, string: js.Any, position: Double): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    def __promisify__(fd: Double, string: js.Any, position: Double, encoding: String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
    def __promisify__(fd: Double, string: js.Any, position: Null, encoding: String): js.Promise[Anon_BufferBytesWrittenNumberString] = js.native
  }
  
}

