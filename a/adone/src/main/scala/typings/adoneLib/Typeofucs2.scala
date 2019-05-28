package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofucs2 extends js.Object {
  def decode(string: java.lang.String): js.Array[scala.Double]
  def encode(array: js.Array[scala.Double]): java.lang.String
}

object Typeofucs2 {
  @scala.inline
  def apply(
    decode: java.lang.String => js.Array[scala.Double],
    encode: js.Array[scala.Double] => java.lang.String
  ): Typeofucs2 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Typeofucs2]
  }
}

