package typings.awsSdk.appintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataIntegrationRequest extends StObject {
  
  /**
    * A unique identifier.
    */
  var Identifier: typings.awsSdk.appintegrationsMod.Identifier
}
object GetDataIntegrationRequest {
  
  inline def apply(Identifier: Identifier): GetDataIntegrationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataIntegrationRequest]
  }
  
  extension [Self <: GetDataIntegrationRequest](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
