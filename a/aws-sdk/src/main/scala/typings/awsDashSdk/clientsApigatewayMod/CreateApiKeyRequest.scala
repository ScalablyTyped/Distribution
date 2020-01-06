package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiKeyRequest extends js.Object {
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * The description of the ApiKey.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Specifies whether the ApiKey can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether (true) or not (false) the key identifier is distinct from the created API key value.
    */
  var generateDistinctId: js.UndefOr[Boolean] = js.native
  /**
    * The name of the ApiKey.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
    */
  var stageKeys: js.UndefOr[ListOfStageKeys] = js.native
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Specifies a value of the API key.
    */
  var value: js.UndefOr[String] = js.native
}

object CreateApiKeyRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    description: String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    generateDistinctId: js.UndefOr[scala.Boolean] = js.undefined,
    name: String = null,
    stageKeys: ListOfStageKeys = null,
    tags: MapOfStringToString = null,
    value: String = null
  ): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(generateDistinctId)) __obj.updateDynamic("generateDistinctId")(generateDistinctId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stageKeys != null) __obj.updateDynamic("stageKeys")(stageKeys.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
}

