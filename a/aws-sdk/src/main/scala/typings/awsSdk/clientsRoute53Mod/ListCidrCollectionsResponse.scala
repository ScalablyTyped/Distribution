package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCidrCollectionsResponse extends StObject {
  
  /**
    * A complex type with information about the CIDR collection.
    */
  var CidrCollections: js.UndefOr[CollectionSummaries] = js.undefined
  
  /**
    * An opaque pagination token to indicate where the service is to begin enumerating results. If no value is provided, the listing of results starts from the beginning.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCidrCollectionsResponse {
  
  inline def apply(): ListCidrCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCidrCollectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCidrCollectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCidrCollections(value: CollectionSummaries): Self = StObject.set(x, "CidrCollections", value.asInstanceOf[js.Any])
    
    inline def setCidrCollectionsUndefined: Self = StObject.set(x, "CidrCollections", js.undefined)
    
    inline def setCidrCollectionsVarargs(value: CollectionSummary*): Self = StObject.set(x, "CidrCollections", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
