package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRule extends js.Object {
  /**
    *  The condition for a URL rewrite or redirect rule, e.g. country code. 
    */
  var condition: js.UndefOr[Condition] = js.undefined
  /**
    *  The source pattern for a URL rewrite or redirect rule. 
    */
  var source: Source
  /**
    *  The status code for a URL rewrite or redirect rule. 
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    *  The target pattern for a URL rewrite or redirect rule. 
    */
  var target: Target
}

object CustomRule {
  @scala.inline
  def apply(source: Source, target: Target, condition: Condition = null, status: Status = null): CustomRule = {
    val __obj = js.Dynamic.literal(source = source, target = target)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CustomRule]
  }
}

