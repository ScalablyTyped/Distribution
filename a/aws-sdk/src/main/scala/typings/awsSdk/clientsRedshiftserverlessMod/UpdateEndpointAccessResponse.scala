package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointAccessResponse extends StObject {
  
  /**
    * The updated VPC endpoint.
    */
  var endpoint: js.UndefOr[EndpointAccess] = js.undefined
}
object UpdateEndpointAccessResponse {
  
  inline def apply(): UpdateEndpointAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndpointAccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEndpointAccessResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: EndpointAccess): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
