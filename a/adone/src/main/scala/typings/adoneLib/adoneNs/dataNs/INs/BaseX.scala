package typings
package adoneLib.adoneNs.dataNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseX extends js.Object {
  def decode(str: java.lang.String): nodeLib.Buffer
  def decodeUnsafe(str: java.lang.String): nodeLib.Buffer
  def encode(buf: nodeLib.Buffer): java.lang.String
}

object BaseX {
  @scala.inline
  def apply(
    decode: java.lang.String => nodeLib.Buffer,
    decodeUnsafe: java.lang.String => nodeLib.Buffer,
    encode: nodeLib.Buffer => java.lang.String
  ): BaseX = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decodeUnsafe = js.Any.fromFunction1(decodeUnsafe), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[BaseX]
  }
}

