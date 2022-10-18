package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociationsRequest extends StObject {
  
  /**
    * One or more filters. Use a filter to return a more specific list of results.  Filtering associations using the InstanceID attribute only returns legacy associations created using the InstanceID attribute. Associations targeting the managed node that are part of the Target Attributes ResourceGroup or Tags aren't returned. 
    */
  var AssociationFilterList: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object ListAssociationsRequest {
  
  inline def apply(): ListAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsRequest]
  }
  
  extension [Self <: ListAssociationsRequest](x: Self) {
    
    inline def setAssociationFilterList(value: AssociationFilterList): Self = StObject.set(x, "AssociationFilterList", value.asInstanceOf[js.Any])
    
    inline def setAssociationFilterListUndefined: Self = StObject.set(x, "AssociationFilterList", js.undefined)
    
    inline def setAssociationFilterListVarargs(value: AssociationFilter*): Self = StObject.set(x, "AssociationFilterList", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
