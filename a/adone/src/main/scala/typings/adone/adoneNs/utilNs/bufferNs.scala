package typings.adone.adoneNs.utilNs

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * buffer tools
  */
@JSGlobal("adone.util.buffer")
@js.native
object bufferNs extends js.Object {
  /**
    * Converts the given Buffer to ArrayBuffer
    */
  def toArrayBuffer(buf: Buffer): ArrayBuffer = js.native
  /**
    * Returns a new buffer that represents a^b
    *
    * If the lengths are not equal, it assumes missing bytes as 0x00
    *
    * @param length length of the result buffer. max(a.length, b.length) by default
    */
  def xor(a: Buffer, b: Buffer): Buffer = js.native
  def xor(a: Buffer, b: Buffer, length: Double): Buffer = js.native
}

