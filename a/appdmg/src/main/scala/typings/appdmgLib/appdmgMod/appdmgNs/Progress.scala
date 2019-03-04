package typings
package appdmgLib.appdmgMod.appdmgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var current: scala.Double
  var status: appdmgLib.appdmgLibStrings.ok | appdmgLib.appdmgLibStrings.skip | appdmgLib.appdmgLibStrings.fail
  var title: java.lang.String
  var total: scala.Double
  var `type`: appdmgLib.appdmgLibStrings.`step-begin` | appdmgLib.appdmgLibStrings.`step-end`
}

object Progress {
  @scala.inline
  def apply(
    current: scala.Double,
    status: appdmgLib.appdmgLibStrings.ok | appdmgLib.appdmgLibStrings.skip | appdmgLib.appdmgLibStrings.fail,
    title: java.lang.String,
    total: scala.Double,
    `type`: appdmgLib.appdmgLibStrings.`step-begin` | appdmgLib.appdmgLibStrings.`step-end`
  ): Progress = {
    val __obj = js.Dynamic.literal(current = current, status = status.asInstanceOf[js.Any], title = title, total = total)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

