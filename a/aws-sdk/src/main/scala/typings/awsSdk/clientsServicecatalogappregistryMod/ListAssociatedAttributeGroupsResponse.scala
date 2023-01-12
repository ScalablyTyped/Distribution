package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedAttributeGroupsResponse extends StObject {
  
  /**
    * A list of attribute group IDs.
    */
  var attributeGroups: js.UndefOr[AttributeGroupIds] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssociatedAttributeGroupsResponse {
  
  inline def apply(): ListAssociatedAttributeGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedAttributeGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociatedAttributeGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributeGroups(value: AttributeGroupIds): Self = StObject.set(x, "attributeGroups", value.asInstanceOf[js.Any])
    
    inline def setAttributeGroupsUndefined: Self = StObject.set(x, "attributeGroups", js.undefined)
    
    inline def setAttributeGroupsVarargs(value: AttributeGroupId*): Self = StObject.set(x, "attributeGroups", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
