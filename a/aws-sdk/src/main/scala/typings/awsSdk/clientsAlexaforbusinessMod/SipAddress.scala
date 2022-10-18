package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipAddress extends StObject {
  
  /**
    * The type of the SIP address.
    */
  var Type: SipType
  
  /**
    * The URI for the SIP address.
    */
  var Uri: SipUri
}
object SipAddress {
  
  inline def apply(Type: SipType, Uri: SipUri): SipAddress = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SipAddress]
  }
  
  extension [Self <: SipAddress](x: Self) {
    
    inline def setType(value: SipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: SipUri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
