package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseOperationFailure extends js.Object {
  /**
    * Error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * Failure time.
    */
  var FailureTime: js.UndefOr[DateTime] = js.native
  /**
    * Reserved.
    */
  var MetadataList: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.MetadataList] = js.native
  /**
    * Name of the operation.
    */
  var OperationName: js.UndefOr[String] = js.native
  /**
    * The requester is "License Manager Automated Discovery".
    */
  var OperationRequestedBy: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ResourceType] = js.native
}

object LicenseOperationFailure {
  @scala.inline
  def apply(
    ErrorMessage: String = null,
    FailureTime: DateTime = null,
    MetadataList: MetadataList = null,
    OperationName: String = null,
    OperationRequestedBy: String = null,
    ResourceArn: String = null,
    ResourceOwnerId: String = null,
    ResourceType: ResourceType = null
  ): LicenseOperationFailure = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (FailureTime != null) __obj.updateDynamic("FailureTime")(FailureTime.asInstanceOf[js.Any])
    if (MetadataList != null) __obj.updateDynamic("MetadataList")(MetadataList.asInstanceOf[js.Any])
    if (OperationName != null) __obj.updateDynamic("OperationName")(OperationName.asInstanceOf[js.Any])
    if (OperationRequestedBy != null) __obj.updateDynamic("OperationRequestedBy")(OperationRequestedBy.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseOperationFailure]
  }
}

