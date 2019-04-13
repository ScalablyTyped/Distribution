package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookFilterRule extends js.Object {
  /**
    * A JsonPath expression that will be applied to the body/payload of the webhook. The value selected by JsonPath expression must match the value specified in the matchEquals field, otherwise the request will be ignored. More information on JsonPath expressions can be found here: https://github.com/json-path/JsonPath.
    */
  var jsonPath: JsonPath
  /**
    * The value selected by the JsonPath expression must match what is supplied in the MatchEquals field, otherwise the request will be ignored. Properties from the target action configuration can be included as placeholders in this value by surrounding the action configuration key with curly braces. For example, if the value supplied here is "refs/heads/{Branch}" and the target action has an action configuration property called "Branch" with a value of "master", the MatchEquals value will be evaluated as "refs/heads/master". A list of action configuration properties for built-in action types can be found here: Pipeline Structure Reference Action Requirements.
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

