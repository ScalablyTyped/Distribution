package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  /**
    * Any block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  /**
    * The date and time the image was created.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The description of the AMI that was provided during image creation.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * The hypervisor type of the image.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.undefined
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The location of the AMI.
    */
  var ImageLocation: js.UndefOr[String] = js.undefined
  /**
    * The AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
    */
  var ImageOwnerAlias: js.UndefOr[String] = js.undefined
  /**
    * The type of image.
    */
  var ImageType: js.UndefOr[ImageTypeValues] = js.undefined
  /**
    * The kernel associated with the image, if any. Only applicable for machine images.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  /**
    * The name of the AMI that was provided during image creation.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the image owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * This value is set to windows for Windows AMIs; otherwise, it is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  /**
    * Any product codes associated with the AMI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * Indicates whether the image has public launch permissions. The value is true if this image has public launch permissions or false if it has only implicit and explicit launch permissions.
    */
  var Public: js.UndefOr[Boolean] = js.undefined
  /**
    * The RAM disk associated with the image, if any. Only applicable for machine images.
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.undefined
  /**
    * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.undefined
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.undefined
  /**
    * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
    */
  var State: js.UndefOr[ImageState] = js.undefined
  /**
    * The reason for the state change.
    */
  var StateReason: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.StateReason] = js.undefined
  /**
    * Any tags assigned to the image.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The type of virtualization of the AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VirtualizationType] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    Architecture: ArchitectureValues = null,
    BlockDeviceMappings: BlockDeviceMappingList = null,
    CreationDate: String = null,
    Description: String = null,
    EnaSupport: js.UndefOr[scala.Boolean] = js.undefined,
    Hypervisor: HypervisorType = null,
    ImageId: String = null,
    ImageLocation: String = null,
    ImageOwnerAlias: String = null,
    ImageType: ImageTypeValues = null,
    KernelId: String = null,
    Name: String = null,
    OwnerId: String = null,
    Platform: PlatformValues = null,
    ProductCodes: ProductCodeList = null,
    Public: js.UndefOr[scala.Boolean] = js.undefined,
    RamdiskId: String = null,
    RootDeviceName: String = null,
    RootDeviceType: DeviceType = null,
    SriovNetSupport: String = null,
    State: ImageState = null,
    StateReason: StateReason = null,
    Tags: TagList = null,
    VirtualizationType: VirtualizationType = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(EnaSupport)) __obj.updateDynamic("EnaSupport")(EnaSupport)
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (ImageLocation != null) __obj.updateDynamic("ImageLocation")(ImageLocation)
    if (ImageOwnerAlias != null) __obj.updateDynamic("ImageOwnerAlias")(ImageOwnerAlias)
    if (ImageType != null) __obj.updateDynamic("ImageType")(ImageType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (!js.isUndefined(Public)) __obj.updateDynamic("Public")(Public)
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId)
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName)
    if (RootDeviceType != null) __obj.updateDynamic("RootDeviceType")(RootDeviceType.asInstanceOf[js.Any])
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

