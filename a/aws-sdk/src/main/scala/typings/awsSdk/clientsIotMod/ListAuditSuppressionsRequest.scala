package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditSuppressionsRequest extends StObject {
  
  /**
    *  Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't provided, ascendingOrder=true. 
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  
  var checkName: js.UndefOr[AuditCheckName] = js.undefined
  
  /**
    *  The maximum number of results to return at one time. The default is 25. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The token for the next set of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
}
object ListAuditSuppressionsRequest {
  
  inline def apply(): ListAuditSuppressionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditSuppressionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAuditSuppressionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    inline def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    inline def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setCheckNameUndefined: Self = StObject.set(x, "checkName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
  }
}
