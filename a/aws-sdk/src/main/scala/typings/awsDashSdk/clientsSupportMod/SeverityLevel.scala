package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeverityLevel extends js.Object {
  /**
    * One of four values: "low," "medium," "high," and "urgent". These values correspond to response times returned to the caller in severityLevel.name. 
    */
  var code: js.UndefOr[SeverityLevelCode] = js.undefined
  /**
    * The name of the severity level that corresponds to the severity level code.
    */
  var name: js.UndefOr[SeverityLevelName] = js.undefined
}

object SeverityLevel {
  @scala.inline
  def apply(code: SeverityLevelCode = null, name: SeverityLevelName = null): SeverityLevel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SeverityLevel]
  }
}

