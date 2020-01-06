package typings.awsDashSdk.clientsChimeMod

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
}

