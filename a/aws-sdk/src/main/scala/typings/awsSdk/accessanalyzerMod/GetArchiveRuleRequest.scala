package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArchiveRuleRequest extends js.Object {
  /**
    * The name of the analyzer to retrieve rules from.
    */
  var analyzerName: Name = js.native
  /**
    * The name of the rule to retrieve.
    */
  var ruleName: Name = js.native
}

object GetArchiveRuleRequest {
  @scala.inline
  def apply(analyzerName: Name, ruleName: Name): GetArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArchiveRuleRequest]
  }
  @scala.inline
  implicit class GetArchiveRuleRequestOps[Self <: GetArchiveRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalyzerName(value: Name): Self = this.set("analyzerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: Name): Self = this.set("ruleName", value.asInstanceOf[js.Any])
  }
  
}

