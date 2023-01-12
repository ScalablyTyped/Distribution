package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVcenterClientsRequest extends StObject {
  
  /**
    * Maximum results to be returned in DescribeVcenterClients.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * Next pagination token to be provided for DescribeVcenterClients.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeVcenterClientsRequest {
  
  inline def apply(): DescribeVcenterClientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVcenterClientsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVcenterClientsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
