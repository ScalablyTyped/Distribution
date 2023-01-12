package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSet extends StObject {
  
  /**
    * A description of the resource set.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsFmsMod.Description] = js.undefined
  
  /**
    * A unique identifier for the resource set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[Base62Id] = js.undefined
  
  /**
    * The last time that the resource set was changed.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The descriptive name of the resource set. You can't change the name of a resource set after you create it.
    */
  var Name: typings.awsSdk.clientsFmsMod.Name
  
  /**
    * Determines the resources that can be associated to the resource set. Depending on your setting for max results and the number of resource sets, a single call might not return the full list.
    */
  var ResourceTypeList: typings.awsSdk.clientsFmsMod.ResourceTypeList
  
  /**
    * An optional token that you can use for optimistic locking. Firewall Manager returns a token to your requests that access the resource set. The token marks the state of the resource set resource at the time of the request. Update tokens are not allowed when creating a resource set. After creation, each subsequent update call to the resource set requires the update token.  To make an unconditional change to the resource set, omit the token in your update request. Without the token, Firewall Manager performs your updates regardless of whether the resource set has changed since you last retrieved it. To make a conditional change to the resource set, provide the token in your update request. Firewall Manager uses the token to ensure that the resource set hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the resource set again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typings.awsSdk.clientsFmsMod.UpdateToken] = js.undefined
}
object ResourceSet {
  
  inline def apply(Name: Name, ResourceTypeList: ResourceTypeList): ResourceSet = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceTypeList = ResourceTypeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceSet] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Base62Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeList(value: ResourceTypeList): Self = StObject.set(x, "ResourceTypeList", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeListVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypeList", js.Array(value*))
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    inline def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
