package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryOptions extends js.Object {
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[PoolName] = js.native
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.TlsPolicy] = js.native
}

object DeliveryOptions {
  @scala.inline
  def apply(SendingPoolName: PoolName = null, TlsPolicy: TlsPolicy = null): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    if (SendingPoolName != null) __obj.updateDynamic("SendingPoolName")(SendingPoolName.asInstanceOf[js.Any])
    if (TlsPolicy != null) __obj.updateDynamic("TlsPolicy")(TlsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryOptions]
  }
}

