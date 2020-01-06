package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelsRequest extends js.Object {
  /**
    * The maximum results to return for the request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[identifier] = js.native
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  /**
    * The next token for the request.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetModelsRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    modelId: identifier = null,
    modelType: ModelTypeEnum = null,
    nextToken: String = null
  ): GetModelsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelsRequest]
  }
}

