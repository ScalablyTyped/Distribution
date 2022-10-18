package typings.awsSdk.clientsIotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTunnelAccessTokenResponse extends StObject {
  
  /**
    * The client access token that the destination local proxy uses to connect to IoT Secure Tunneling.
    */
  var destinationAccessToken: js.UndefOr[ClientAccessToken] = js.undefined
  
  /**
    * The client access token that the source local proxy uses to connect to IoT Secure Tunneling.
    */
  var sourceAccessToken: js.UndefOr[ClientAccessToken] = js.undefined
  
  /**
    * The Amazon Resource Name for the tunnel.
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.undefined
}
object RotateTunnelAccessTokenResponse {
  
  inline def apply(): RotateTunnelAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateTunnelAccessTokenResponse]
  }
  
  extension [Self <: RotateTunnelAccessTokenResponse](x: Self) {
    
    inline def setDestinationAccessToken(value: ClientAccessToken): Self = StObject.set(x, "destinationAccessToken", value.asInstanceOf[js.Any])
    
    inline def setDestinationAccessTokenUndefined: Self = StObject.set(x, "destinationAccessToken", js.undefined)
    
    inline def setSourceAccessToken(value: ClientAccessToken): Self = StObject.set(x, "sourceAccessToken", value.asInstanceOf[js.Any])
    
    inline def setSourceAccessTokenUndefined: Self = StObject.set(x, "sourceAccessToken", js.undefined)
    
    inline def setTunnelArn(value: TunnelArn): Self = StObject.set(x, "tunnelArn", value.asInstanceOf[js.Any])
    
    inline def setTunnelArnUndefined: Self = StObject.set(x, "tunnelArn", js.undefined)
  }
}
