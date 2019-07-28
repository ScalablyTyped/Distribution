package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  /**
    * The timestamp when the API Key was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.undefined
  /**
    * The description of the API Key.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the API Key can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The identifier of the API Key.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The timestamp when the API Key was last updated.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the API Key.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A list of Stage resources that are associated with the ApiKey resource.
    */
  var stageKeys: js.UndefOr[ListOfString] = js.undefined
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * The value of the API Key.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ApiKey {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    customerId: String = null,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastUpdatedDate: Timestamp = null,
    name: String = null,
    stageKeys: ListOfString = null,
    tags: MapOfStringToString = null,
    value: String = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stageKeys != null) __obj.updateDynamic("stageKeys")(stageKeys)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ApiKey]
  }
}

