package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloseEventDetails extends js.Object {
  var code: scala.Double
  var reason: java.lang.String
  var wasClean: scala.Boolean
}

object ICloseEventDetails {
  @scala.inline
  def apply(code: scala.Double, reason: java.lang.String, wasClean: scala.Boolean): ICloseEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("wasClean")(wasClean)
    __obj.asInstanceOf[ICloseEventDetails]
  }
}

