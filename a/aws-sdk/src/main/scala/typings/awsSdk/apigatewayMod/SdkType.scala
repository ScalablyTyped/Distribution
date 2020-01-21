package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SdkType extends js.Object {
  /**
    * A list of configuration properties of an SdkType.
    */
  var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.native
  /**
    * The description of an SdkType.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user-friendly name of an SdkType instance.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * The identifier of an SdkType instance.
    */
  var id: js.UndefOr[String] = js.native
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
    if (configurationProperties != null) __obj.updateDynamic("configurationProperties")(configurationProperties.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkType]
  }
}

