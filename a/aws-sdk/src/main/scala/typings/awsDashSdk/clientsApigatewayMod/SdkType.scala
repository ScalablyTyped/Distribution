package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdkType extends js.Object {
  /**
    * A list of configuration properties of an SdkType.
    */
  var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.undefined
  /**
    * The description of an SdkType.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The user-friendly name of an SdkType instance.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  /**
    * The identifier of an SdkType instance.
    */
  var id: js.UndefOr[String] = js.undefined
}

object SdkType {
  @scala.inline
  def apply(
    configurationProperties: ListOfSdkConfigurationProperty = null,
    description: String = null,
    friendlyName: String = null,
    id: String = null
  ): SdkType = {
    val __obj = js.Dynamic.literal()
    if (configurationProperties != null) __obj.updateDynamic("configurationProperties")(configurationProperties)
    if (description != null) __obj.updateDynamic("description")(description)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[SdkType]
  }
}

