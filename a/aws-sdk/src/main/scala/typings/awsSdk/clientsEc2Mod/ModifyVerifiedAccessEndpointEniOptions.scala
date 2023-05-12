package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessEndpointEniOptions extends StObject {
  
  /**
    * The IP port number.
    */
  var Port: js.UndefOr[VerifiedAccessEndpointPortNumber] = js.undefined
  
  /**
    * The IP protocol.
    */
  var Protocol: js.UndefOr[VerifiedAccessEndpointProtocol] = js.undefined
}
object ModifyVerifiedAccessEndpointEniOptions {
  
  inline def apply(): ModifyVerifiedAccessEndpointEniOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessEndpointEniOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessEndpointEniOptions] (val x: Self) extends AnyVal {
    
    inline def setPort(value: VerifiedAccessEndpointPortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: VerifiedAccessEndpointProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
