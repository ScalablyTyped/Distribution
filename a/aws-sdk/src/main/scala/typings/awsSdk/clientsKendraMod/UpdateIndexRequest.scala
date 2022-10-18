package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIndexRequest extends StObject {
  
  /**
    * Sets the number of additional document storage and query capacity units that should be used by the index. You can change the capacity of the index up to 5 times per day, or make 5 API calls. If you are using extra storage units, you can't reduce the storage capacity below what is required to meet the storage needs for your index.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined
  
  /**
    * A new description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The document metadata configuration you want to update for the index. Document metadata are fields or attributes associated with your documents. For example, the company department name associated with each document.
    */
  var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.undefined
  
  /**
    * The identifier of the index you want to update.
    */
  var Id: IndexId
  
  /**
    * The name of the index you want to update.
    */
  var Name: js.UndefOr[IndexName] = js.undefined
  
  /**
    * An Identity and Access Management (IAM) role that gives Amazon Kendra permission to access Amazon CloudWatch logs and metrics.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  /**
    * The user context policy.
    */
  var UserContextPolicy: js.UndefOr[typings.awsSdk.clientsKendraMod.UserContextPolicy] = js.undefined
  
  /**
    * Enables fetching access levels of groups and users from an IAM Identity Center (successor to Single Sign-On) identity source. To configure this, see UserGroupResolutionConfiguration.
    */
  var UserGroupResolutionConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.UserGroupResolutionConfiguration] = js.undefined
  
  /**
    * The user token configuration.
    */
  var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
}
object UpdateIndexRequest {
  
  inline def apply(Id: IndexId): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
  
  extension [Self <: UpdateIndexRequest](x: Self) {
    
    inline def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDocumentMetadataConfigurationUpdates(value: DocumentMetadataConfigurationList): Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataConfigurationUpdatesUndefined: Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", js.undefined)
    
    inline def setDocumentMetadataConfigurationUpdatesVarargs(value: DocumentMetadataConfiguration*): Self = StObject.set(x, "DocumentMetadataConfigurationUpdates", js.Array(value*))
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUserContextPolicy(value: UserContextPolicy): Self = StObject.set(x, "UserContextPolicy", value.asInstanceOf[js.Any])
    
    inline def setUserContextPolicyUndefined: Self = StObject.set(x, "UserContextPolicy", js.undefined)
    
    inline def setUserGroupResolutionConfiguration(value: UserGroupResolutionConfiguration): Self = StObject.set(x, "UserGroupResolutionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUserGroupResolutionConfigurationUndefined: Self = StObject.set(x, "UserGroupResolutionConfiguration", js.undefined)
    
    inline def setUserTokenConfigurations(value: UserTokenConfigurationList): Self = StObject.set(x, "UserTokenConfigurations", value.asInstanceOf[js.Any])
    
    inline def setUserTokenConfigurationsUndefined: Self = StObject.set(x, "UserTokenConfigurations", js.undefined)
    
    inline def setUserTokenConfigurationsVarargs(value: UserTokenConfiguration*): Self = StObject.set(x, "UserTokenConfigurations", js.Array(value*))
  }
}
