package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelephonySettings extends js.Object {
  /**
    * Allows or denies inbound calling.
    */
  var InboundCalling: Boolean
  /**
    * Allows or denies outbound calling.
    */
  var OutboundCalling: Boolean
  /**
    * Allows or denies SMS messaging.
    */
  var SMS: Boolean
}

object TelephonySettings {
  @scala.inline
  def apply(InboundCalling: Boolean, OutboundCalling: Boolean, SMS: Boolean): TelephonySettings = {
    val __obj = js.Dynamic.literal(InboundCalling = InboundCalling, OutboundCalling = OutboundCalling, SMS = SMS)
  
    __obj.asInstanceOf[TelephonySettings]
  }
}

