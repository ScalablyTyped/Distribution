package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Raw extends js.Object {
  var raw: java.lang.String
  var rawValue: scala.Double
}

object Anon_Raw {
  @scala.inline
  def apply(raw: java.lang.String, rawValue: scala.Double): Anon_Raw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("rawValue")(rawValue)
    __obj.asInstanceOf[Anon_Raw]
  }
}

