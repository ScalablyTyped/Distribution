package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceSetResourcesRequest extends StObject {
  
  /**
    * A unique identifier for the resource set, used in a TODO to refer to the resource set.
    */
  var Identifier: ResourceId
  
  /**
    * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are available, in the response, Firewall Manager provides a NextToken value that you can use in a subsequent call to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListResourceSetResourcesRequest {
  
  inline def apply(Identifier: ResourceId): ListResourceSetResourcesRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceSetResourcesRequest]
  }
  
  extension [Self <: ListResourceSetResourcesRequest](x: Self) {
    
    inline def setIdentifier(value: ResourceId): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
