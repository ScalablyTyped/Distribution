package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttributeGroupsResponse extends StObject {
  
  /**
    * This list of attribute groups.
    */
  var attributeGroups: js.UndefOr[AttributeGroupSummaries] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAttributeGroupsResponse {
  
  inline def apply(): ListAttributeGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttributeGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAttributeGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributeGroups(value: AttributeGroupSummaries): Self = StObject.set(x, "attributeGroups", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupsUndefined: Self = StObject.set(x, "attributeGroups", js.undefined)
    
    inline def setAttributeGroupsVarargs(value: AttributeGroupSummary*): Self = StObject.set(x, "attributeGroups", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
