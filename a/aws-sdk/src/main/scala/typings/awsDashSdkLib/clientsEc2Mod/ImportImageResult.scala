package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportImageResult extends js.Object {
  /**
    * The architecture of the virtual machine.
    */
  var Architecture: js.UndefOr[String] = js.undefined
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the AMI is encypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The target hypervisor of the import task.
    */
  var Hypervisor: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Amazon Machine Image (AMI) created by the import task.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The task ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted AMI.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.undefined
  /**
    * The operating system of the virtual machine.
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The progress of the task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined
  /**
    * A brief status of the task.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * A detailed status message of the import task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object ImportImageResult {
  @scala.inline
  def apply(
    Architecture: String = null,
    Description: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
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
  ): ImportImageResult = {
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
    __obj.asInstanceOf[ImportImageResult]
  }
}

