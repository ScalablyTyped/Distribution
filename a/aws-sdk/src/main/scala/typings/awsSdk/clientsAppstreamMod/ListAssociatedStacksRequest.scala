package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedStacksRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var FleetName: String
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAssociatedStacksRequest {
  
  inline def apply(FleetName: String): ListAssociatedStacksRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedStacksRequest]
  }
  
  extension [Self <: ListAssociatedStacksRequest](x: Self) {
    
    inline def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
