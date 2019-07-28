package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryOptions extends js.Object {
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[PoolName] = js.undefined
  /**
    * Specifies whether Amazon Pinpoint should require that incoming email is delivered over a connection that’s encrypted by using Transport Layer Security (TLS). If this value is set to Require, Amazon Pinpoint will bounce email messages that cannot be delivered over TLS. The default value is Optional.
    */
  var TlsPolicy: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.TlsPolicy] = js.undefined
}

object DeliveryOptions {
  @scala.inline
  def apply(SendingPoolName: PoolName = null, TlsPolicy: TlsPolicy = null): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    if (SendingPoolName != null) __obj.updateDynamic("SendingPoolName")(SendingPoolName)
    if (TlsPolicy != null) __obj.updateDynamic("TlsPolicy")(TlsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryOptions]
  }
}

