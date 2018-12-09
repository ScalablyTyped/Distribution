package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents a file that supports random access
         */
@JSGlobal("adone.fs.RandomAccessFile")
@js.native
class RandomAccessFile protected ()
  extends adoneLib.adoneNs.eventNs.Emitter {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, options: adoneLib.adoneNs.fsNs.INs.RandomAccessFileNs.ConstructorOptions) = this()
  /**
               * Closes the file
               */
  def close(): js.Promise[scala.Unit] = js.native
  /**
               * Writes atime and mtime properties of the file
               */
  def end(): js.Promise[scala.Unit] = js.native
  /**
               * Writes atime and mtime properties of the file
               */
  def end(options: adoneLib.Anon_Atime): js.Promise[scala.Unit] = js.native
  /**
               * Reads a buffer at the given offset
               */
  def read(length: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Reads a buffer at the given offset
               */
  def read(length: scala.Double, offset: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Truncates the file to the given length
               */
  def truncate(size: scala.Double): js.Promise[scala.Unit] = js.native
  /**
               * Removes this file
               */
  def unlink(): js.Promise[scala.Unit] = js.native
  /**
               * Writes the given buffer at the given offset
               */
  def write(buf: java.lang.String): js.Promise[scala.Double] = js.native
  /**
               * Writes the given buffer at the given offset
               */
  def write(buf: java.lang.String, offset: scala.Double): js.Promise[scala.Double] = js.native
  /**
               * Writes the given buffer at the given offset
               */
  def write(buf: nodeLib.Buffer): js.Promise[scala.Double] = js.native
  /**
               * Writes the given buffer at the given offset
               */
  def write(buf: nodeLib.Buffer, offset: scala.Double): js.Promise[scala.Double] = js.native
}

/**
         * Represents a file that supports random access
         */
@JSGlobal("adone.fs.RandomAccessFile")
@js.native
object RandomAccessFile extends js.Object {
  /**
               * Opens the given file with the given options
               */
  def open(filename: java.lang.String): js.Promise[adoneLib.adoneNs.fsNs.RandomAccessFile] = js.native
  /**
               * Opens the given file with the given options
               */
  def open(
    filename: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.RandomAccessFileNs.ConstructorOptions
  ): js.Promise[adoneLib.adoneNs.fsNs.RandomAccessFile] = js.native
}

