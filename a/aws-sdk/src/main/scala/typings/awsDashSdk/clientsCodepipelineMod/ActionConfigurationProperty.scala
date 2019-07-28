package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionConfigurationProperty extends js.Object {
  /**
    * The description of the action configuration property that will be displayed to users.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * Whether the configuration property is a key.
    */
  var key: Boolean
  /**
    * The name of the action configuration property.
    */
  var name: ActionConfigurationKey
  /**
    * Indicates that the property will be used in conjunction with PollForJobs. When creating a custom action, an action can have up to one queryable property. If it has one, that property must be both required and not secret. If you create a pipeline with a custom action type, and that custom action contains a queryable property, the value for that configuration property is subject to additional restrictions. The value must be less than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
    */
  var queryable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the configuration property is a required value.
    */
  var required: Boolean
  /**
    * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails, GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs. When updating a pipeline, passing * * * * * without changing any other values of the action will preserve the prior value of the secret.
    */
  var secret: Boolean
  /**
    * The type of the configuration property.
    */
  var `type`: js.UndefOr[ActionConfigurationPropertyType] = js.undefined
}

object ActionConfigurationProperty {
  @scala.inline
  def apply(
    key: Boolean,
    name: ActionConfigurationKey,
    required: Boolean,
    secret: Boolean,
    description: Description = null,
    queryable: js.UndefOr[Boolean] = js.undefined,
    `type`: ActionConfigurationPropertyType = null
  ): ActionConfigurationProperty = {
    val __obj = js.Dynamic.literal(key = key, name = name, required = required, secret = secret)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(queryable)) __obj.updateDynamic("queryable")(queryable)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfigurationProperty]
  }
}

