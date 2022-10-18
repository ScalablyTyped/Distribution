package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  
  /**
    * Any block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  
  /**
    * The boot mode of the image. For more information, see Boot modes in the Amazon Elastic Compute Cloud User Guide.
    */
  var BootMode: js.UndefOr[BootModeValues] = js.undefined
  
  /**
    * The date and time the image was created.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time to deprecate the AMI, in UTC, in the following format: YYYY-MM-DDTHH:MM:SSZ. If you specified a value for seconds, Amazon EC2 rounds the seconds to the nearest minute.
    */
  var DeprecationTime: js.UndefOr[String] = js.undefined
  
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
    * The Amazon Web Services account alias (for example, amazon, self) or the Amazon Web Services account ID of the AMI owner.
    */
  var ImageOwnerAlias: js.UndefOr[String] = js.undefined
  
  /**
    * The type of image.
    */
  var ImageType: js.UndefOr[ImageTypeValues] = js.undefined
  
  /**
    * If v2.0, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI will have HttpTokens automatically set to required so that, by default, the instance requires that IMDSv2 is used when requesting instance metadata. In addition, HttpPutResponseHopLimit is set to 2. For more information, see Configure the AMI in the Amazon Elastic Compute Cloud User Guide.
    */
  var ImdsSupport: js.UndefOr[ImdsSupportValues] = js.undefined
  
  /**
    * The kernel associated with the image, if any. Only applicable for machine images.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AMI that was provided during image creation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the image.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * This value is set to windows for Windows AMIs; otherwise, it is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  
  /**
    * The platform details associated with the billing code of the AMI. For more information, see Understanding AMI billing in the Amazon Elastic Compute Cloud User Guide.
    */
  var PlatformDetails: js.UndefOr[String] = js.undefined
  
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
    * The type of root device used by the AMI. The AMI can use an Amazon EBS volume or an instance store volume.
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
  var StateReason: js.UndefOr[typings.awsSdk.clientsEc2Mod.StateReason] = js.undefined
  
  /**
    * Any tags assigned to the image.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * If the image is configured for NitroTPM support, the value is v2.0. For more information, see NitroTPM in the Amazon Elastic Compute Cloud User Guide.
    */
  var TpmSupport: js.UndefOr[TpmSupportValues] = js.undefined
  
  /**
    * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI. usageOperation corresponds to the lineitem/Operation column on your Amazon Web Services Cost and Usage Report and in the Amazon Web Services Price List API. You can view these fields on the Instances or AMIs pages in the Amazon EC2 console, or in the responses that are returned by the DescribeImages command in the Amazon EC2 API, or the describe-images command in the CLI.
    */
  var UsageOperation: js.UndefOr[String] = js.undefined
  
  /**
    * The type of virtualization of the AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.clientsEc2Mod.VirtualizationType] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setArchitecture(value: ArchitectureValues): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setBootMode(value: BootModeValues): Self = StObject.set(x, "BootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "BootMode", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDeprecationTime(value: String): Self = StObject.set(x, "DeprecationTime", value.asInstanceOf[js.Any])
    
    inline def setDeprecationTimeUndefined: Self = StObject.set(x, "DeprecationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnaSupport(value: Boolean): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    inline def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    inline def setHypervisor(value: HypervisorType): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setImageLocation(value: String): Self = StObject.set(x, "ImageLocation", value.asInstanceOf[js.Any])
    
    inline def setImageLocationUndefined: Self = StObject.set(x, "ImageLocation", js.undefined)
    
    inline def setImageOwnerAlias(value: String): Self = StObject.set(x, "ImageOwnerAlias", value.asInstanceOf[js.Any])
    
    inline def setImageOwnerAliasUndefined: Self = StObject.set(x, "ImageOwnerAlias", js.undefined)
    
    inline def setImageType(value: ImageTypeValues): Self = StObject.set(x, "ImageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "ImageType", js.undefined)
    
    inline def setImdsSupport(value: ImdsSupportValues): Self = StObject.set(x, "ImdsSupport", value.asInstanceOf[js.Any])
    
    inline def setImdsSupportUndefined: Self = StObject.set(x, "ImdsSupport", js.undefined)
    
    inline def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformDetails(value: String): Self = StObject.set(x, "PlatformDetails", value.asInstanceOf[js.Any])
    
    inline def setPlatformDetailsUndefined: Self = StObject.set(x, "PlatformDetails", js.undefined)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "Public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "Public", js.undefined)
    
    inline def setRamdiskId(value: String): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setRootDeviceName(value: String): Self = StObject.set(x, "RootDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceNameUndefined: Self = StObject.set(x, "RootDeviceName", js.undefined)
    
    inline def setRootDeviceType(value: DeviceType): Self = StObject.set(x, "RootDeviceType", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceTypeUndefined: Self = StObject.set(x, "RootDeviceType", js.undefined)
    
    inline def setSriovNetSupport(value: String): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    inline def setState(value: ImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTpmSupport(value: TpmSupportValues): Self = StObject.set(x, "TpmSupport", value.asInstanceOf[js.Any])
    
    inline def setTpmSupportUndefined: Self = StObject.set(x, "TpmSupport", js.undefined)
    
    inline def setUsageOperation(value: String): Self = StObject.set(x, "UsageOperation", value.asInstanceOf[js.Any])
    
    inline def setUsageOperationUndefined: Self = StObject.set(x, "UsageOperation", js.undefined)
    
    inline def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
