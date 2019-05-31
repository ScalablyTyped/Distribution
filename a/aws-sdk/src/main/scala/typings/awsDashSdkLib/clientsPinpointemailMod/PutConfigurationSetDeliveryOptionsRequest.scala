package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to associate with a dedicated IP pool.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsPinpointemailMod.ConfigurationSetName
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[SendingPoolName] = js.undefined
  /**
    * Whether Amazon Pinpoint should require that incoming email is delivered over a connection encrypted with Transport Layer Security (TLS).
    */
  var TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
}

object PutConfigurationSetDeliveryOptionsRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    SendingPoolName: SendingPoolName = null,
    TlsPolicy: TlsPolicy = null
  ): PutConfigurationSetDeliveryOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
    if (SendingPoolName != null) __obj.updateDynamic("SendingPoolName")(SendingPoolName)
    if (TlsPolicy != null) __obj.updateDynamic("TlsPolicy")(TlsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
  }
}

