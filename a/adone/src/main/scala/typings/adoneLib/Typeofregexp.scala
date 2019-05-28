package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregexp extends js.Object {
  def array2alternatives(array: js.Array[java.lang.String]): java.lang.String
}

object Typeofregexp {
  @scala.inline
  def apply(array2alternatives: js.Array[java.lang.String] => java.lang.String): Typeofregexp = {
    val __obj = js.Dynamic.literal(array2alternatives = js.Any.fromFunction1(array2alternatives))
  
    __obj.asInstanceOf[Typeofregexp]
  }
}

