package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1Result extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var actionIncomplete: js.UndefOr[Boolean] = js.undefined
  var contexts: js.UndefOr[js.Array[DialogflowV1Context]] = js.undefined
  var fulfillment: js.UndefOr[DialogflowV1Fulfillment] = js.undefined
  var metadata: js.UndefOr[DialogflowV1Metadata] = js.undefined
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.undefined
  var resolvedQuery: js.UndefOr[String] = js.undefined
  var score: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var speech: js.UndefOr[String] = js.undefined
}

object DialogflowV1Result {
  @scala.inline
  def apply(
    action: String = null,
    actionIncomplete: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[DialogflowV1Context] = null,
    fulfillment: DialogflowV1Fulfillment = null,
    metadata: DialogflowV1Metadata = null,
    parameters: DialogflowV1Parameters = null,
    resolvedQuery: String = null,
    score: js.UndefOr[Double] = js.undefined,
    source: String = null,
    speech: String = null
  ): DialogflowV1Result = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(actionIncomplete)) __obj.updateDynamic("actionIncomplete")(actionIncomplete.get.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (fulfillment != null) __obj.updateDynamic("fulfillment")(fulfillment.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (resolvedQuery != null) __obj.updateDynamic("resolvedQuery")(resolvedQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (speech != null) __obj.updateDynamic("speech")(speech.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1Result]
  }
}

