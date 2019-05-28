package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofbufferA extends js.Object {
  /**
    * Converts the given Buffer to ArrayBuffer
    */
  def toArrayBuffer(buf: nodeLib.Buffer): stdLib.ArrayBuffer = js.native
  /**
    * Returns a new buffer that represents a^b
    *
    * If the lengths are not equal, it assumes missing bytes as 0x00
    *
    * @param length length of the result buffer. max(a.length, b.length) by default
    */
  def xor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def xor(a: nodeLib.Buffer, b: nodeLib.Buffer, length: scala.Double): nodeLib.Buffer = js.native
}

