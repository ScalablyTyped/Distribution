package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedProductDetail extends js.Object {
  /**
    * The ARN of the provisioned product.
    */
  var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
  /**
    * The identifier of the provisioned product.
    */
  var Id: js.UndefOr[ProvisionedProductId] = js.undefined
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
  /**
    * The record identifier of the last request performed on this provisioned product.
    */
  var LastRecordId: js.UndefOr[LastRequestId] = js.undefined
  /**
    * The user-friendly name of the provisioned product.
    */
  var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  /**
    * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var Status: js.UndefOr[ProvisionedProductStatus] = js.undefined
  /**
    * The current status message of the provisioned product.
    */
  var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var Type: js.UndefOr[ProvisionedProductType] = js.undefined
}

object ProvisionedProductDetail {
  @scala.inline
  def apply(
    Arn: ProvisionedProductNameOrArn = null,
    CreatedTime: CreatedTime = null,
    Id: ProvisionedProductId = null,
    IdempotencyToken: IdempotencyToken = null,
    LastRecordId: LastRequestId = null,
    Name: ProvisionedProductNameOrArn = null,
    ProductId: Id = null,
    ProvisioningArtifactId: Id = null,
    Status: ProvisionedProductStatus = null,
    StatusMessage: ProvisionedProductStatusMessage = null,
    Type: ProvisionedProductType = null
  ): ProvisionedProductDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken)
    if (LastRecordId != null) __obj.updateDynamic("LastRecordId")(LastRecordId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ProvisionedProductDetail]
  }
}

