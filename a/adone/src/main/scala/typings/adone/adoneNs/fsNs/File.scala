package typings.adone.adoneNs.fsNs

import typings.adone.Anon_EncodingFlag
import typings.adone.Anon_ModeNumber
import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.adone.adoneNs.fsNs.INs.ReadStream
import typings.adone.adoneNs.fsNs.INs.Stats
import typings.adone.adoneStrings.buffer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a file
  */
@JSGlobal("adone.fs.File")
@js.native
class File protected () extends js.Object {
  def this(path: String*) = this()
  /**
    * Appends the given data to the file
    */
  def append(buffer: String): js.Promise[Unit] = js.native
  def append(buffer: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def append(buffer: Buffer): js.Promise[Unit] = js.native
  def append(buffer: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  /**
    * Changes the file premissions
    */
  def chmod(mode: Double): js.Promise[Unit] = js.native
  def chmod(mode: Mode): js.Promise[Unit] = js.native
  /**
    * Returns the contents as a string
    */
  def contents(): js.Promise[String] = js.native
  def contents(encoding: Encoding): js.Promise[String] = js.native
  /**
    * Returns a read stream for this file
    */
  def contentsStream(): ReadStream = js.native
  def contentsStream(encoding: Encoding): ReadStream = js.native
  @JSName("contentsStream")
  def contentsStream_buffer(encoding: buffer): ReadStream = js.native
  /**
    * Returns the contents as a string synchronously
    */
  def contentsSync(): String = js.native
  def contentsSync(encoding: Encoding): String = js.native
  /**
    * Returns the contents as a buffer synchronously
    */
  @JSName("contentsSync")
  def contentsSync_buffer(encoding: buffer): Buffer = js.native
  /**
    * Returns the contents as a buffer
    */
  @JSName("contents")
  def contents_buffer(encoding: buffer): js.Promise[Buffer] = js.native
  /**
    * Creates the file, writes an empty string
    */
  def create(): js.Promise[Unit] = js.native
  def create(options: Anon_ModeNumber): js.Promise[Unit] = js.native
  /**
    * Returns the file dirname
    */
  def dirname(): String = js.native
  /**
    * Sets the file encoding
    */
  def encoding(name: Encoding): this.type = js.native
  @JSName("encoding")
  def encoding_buffer(name: buffer): this.type = js.native
  /**
    * Returns true if the file exists, visible by the process
    */
  def exists(): js.Promise[Boolean] = js.native
  /**
    * Returns the file extension
    */
  def extname(): String = js.native
  /**
    * Returns the filename
    */
  def filename(): String = js.native
  /**
    * Returns the files stats, for links the link stats
    */
  def lstat(): js.Promise[Stats] = js.native
  /**
    * Returns the files stats, for links the link stats, works synchronously
    */
  def lstatSync(): Stats = js.native
  /**
    * Returns the file mode
    */
  def mode(): Mode = js.native
  /**
    * Returns normalized file path, with only / and removed redundant slashes
    */
  def normalizedPath(): String = js.native
  /**
    * Returns the file absoulte path
    */
  def path(): String = js.native
  /**
    * Returns a relative path
    */
  def relativePath(path: String): String = js.native
  def relativePath(path: Directory): String = js.native
  /**
    * Renames the file
    */
  def rename(name: String): js.Promise[Unit] = js.native
  def rename(name: File): js.Promise[Unit] = js.native
  /**
    * Returns the file size in bytes
    */
  def size(): js.Promise[Double] = js.native
  /**
    * Returns the file stats
    */
  def stat(): js.Promise[Stats] = js.native
  /**
    * Returns the file stats synchronously
    */
  def statSync(): Stats = js.native
  /**
    * Returns the filename with no extension
    */
  def stem(): String = js.native
  /**
    * Creates a symbolic link to this file
    */
  def symbolicLink(path: String): SymbolicLinkFile = js.native
  def symbolicLink(path: File): SymbolicLinkFile = js.native
  /**
    * Removes the file
    */
  def unlink(): js.Promise[Unit] = js.native
  /**
    * Writes the given data to the file
    */
  def write(buffer: String): js.Promise[Unit] = js.native
  def write(buffer: String, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
  def write(buffer: Buffer): js.Promise[Unit] = js.native
  def write(buffer: Buffer, options: Anon_EncodingFlag): js.Promise[Unit] = js.native
}

