package typings.adone.adoneNs.fsNs

import typings.adone.Anon_AtimeMtime
import typings.adone.adoneNs.eventNs.Emitter
import typings.adone.adoneNs.fsNs.INs.RandomAccessFileNs.ConstructorOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a file that supports random access
  */
@JSGlobal("adone.fs.RandomAccessFile")
@js.native
class RandomAccessFile protected () extends Emitter {
  def this(filename: String) = this()
  def this(filename: String, options: ConstructorOptions) = this()
  /**
    * Closes the file
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Writes atime and mtime properties of the file
    */
  def end(): js.Promise[Unit] = js.native
  def end(options: Anon_AtimeMtime): js.Promise[Unit] = js.native
  /**
    * Reads a buffer at the given offset
    */
  def read(length: Double): js.Promise[Buffer] = js.native
  def read(length: Double, offset: Double): js.Promise[Buffer] = js.native
  /**
    * Truncates the file to the given length
    */
  def truncate(size: Double): js.Promise[Unit] = js.native
  /**
    * Removes this file
    */
  def unlink(): js.Promise[Unit] = js.native
  /**
    * Writes the given buffer at the given offset
    */
  def write(buf: String): js.Promise[Double] = js.native
  def write(buf: String, offset: Double): js.Promise[Double] = js.native
  def write(buf: Buffer): js.Promise[Double] = js.native
  def write(buf: Buffer, offset: Double): js.Promise[Double] = js.native
}

/* static members */
@JSGlobal("adone.fs.RandomAccessFile")
@js.native
object RandomAccessFile extends js.Object {
  /**
    * Opens the given file with the given options
    */
  def open(filename: String): js.Promise[RandomAccessFile] = js.native
  def open(filename: String, options: ConstructorOptions): js.Promise[RandomAccessFile] = js.native
}

