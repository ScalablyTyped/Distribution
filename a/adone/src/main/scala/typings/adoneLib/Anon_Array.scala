package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  def decode(string: java.lang.String): js.Array[scala.Double]
  def encode(array: js.Array[scala.Double]): java.lang.String
}

object Anon_Array {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, js.Array[scala.Double]],
    encode: js.Function1[js.Array[scala.Double], java.lang.String]
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode)
  
    __obj.asInstanceOf[Anon_Array]
  }
}

