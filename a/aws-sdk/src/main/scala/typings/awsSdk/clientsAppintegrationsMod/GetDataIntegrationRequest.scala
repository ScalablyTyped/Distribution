package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataIntegrationRequest extends StObject {
  
  /**
    * A unique identifier.
    */
  var Identifier: typings.awsSdk.clientsAppintegrationsMod.Identifier
}
object GetDataIntegrationRequest {
  
  inline def apply(Identifier: Identifier): GetDataIntegrationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
