package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAllFeaturesResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake created to support this request to enable all features in the organization.
    */
  var Handshake: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Handshake] = js.undefined
}
object EnableAllFeaturesResponse {
  
  inline def apply(): EnableAllFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAllFeaturesResponse]
  }
  
  extension [Self <: EnableAllFeaturesResponse](x: Self) {
    
    inline def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    inline def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
