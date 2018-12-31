package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an abstract random access reader
  */
@JSGlobal("adone.fs.AbstractRandomAccessReader")
@js.native
class AbstractRandomAccessReader ()
  extends adoneLib.adoneNs.eventNs.Emitter {
  /**
    * Must be implemented in derived classes and return a readable stream for the given range [start, end]
    */
  def _readStreamFromRange(start: scala.Double, end: scala.Double): nodeLib.streamMod.Readable = js.native
  /**
    * Creates a readable stream for the given range
    */
  def createReadStream(): nodeLib.streamMod.Readable = js.native
  def createReadStream(options: adoneLib.Anon_Start): nodeLib.streamMod.Readable = js.native
  /**
    * Reads data and writes to the given buffer
    *
    * @param buffer buffer to write to
    * @param offset buffer offset to write to
    * @param length number of bytes to read
    * @param position position to read from
    */
  def read(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double, position: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Increments the reference counter
    */
  def ref(): scala.Unit = js.native
  /**
    * Decrements the reference counter
    */
  def unref(): scala.Unit = js.native
}

