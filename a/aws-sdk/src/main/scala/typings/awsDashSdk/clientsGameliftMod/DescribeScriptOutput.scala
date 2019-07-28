package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScriptOutput extends js.Object {
  /**
    * Set of properties describing the requested script.
    */
  var Script: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Script] = js.undefined
}

object DescribeScriptOutput {
  @scala.inline
  def apply(Script: Script = null): DescribeScriptOutput = {
    val __obj = js.Dynamic.literal()
    if (Script != null) __obj.updateDynamic("Script")(Script)
    __obj.asInstanceOf[DescribeScriptOutput]
  }
}

