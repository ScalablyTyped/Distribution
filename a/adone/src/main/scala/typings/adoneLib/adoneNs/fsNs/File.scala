package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a file
  */
@JSGlobal("adone.fs.File")
@js.native
class File protected () extends js.Object {
  def this(path: java.lang.String*) = this()
  /**
    * Appends the given data to the file
    */
  def append(buffer: java.lang.String): js.Promise[scala.Unit] = js.native
  def append(buffer: java.lang.String, options: adoneLib.Anon_EncodingMode): js.Promise[scala.Unit] = js.native
  def append(buffer: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def append(buffer: nodeLib.Buffer, options: adoneLib.Anon_EncodingMode): js.Promise[scala.Unit] = js.native
  def chmod(mode: Mode): js.Promise[scala.Unit] = js.native
  /**
    * Changes the file premissions
    */
  def chmod(mode: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Returns the contents as a string
    */
  def contents(): js.Promise[java.lang.String] = js.native
  def contents(encoding: adoneLib.adoneNs.fsNs.INs.Encoding): js.Promise[java.lang.String] = js.native
  /**
    * Returns a read stream for this file
    */
  def contentsStream(): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  def contentsStream(encoding: adoneLib.adoneNs.fsNs.INs.Encoding): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  @JSName("contentsStream")
  def contentsStream_buffer(encoding: adoneLib.adoneLibStrings.buffer): adoneLib.adoneNs.fsNs.INs.ReadStream = js.native
  /**
    * Returns the contents as a string synchronously
    */
  def contentsSync(): java.lang.String = js.native
  def contentsSync(encoding: adoneLib.adoneNs.fsNs.INs.Encoding): java.lang.String = js.native
  /**
    * Returns the contents as a buffer synchronously
    */
  @JSName("contentsSync")
  def contentsSync_buffer(encoding: adoneLib.adoneLibStrings.buffer): nodeLib.Buffer = js.native
  /**
    * Returns the contents as a buffer
    */
  @JSName("contents")
  def contents_buffer(encoding: adoneLib.adoneLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Creates the file, writes an empty string
    */
  def create(): js.Promise[scala.Unit] = js.native
  def create(options: adoneLib.Anon_Mode): js.Promise[scala.Unit] = js.native
  /**
    * Returns the file dirname
    */
  def dirname(): java.lang.String = js.native
  /**
    * Sets the file encoding
    */
  def encoding(name: adoneLib.adoneNs.fsNs.INs.Encoding): this.type = js.native
  @JSName("encoding")
  def encoding_buffer(name: adoneLib.adoneLibStrings.buffer): this.type = js.native
  /**
    * Returns true if the file exists, visible by the process
    */
  def exists(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns the file extension
    */
  def extname(): java.lang.String = js.native
  /**
    * Returns the filename
    */
  def filename(): java.lang.String = js.native
  /**
    * Returns the files stats, for links the link stats
    */
  def lstat(): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  /**
    * Returns the files stats, for links the link stats, works synchronously
    */
  def lstatSync(): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Returns the file mode
    */
  def mode(): Mode = js.native
  /**
    * Returns normalized file path, with only / and removed redundant slashes
    */
  def normalizedPath(): java.lang.String = js.native
  /**
    * Returns the file absoulte path
    */
  def path(): java.lang.String = js.native
  def relativePath(path: Directory): java.lang.String = js.native
  /**
    * Returns a relative path
    */
  def relativePath(path: java.lang.String): java.lang.String = js.native
  def rename(name: File): js.Promise[scala.Unit] = js.native
  /**
    * Renames the file
    */
  def rename(name: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Returns the file size in bytes
    */
  def size(): js.Promise[scala.Double] = js.native
  /**
    * Returns the file stats
    */
  def stat(): js.Promise[adoneLib.adoneNs.fsNs.INs.Stats] = js.native
  /**
    * Returns the file stats synchronously
    */
  def statSync(): adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Returns the filename with no extension
    */
  def stem(): java.lang.String = js.native
  def symbolicLink(path: File): SymbolicLinkFile = js.native
  /**
    * Creates a symbolic link to this file
    */
  def symbolicLink(path: java.lang.String): SymbolicLinkFile = js.native
  /**
    * Removes the file
    */
  def unlink(): js.Promise[scala.Unit] = js.native
  /**
    * Writes the given data to the file
    */
  def write(buffer: java.lang.String): js.Promise[scala.Unit] = js.native
  def write(buffer: java.lang.String, options: adoneLib.Anon_EncodingMode): js.Promise[scala.Unit] = js.native
  def write(buffer: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def write(buffer: nodeLib.Buffer, options: adoneLib.Anon_EncodingMode): js.Promise[scala.Unit] = js.native
}

