package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRule extends js.Object {
  /**
    *  The condition for a URL rewrite or redirect rule, e.g. country code. 
    */
  var condition: js.UndefOr[Condition] = js.native
  /**
    *  The source pattern for a URL rewrite or redirect rule. 
    */
  var source: Source = js.native
  /**
    *  The status code for a URL rewrite or redirect rule. 
    */
  var status: js.UndefOr[Status] = js.native
  /**
    *  The target pattern for a URL rewrite or redirect rule. 
    */
  var target: Target = js.native
}

object CustomRule {
  @scala.inline
  def apply(source: Source, target: Target, condition: Condition = null, status: Status = null): CustomRule = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRule]
  }
}

