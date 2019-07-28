package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregexp extends js.Object {
  def array2alternatives(array: js.Array[String]): String
}

object Typeofregexp {
  @scala.inline
  def apply(array2alternatives: js.Array[String] => String): Typeofregexp = {
    val __obj = js.Dynamic.literal(array2alternatives = js.Any.fromFunction1(array2alternatives))
  
    __obj.asInstanceOf[Typeofregexp]
  }
}

