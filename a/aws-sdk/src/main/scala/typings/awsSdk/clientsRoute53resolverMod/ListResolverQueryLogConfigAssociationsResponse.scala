package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverQueryLogConfigAssociationsResponse extends StObject {
  
  /**
    * If there are more than MaxResults query logging associations, you can submit another ListResolverQueryLogConfigAssociations request to get the next group of associations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * A list that contains one ResolverQueryLogConfigAssociations element for each query logging association that matches the values that you specified for Filter.
    */
  var ResolverQueryLogConfigAssociations: js.UndefOr[ResolverQueryLogConfigAssociationList] = js.undefined
  
  /**
    * The total number of query logging associations that were created by the current account in the specified Region. This count can differ from the number of associations that are returned in a ListResolverQueryLogConfigAssociations response, depending on the values that you specify in the request.
    */
  var TotalCount: js.UndefOr[Count] = js.undefined
  
  /**
    * The total number of query logging associations that were created by the current account in the specified Region and that match the filters that were specified in the ListResolverQueryLogConfigAssociations request. For the total number of associations that were created by the current account in the specified Region, see TotalCount.
    */
  var TotalFilteredCount: js.UndefOr[Count] = js.undefined
}
object ListResolverQueryLogConfigAssociationsResponse {
  
  inline def apply(): ListResolverQueryLogConfigAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverQueryLogConfigAssociationsResponse]
  }
  
  extension [Self <: ListResolverQueryLogConfigAssociationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverQueryLogConfigAssociations(value: ResolverQueryLogConfigAssociationList): Self = StObject.set(x, "ResolverQueryLogConfigAssociations", value.asInstanceOf[js.Any])
    
    inline def setResolverQueryLogConfigAssociationsUndefined: Self = StObject.set(x, "ResolverQueryLogConfigAssociations", js.undefined)
    
    inline def setResolverQueryLogConfigAssociationsVarargs(value: ResolverQueryLogConfigAssociation*): Self = StObject.set(x, "ResolverQueryLogConfigAssociations", js.Array(value*))
    
    inline def setTotalCount(value: Count): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
    
    inline def setTotalFilteredCount(value: Count): Self = StObject.set(x, "TotalFilteredCount", value.asInstanceOf[js.Any])
    
    inline def setTotalFilteredCountUndefined: Self = StObject.set(x, "TotalFilteredCount", js.undefined)
  }
}
