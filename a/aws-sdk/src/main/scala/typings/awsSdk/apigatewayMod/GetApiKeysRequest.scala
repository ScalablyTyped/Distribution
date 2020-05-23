package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiKeysRequest extends js.Object {
  /**
    * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains key values.
    */
  var includeValues: js.UndefOr[NullableBoolean] = js.native
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The name of queried API keys.
    */
  var nameQuery: js.UndefOr[String] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}

object GetApiKeysRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    includeValues: js.UndefOr[NullableBoolean] = js.undefined,
    limit: js.UndefOr[NullableInteger] = js.undefined,
    nameQuery: String = null,
    position: String = null
  ): GetApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (!js.isUndefined(includeValues)) __obj.updateDynamic("includeValues")(includeValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (nameQuery != null) __obj.updateDynamic("nameQuery")(nameQuery.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeysRequest]
  }
}

