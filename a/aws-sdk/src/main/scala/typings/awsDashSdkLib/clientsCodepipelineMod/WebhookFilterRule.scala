package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookFilterRule extends js.Object {
  /**
    * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by the JsonPath expression must match the value specified in the MatchEquals field, otherwise the request will be ignored. For more information about JsonPath expressions, see Java JsonPath implementation in GitHub.
    */
  var jsonPath: JsonPath
  /**
    * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the request will be ignored. Properties from the target action configuration can be included as placeholders in this value by surrounding the action configuration key with curly braces. For example, if the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of "master", the MatchEquals value will be evaluated as "refs/heads/master". For a list of action configuration properties for built-in action types, see Pipeline Structure Reference Action Requirements.
    */
  var matchEquals: js.UndefOr[MatchEquals] = js.undefined
}

object WebhookFilterRule {
  @scala.inline
  def apply(jsonPath: JsonPath, matchEquals: MatchEquals = null): WebhookFilterRule = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath)
    if (matchEquals != null) __obj.updateDynamic("matchEquals")(matchEquals)
    __obj.asInstanceOf[WebhookFilterRule]
  }
}

