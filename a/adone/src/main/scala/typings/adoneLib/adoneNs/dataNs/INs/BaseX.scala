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
    decode: js.Function1[java.lang.String, nodeLib.Buffer],
    decodeUnsafe: js.Function1[java.lang.String, nodeLib.Buffer],
    encode: js.Function1[nodeLib.Buffer, java.lang.String]
  ): BaseX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("decodeUnsafe")(decodeUnsafe)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[BaseX]
  }
}

