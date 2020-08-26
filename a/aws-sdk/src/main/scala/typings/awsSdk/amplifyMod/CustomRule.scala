package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRule extends js.Object {
  /**
    *  The condition for a URL rewrite or redirect rule, such as a country code. 
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
  def apply(source: Source, target: Target): CustomRule = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRule]
  }
  @scala.inline
  implicit class CustomRuleOps[Self <: CustomRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

