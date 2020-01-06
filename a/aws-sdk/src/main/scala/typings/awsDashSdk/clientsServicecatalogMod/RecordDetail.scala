package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordDetail extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.CreatedTime] = js.native
  /**
    * The path identifier.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductName] = js.native
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var ProvisionedProductType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductType] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The errors that occurred.
    */
  var RecordErrors: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordErrors] = js.native
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.native
  /**
    * One or more tags.
    */
  var RecordTags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordTags] = js.native
  /**
    * The record type.    PROVISION_PRODUCT     UPDATE_PROVISIONED_PRODUCT     TERMINATE_PROVISIONED_PRODUCT   
    */
  var RecordType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordType] = js.native
  /**
    * The status of the provisioned product.    CREATED - The request was created but the operation has not started.    IN_PROGRESS - The requested operation is in progress.    IN_PROGRESS_IN_ERROR - The provisioned product is under change but the requested operation failed and some remediation is occurring. For example, a rollback.    SUCCEEDED - The requested operation has successfully completed.    FAILED - The requested operation has unsuccessfully completed. Investigate using the error messages returned.  
    */
  var Status: js.UndefOr[RecordStatus] = js.native
  /**
    * The time when the record was last updated.
    */
  var UpdatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.UpdatedTime] = js.native
}

object RecordDetail {
  @scala.inline
  def apply(
    CreatedTime: CreatedTime = null,
    PathId: Id = null,
    ProductId: Id = null,
    ProvisionedProductId: Id = null,
    ProvisionedProductName: ProvisionedProductName = null,
    ProvisionedProductType: ProvisionedProductType = null,
    ProvisioningArtifactId: Id = null,
    RecordErrors: RecordErrors = null,
    RecordId: Id = null,
    RecordTags: RecordTags = null,
    RecordType: RecordType = null,
    Status: RecordStatus = null,
    UpdatedTime: UpdatedTime = null
  ): RecordDetail = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (PathId != null) __obj.updateDynamic("PathId")(PathId.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ProvisionedProductId != null) __obj.updateDynamic("ProvisionedProductId")(ProvisionedProductId.asInstanceOf[js.Any])
    if (ProvisionedProductName != null) __obj.updateDynamic("ProvisionedProductName")(ProvisionedProductName.asInstanceOf[js.Any])
    if (ProvisionedProductType != null) __obj.updateDynamic("ProvisionedProductType")(ProvisionedProductType.asInstanceOf[js.Any])
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId.asInstanceOf[js.Any])
    if (RecordErrors != null) __obj.updateDynamic("RecordErrors")(RecordErrors.asInstanceOf[js.Any])
    if (RecordId != null) __obj.updateDynamic("RecordId")(RecordId.asInstanceOf[js.Any])
    if (RecordTags != null) __obj.updateDynamic("RecordTags")(RecordTags.asInstanceOf[js.Any])
    if (RecordType != null) __obj.updateDynamic("RecordType")(RecordType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTime != null) __obj.updateDynamic("UpdatedTime")(UpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDetail]
  }
}

