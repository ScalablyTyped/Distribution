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
    decode: java.lang.String => js.Array[scala.Double],
    encode: js.Array[scala.Double] => java.lang.String
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_Array]
  }
}

