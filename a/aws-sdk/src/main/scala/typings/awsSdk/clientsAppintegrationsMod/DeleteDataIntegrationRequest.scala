package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataIntegrationRequest extends StObject {
  
  /**
    * A unique identifier for the DataIntegration.
    */
  var DataIntegrationIdentifier: Identifier
}
object DeleteDataIntegrationRequest {
  
  inline def apply(DataIntegrationIdentifier: Identifier): DeleteDataIntegrationRequest = {
    val __obj = js.Dynamic.literal(DataIntegrationIdentifier = DataIntegrationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDataIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setDataIntegrationIdentifier(value: Identifier): Self = StObject.set(x, "DataIntegrationIdentifier", value.asInstanceOf[js.Any])
  }
}
