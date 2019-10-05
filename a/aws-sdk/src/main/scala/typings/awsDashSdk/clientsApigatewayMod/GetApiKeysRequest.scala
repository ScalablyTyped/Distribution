package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiKeysRequest extends js.Object {
  /**
    * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
    */
  var customerId: js.UndefOr[String] = js.undefined
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains key values.
    */
  var includeValues: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The name of queried API keys.
    */
  var nameQuery: js.UndefOr[String] = js.undefined
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
}

object GetApiKeysRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    includeValues: js.UndefOr[scala.Boolean] = js.undefined,
    limit: Int | scala.Double = null,
    nameQuery: String = null,
    position: String = null
  ): GetApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (!js.isUndefined(includeValues)) __obj.updateDynamic("includeValues")(includeValues)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nameQuery != null) __obj.updateDynamic("nameQuery")(nameQuery)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetApiKeysRequest]
  }
}

