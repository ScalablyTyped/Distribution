package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportImageTask extends js.Object {
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.undefined
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the image is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The target hypervisor for the import task. Valid values: xen 
    */
  var Hypervisor: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted image.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.undefined
  /**
    * The description string for the import image task.
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The percentage of progress of the import image task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined
  /**
    * A brief status for the import image task.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * A descriptive status message for the import image task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
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
    LicenseType: String = null,
    Platform: String = null,
    Progress: String = null,
    SnapshotDetails: SnapshotDetailList = null,
    Status: String = null,
    StatusMessage: String = null
  ): ImportImageTask = {
    val __obj = js.Dynamic.literal()
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (SnapshotDetails != null) __obj.updateDynamic("SnapshotDetails")(SnapshotDetails)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ImportImageTask]
  }
}

