package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelephonySettings extends StObject {
  
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
  
  inline def apply(InboundCalling: Boolean, OutboundCalling: Boolean, SMS: Boolean): TelephonySettings = {
    val __obj = js.Dynamic.literal(InboundCalling = InboundCalling.asInstanceOf[js.Any], OutboundCalling = OutboundCalling.asInstanceOf[js.Any], SMS = SMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelephonySettings]
  }
  
  extension [Self <: TelephonySettings](x: Self) {
    
    inline def setInboundCalling(value: Boolean): Self = StObject.set(x, "InboundCalling", value.asInstanceOf[js.Any])
    
    inline def setOutboundCalling(value: Boolean): Self = StObject.set(x, "OutboundCalling", value.asInstanceOf[js.Any])
    
    inline def setSMS(value: Boolean): Self = StObject.set(x, "SMS", value.asInstanceOf[js.Any])
  }
}
