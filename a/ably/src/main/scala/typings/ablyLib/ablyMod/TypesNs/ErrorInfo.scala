package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var code: scala.Double
  var message: java.lang.String
  var statusCode: scala.Double
}

object ErrorInfo {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, statusCode: scala.Double): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[ErrorInfo]
  }
}

