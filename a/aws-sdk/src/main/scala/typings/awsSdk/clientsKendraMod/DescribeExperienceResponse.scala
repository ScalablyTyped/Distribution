package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExperienceResponse extends StObject {
  
  /**
    * Shows the configuration information for your Amazon Kendra experience. This includes ContentSourceConfiguration, which specifies the data source IDs and/or FAQ IDs, and UserIdentityConfiguration, which specifies the user or group information to grant access to your Amazon Kendra experience.
    */
  var Configuration: js.UndefOr[ExperienceConfiguration] = js.undefined
  
  /**
    * Shows the date-time your Amazon Kendra experience was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Shows the description for your Amazon Kendra experience.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web Services.
    */
  var Endpoints: js.UndefOr[ExperienceEndpoints] = js.undefined
  
  /**
    * The reason your Amazon Kendra experience could not properly process.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
  
  /**
    * Shows the identifier of your Amazon Kendra experience.
    */
  var Id: js.UndefOr[ExperienceId] = js.undefined
  
  /**
    * Shows the identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: js.UndefOr[typings.awsSdk.clientsKendraMod.IndexId] = js.undefined
  
  /**
    * Shows the name of your Amazon Kendra experience.
    */
  var Name: js.UndefOr[ExperienceName] = js.undefined
  
  /**
    * Shows the Amazon Resource Name (ARN) of a role with permission to access Query API, QuerySuggestions API, SubmitFeedback API, and IAM Identity Center that stores your user and group information.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  /**
    * The current processing status of your Amazon Kendra experience. When the status is ACTIVE, your Amazon Kendra experience is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that this failed.
    */
  var Status: js.UndefOr[ExperienceStatus] = js.undefined
  
  /**
    * Shows the date-time your Amazon Kendra experience was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeExperienceResponse {
  
  inline def apply(): DescribeExperienceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExperienceResponse]
  }
  
  extension [Self <: DescribeExperienceResponse](x: Self) {
    
    inline def setConfiguration(value: ExperienceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpoints(value: ExperienceEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: ExperienceEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    inline def setName(value: ExperienceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: ExperienceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
