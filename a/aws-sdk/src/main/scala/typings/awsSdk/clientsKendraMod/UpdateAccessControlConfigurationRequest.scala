package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccessControlConfigurationRequest extends StObject {
  
  /**
    * Information you want to update on principals (users and/or groups) and which documents they should have access to. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.undefined
  
  /**
    * A new description for the access control configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The updated list of principal lists that define the hierarchy for which documents users should have access to.
    */
  var HierarchicalAccessControlList: js.UndefOr[HierarchicalPrincipalList] = js.undefined
  
  /**
    * The identifier of the access control configuration you want to update.
    */
  var Id: AccessControlConfigurationId
  
  /**
    * The identifier of the index for an access control configuration.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A new name for the access control configuration.
    */
  var Name: js.UndefOr[AccessControlConfigurationName] = js.undefined
}
object UpdateAccessControlConfigurationRequest {
  
  inline def apply(Id: AccessControlConfigurationId, IndexId: IndexId): UpdateAccessControlConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessControlConfigurationRequest]
  }
  
  extension [Self <: UpdateAccessControlConfigurationRequest](x: Self) {
    
    inline def setAccessControlList(value: PrincipalList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setAccessControlListVarargs(value: Principal*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHierarchicalAccessControlList(value: HierarchicalPrincipalList): Self = StObject.set(x, "HierarchicalAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalAccessControlListUndefined: Self = StObject.set(x, "HierarchicalAccessControlList", js.undefined)
    
    inline def setHierarchicalAccessControlListVarargs(value: HierarchicalPrincipal*): Self = StObject.set(x, "HierarchicalAccessControlList", js.Array(value*))
    
    inline def setId(value: AccessControlConfigurationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessControlConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
