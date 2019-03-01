package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Number extends js.Object {
  var number: scala.Double
  var prefix: java.lang.String
}

object Anon_Number {
  @scala.inline
  def apply(number: scala.Double, prefix: java.lang.String): Anon_Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Number]
  }
}

