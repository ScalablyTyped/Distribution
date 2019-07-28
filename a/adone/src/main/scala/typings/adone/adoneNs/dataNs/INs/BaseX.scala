package typings.adone.adoneNs.dataNs.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseX extends js.Object {
  def decode(str: String): Buffer
  def decodeUnsafe(str: String): Buffer
  def encode(buf: Buffer): String
}

object BaseX {
  @scala.inline
  def apply(decode: String => Buffer, decodeUnsafe: String => Buffer, encode: Buffer => String): BaseX = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decodeUnsafe = js.Any.fromFunction1(decodeUnsafe), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[BaseX]
  }
}

