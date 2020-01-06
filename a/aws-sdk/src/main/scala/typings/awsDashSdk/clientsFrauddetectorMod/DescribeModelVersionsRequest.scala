package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelVersionsRequest extends js.Object {
  /**
    * The maximum number of results to return.
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
    * The model version. 
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.native
  /**
    * The next token from the previous results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeModelVersionsRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    modelId: identifier = null,
    modelType: ModelTypeEnum = null,
    modelVersionNumber: nonEmptyString = null,
    nextToken: String = null
  ): DescribeModelVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (modelVersionNumber != null) __obj.updateDynamic("modelVersionNumber")(modelVersionNumber.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelVersionsRequest]
  }
}

