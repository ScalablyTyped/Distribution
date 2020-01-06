package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProductAttribute extends js.Object {
  /**
    * The ARN of the provisioned product.
    */
  var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.CreatedTime] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.IdempotencyToken] = js.native
  /**
    * The record identifier of the last request performed on this provisioned product.
    */
  var LastRecordId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  /**
    * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
    */
  var PhysicalId: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PhysicalId] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var Status: js.UndefOr[ProvisionedProductStatus] = js.native
  /**
    * The current status message of the provisioned product.
    */
  var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.native
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var Type: js.UndefOr[ProvisionedProductType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM user.
    */
  var UserArn: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.UserArn] = js.native
  /**
    * The ARN of the IAM user in the session. This ARN might contain a session ID.
    */
  var UserArnSession: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.UserArnSession] = js.native
}

object ProvisionedProductAttribute {
  @scala.inline
  def apply(
    Arn: ProvisionedProductNameOrArn = null,
    CreatedTime: CreatedTime = null,
    Id: Id = null,
    IdempotencyToken: IdempotencyToken = null,
    LastRecordId: Id = null,
    Name: ProvisionedProductNameOrArn = null,
    PhysicalId: PhysicalId = null,
    ProductId: Id = null,
    ProvisioningArtifactId: Id = null,
    Status: ProvisionedProductStatus = null,
    StatusMessage: ProvisionedProductStatusMessage = null,
    Tags: Tags = null,
    Type: ProvisionedProductType = null,
    UserArn: UserArn = null,
    UserArnSession: UserArnSession = null
  ): ProvisionedProductAttribute = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (LastRecordId != null) __obj.updateDynamic("LastRecordId")(LastRecordId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PhysicalId != null) __obj.updateDynamic("PhysicalId")(PhysicalId.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    if (UserArnSession != null) __obj.updateDynamic("UserArnSession")(UserArnSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedProductAttribute]
  }
}

