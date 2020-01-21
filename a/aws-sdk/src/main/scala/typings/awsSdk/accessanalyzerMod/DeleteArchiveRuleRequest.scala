package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteArchiveRuleRequest extends js.Object {
  /**
    * The name of the analyzer that associated with the archive rule to delete.
    */
  var analyzerName: Name = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the rule to delete.
    */
  var ruleName: Name = js.native
}

object DeleteArchiveRuleRequest {
  @scala.inline
  def apply(analyzerName: Name, ruleName: Name, clientToken: String = null): DeleteArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveRuleRequest]
  }
}

