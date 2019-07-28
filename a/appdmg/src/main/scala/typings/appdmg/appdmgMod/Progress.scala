package typings.appdmg.appdmgMod

import typings.appdmg.appdmgStrings.`step-begin`
import typings.appdmg.appdmgStrings.`step-end`
import typings.appdmg.appdmgStrings.fail
import typings.appdmg.appdmgStrings.ok
import typings.appdmg.appdmgStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var current: Double
  var status: ok | skip | fail
  var title: String
  var total: Double
  var `type`: `step-begin` | `step-end`
}

object Progress {
  @scala.inline
  def apply(
    current: Double,
    status: ok | skip | fail,
    title: String,
    total: Double,
    `type`: `step-begin` | `step-end`
  ): Progress = {
    val __obj = js.Dynamic.literal(current = current, status = status.asInstanceOf[js.Any], title = title, total = total)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

