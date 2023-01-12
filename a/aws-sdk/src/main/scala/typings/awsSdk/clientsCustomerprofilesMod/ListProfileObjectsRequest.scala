package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectsRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The maximum number of objects returned per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * The pagination token from the previous call to ListProfileObjects.
    */
  var NextToken: js.UndefOr[token] = js.undefined
  
  /**
    * Applies a filter to the response to include profile objects with the specified index values. This filter is only supported for ObjectTypeName _asset, _case and _order.
    */
  var ObjectFilter: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ObjectFilter] = js.undefined
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: typeName
  
  /**
    * The unique identifier of a customer profile.
    */
  var ProfileId: uuid
}
object ListProfileObjectsRequest {
  
  inline def apply(DomainName: name, ObjectTypeName: typeName, ProfileId: uuid): ListProfileObjectsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any], ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileObjectsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProfileObjectsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectFilter(value: ObjectFilter): Self = StObject.set(x, "ObjectFilter", value.asInstanceOf[js.Any])
    
    inline def setObjectFilterUndefined: Self = StObject.set(x, "ObjectFilter", js.undefined)
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: uuid): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
