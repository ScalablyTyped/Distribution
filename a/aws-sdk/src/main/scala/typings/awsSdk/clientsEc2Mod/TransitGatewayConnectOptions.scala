package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayConnectOptions extends StObject {
  
  /**
    * The tunnel protocol.
    */
  var Protocol: js.UndefOr[ProtocolValue] = js.undefined
}
object TransitGatewayConnectOptions {
  
  inline def apply(): TransitGatewayConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setProtocol(value: ProtocolValue): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
