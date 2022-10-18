package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectVpcEndpointConnectionsResult extends StObject {
  
  /**
    * Information about the endpoints that were not rejected, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}
object RejectVpcEndpointConnectionsResult {
  
  inline def apply(): RejectVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectVpcEndpointConnectionsResult]
  }
  
  extension [Self <: RejectVpcEndpointConnectionsResult](x: Self) {
    
    inline def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value*))
  }
}
