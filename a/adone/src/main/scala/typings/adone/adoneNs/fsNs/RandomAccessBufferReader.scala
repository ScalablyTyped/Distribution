package typings.adone.adoneNs.fsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a random access reader for a buffer
  */
@JSGlobal("adone.fs.RandomAccessBufferReader")
@js.native
class RandomAccessBufferReader protected () extends AbstractRandomAccessReader {
  def this(buffer: Buffer) = this()
}

