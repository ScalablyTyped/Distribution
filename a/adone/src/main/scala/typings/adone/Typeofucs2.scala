package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofucs2 extends js.Object {
  def decode(string: String): js.Array[Double]
  def encode(array: js.Array[Double]): String
}

object Typeofucs2 {
  @scala.inline
  def apply(decode: String => js.Array[Double], encode: js.Array[Double] => String): Typeofucs2 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Typeofucs2]
  }
}

