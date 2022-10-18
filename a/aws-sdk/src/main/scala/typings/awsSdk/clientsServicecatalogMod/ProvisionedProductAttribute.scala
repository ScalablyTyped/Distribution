package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedProductAttribute extends StObject {
  
  /**
    * The ARN of the provisioned product.
    */
  var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the provisioned product.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Id] = js.undefined
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.IdempotencyToken] = js.undefined
  
  /**
    * The record identifier of the last request performed on this provisioned product of the following types:    ProvisionedProduct     UpdateProvisionedProduct     ExecuteProvisionedProductPlan     TerminateProvisionedProduct   
    */
  var LastProvisioningRecordId: js.UndefOr[Id] = js.undefined
  
  /**
    * The record identifier of the last request performed on this provisioned product.
    */
  var LastRecordId: js.UndefOr[Id] = js.undefined
  
  /**
    * The record identifier of the last successful request performed on this provisioned product of the following types:    ProvisionedProduct     UpdateProvisionedProduct     ExecuteProvisionedProductPlan     TerminateProvisionedProduct   
    */
  var LastSuccessfulProvisioningRecordId: js.UndefOr[Id] = js.undefined
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  
  /**
    * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
    */
  var PhysicalId: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PhysicalId] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the product.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the provisioning artifact.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifactName] = js.undefined
  
  /**
    * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var Status: js.UndefOr[ProvisionedProductStatus] = js.undefined
  
  /**
    * The current status message of the provisioned product.
    */
  var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Tags] = js.undefined
  
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var Type: js.UndefOr[ProvisionedProductType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM user.
    */
  var UserArn: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.UserArn] = js.undefined
  
  /**
    * The ARN of the IAM user in the session. This ARN might contain a session ID.
    */
  var UserArnSession: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.UserArnSession] = js.undefined
}
object ProvisionedProductAttribute {
  
  inline def apply(): ProvisionedProductAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductAttribute]
  }
  
  extension [Self <: ProvisionedProductAttribute](x: Self) {
    
    inline def setArn(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setLastProvisioningRecordId(value: Id): Self = StObject.set(x, "LastProvisioningRecordId", value.asInstanceOf[js.Any])
    
    inline def setLastProvisioningRecordIdUndefined: Self = StObject.set(x, "LastProvisioningRecordId", js.undefined)
    
    inline def setLastRecordId(value: Id): Self = StObject.set(x, "LastRecordId", value.asInstanceOf[js.Any])
    
    inline def setLastRecordIdUndefined: Self = StObject.set(x, "LastRecordId", js.undefined)
    
    inline def setLastSuccessfulProvisioningRecordId(value: Id): Self = StObject.set(x, "LastSuccessfulProvisioningRecordId", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulProvisioningRecordIdUndefined: Self = StObject.set(x, "LastSuccessfulProvisioningRecordId", js.undefined)
    
    inline def setName(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPhysicalId(value: PhysicalId): Self = StObject.set(x, "PhysicalId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalIdUndefined: Self = StObject.set(x, "PhysicalId", js.undefined)
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    inline def setProductName(value: ProductViewName): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    inline def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = StObject.set(x, "ProvisioningArtifactName", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactNameUndefined: Self = StObject.set(x, "ProvisioningArtifactName", js.undefined)
    
    inline def setStatus(value: ProvisionedProductStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ProvisionedProductStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ProvisionedProductType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnSession(value: UserArnSession): Self = StObject.set(x, "UserArnSession", value.asInstanceOf[js.Any])
    
    inline def setUserArnSessionUndefined: Self = StObject.set(x, "UserArnSession", js.undefined)
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
