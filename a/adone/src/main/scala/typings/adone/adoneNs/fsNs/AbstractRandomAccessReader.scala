package typings.adone.adoneNs.fsNs

import typings.adone.Anon_End
import typings.adone.adoneNs.eventNs.Emitter
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an abstract random access reader
  */
@JSGlobal("adone.fs.AbstractRandomAccessReader")
@js.native
class AbstractRandomAccessReader () extends Emitter {
  /**
    * Must be implemented in derived classes and return a readable stream for the given range [start, end]
    */
  def _readStreamFromRange(start: Double, end: Double): Readable = js.native
  /**
    * Creates a readable stream for the given range
    */
  def createReadStream(): Readable = js.native
  def createReadStream(options: Anon_End): Readable = js.native
  /**
    * Reads data and writes to the given buffer
    *
    * @param buffer buffer to write to
    * @param offset buffer offset to write to
    * @param length number of bytes to read
    * @param position position to read from
    */
  def read(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[Unit] = js.native
  /**
    * Increments the reference counter
    */
  def ref(): Unit = js.native
  /**
    * Decrements the reference counter
    */
  def unref(): Unit = js.native
}

