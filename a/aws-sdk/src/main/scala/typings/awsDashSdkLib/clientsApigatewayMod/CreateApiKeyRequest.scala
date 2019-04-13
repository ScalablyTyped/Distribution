package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiKeyRequest extends js.Object {
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.undefined
  /**
    * The description of the ApiKey.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the ApiKey can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether (true) or not (false) the key identifier is distinct from the created API key value.
    */
  var generateDistinctId: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the ApiKey.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
    */
  var stageKeys: js.UndefOr[ListOfStageKeys] = js.undefined
  /**
    * Specifies a value of the API key.
    */
  var value: js.UndefOr[String] = js.undefined
}

object CreateApiKeyRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    generateDistinctId: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    stageKeys: ListOfStageKeys = null,
    value: String = null
  ): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(generateDistinctId)) __obj.updateDynamic("generateDistinctId")(generateDistinctId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stageKeys != null) __obj.updateDynamic("stageKeys")(stageKeys)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
}

