package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelephonySettings extends js.Object {
  /**
    * Allows or denies inbound calling.
    */
  var InboundCalling: Boolean = js.native
  /**
    * Allows or denies outbound calling.
    */
  var OutboundCalling: Boolean = js.native
  /**
    * Allows or denies SMS messaging.
    */
  var SMS: Boolean = js.native
}

object TelephonySettings {
  @scala.inline
  def apply(InboundCalling: Boolean, OutboundCalling: Boolean, SMS: Boolean): TelephonySettings = {
    val __obj = js.Dynamic.literal(InboundCalling = InboundCalling.asInstanceOf[js.Any], OutboundCalling = OutboundCalling.asInstanceOf[js.Any], SMS = SMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelephonySettings]
  }
  @scala.inline
  implicit class TelephonySettingsOps[Self <: TelephonySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInboundCalling(value: Boolean): Self = this.set("InboundCalling", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundCalling(value: Boolean): Self = this.set("OutboundCalling", value.asInstanceOf[js.Any])
    @scala.inline
    def setSMS(value: Boolean): Self = this.set("SMS", value.asInstanceOf[js.Any])
  }
  
}

