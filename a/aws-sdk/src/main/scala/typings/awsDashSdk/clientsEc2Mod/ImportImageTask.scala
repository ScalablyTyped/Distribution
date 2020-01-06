package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageTask extends js.Object {
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.native
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the image is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The target hypervisor for the import task. Valid values: xen 
    */
  var Hypervisor: js.UndefOr[String] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted image.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The ARNs of the license configurations that are associated with the import image task.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.native
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.native
  /**
    * The description string for the import image task.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The percentage of progress of the import image task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.native
  /**
    * A brief status for the import image task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A descriptive status message for the import image task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags applied to the import image task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportImageTask {
  @scala.inline
  def apply(
    Architecture: String = null,
    Description: String = null,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    Hypervisor: String = null,
    ImageId: String = null,
    ImportTaskId: String = null,
    KmsKeyId: String = null,
    LicenseSpecifications: ImportImageLicenseSpecificationListResponse = null,
    LicenseType: String = null,
    Platform: String = null,
    Progress: String = null,
    SnapshotDetails: SnapshotDetailList = null,
    Status: String = null,
    StatusMessage: String = null,
    Tags: TagList = null
  ): ImportImageTask = {
    val __obj = js.Dynamic.literal()
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications.asInstanceOf[js.Any])
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (SnapshotDetails != null) __obj.updateDynamic("SnapshotDetails")(SnapshotDetails.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportImageTask]
  }
}

