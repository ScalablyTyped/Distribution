package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelephonySettings extends StObject {
  
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
  implicit class TelephonySettingsMutableBuilder[Self <: TelephonySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInboundCalling(value: Boolean): Self = StObject.set(x, "InboundCalling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundCalling(value: Boolean): Self = StObject.set(x, "OutboundCalling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMS(value: Boolean): Self = StObject.set(x, "SMS", value.asInstanceOf[js.Any])
  }
}
