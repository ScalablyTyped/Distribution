package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKey extends js.Object {
  /**
    * The timestamp when the API Key was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * The description of the API Key.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Specifies whether the API Key can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The identifier of the API Key.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The timestamp when the API Key was last updated.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the API Key.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of Stage resources that are associated with the ApiKey resource.
    */
  var stageKeys: js.UndefOr[ListOfString] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The value of the API Key.
    */
  var value: js.UndefOr[String] = js.native
}

object ApiKey {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    customerId: String = null,
    description: String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: String = null,
    lastUpdatedDate: Timestamp = null,
    name: String = null,
    stageKeys: ListOfString = null,
    tags: MapOfStringToString = null,
    value: String = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stageKeys != null) __obj.updateDynamic("stageKeys")(stageKeys.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}

