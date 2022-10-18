package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptHandshakeResponse extends StObject {
  
  /**
    * A structure that contains details about the accepted handshake.
    */
  var Handshake: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Handshake] = js.undefined
}
object AcceptHandshakeResponse {
  
  inline def apply(): AcceptHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptHandshakeResponse]
  }
  
  extension [Self <: AcceptHandshakeResponse](x: Self) {
    
    inline def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    inline def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
