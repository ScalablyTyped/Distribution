package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to specify the delivery options for.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsSesMod.ConfigurationSetName
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
    */
  var DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined
}

object PutConfigurationSetDeliveryOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, DeliveryOptions: DeliveryOptions = null): PutConfigurationSetDeliveryOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
    if (DeliveryOptions != null) __obj.updateDynamic("DeliveryOptions")(DeliveryOptions)
    __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
  }
}

