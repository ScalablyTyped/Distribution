package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCidrBlocksRequest extends StObject {
  
  /**
    * The UUID of the CIDR collection.
    */
  var CollectionId: UUID
  
  /**
    * The name of the CIDR collection location.
    */
  var LocationName: js.UndefOr[CidrLocationNameDefaultNotAllowed] = js.undefined
  
  /**
    * Maximum number of results you want returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53Mod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token to indicate where the service is to begin enumerating results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCidrBlocksRequest {
  
  inline def apply(CollectionId: UUID): ListCidrBlocksRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCidrBlocksRequest]
  }
  
  extension [Self <: ListCidrBlocksRequest](x: Self) {
    
    inline def setCollectionId(value: UUID): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setLocationName(value: CidrLocationNameDefaultNotAllowed): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "LocationName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
