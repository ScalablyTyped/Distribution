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
}

