package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SdkConfigurationProperty extends js.Object {
  /**
    * The default value of an SdkType configuration property.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of an SdkType configuration property.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user-friendly name of an SdkType configuration property.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * The name of a an SdkType configuration property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A boolean flag of an SdkType configuration property to indicate if the associated SDK configuration property is required (true) or not (false).
    */
  var required: js.UndefOr[Boolean] = js.native
}

object SdkConfigurationProperty {
  @scala.inline
  def apply(
    defaultValue: String = null,
    description: String = null,
    friendlyName: String = null,
    name: String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): SdkConfigurationProperty = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkConfigurationProperty]
  }
}

