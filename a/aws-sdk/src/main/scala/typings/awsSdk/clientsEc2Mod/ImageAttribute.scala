package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAttribute extends StObject {
  
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  
  /**
    * The boot mode.
    */
  var BootMode: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * A description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * If v2.0, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI will have HttpTokens automatically set to required so that, by default, the instance requires that IMDSv2 is used when requesting instance metadata. In addition, HttpPutResponseHopLimit is set to 2. For more information, see Configure the AMI in the Amazon Elastic Compute Cloud User Guide.
    */
  var ImdsSupport: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the AMI was last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before that usage is reported.   lastLaunchedTime data is available starting April 2017. 
    */
  var LastLaunchedTime: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The launch permissions.
    */
  var LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.undefined
  
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * If the image is configured for NitroTPM support, the value is v2.0.
    */
  var TpmSupport: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the GetInstanceUefiData command. You can inspect and modify the UEFI data by using the python-uefivars tool on GitHub. For more information, see UEFI Secure Boot in the Amazon Elastic Compute Cloud User Guide.
    */
  var UefiData: js.UndefOr[AttributeValue] = js.undefined
}
object ImageAttribute {
  
  inline def apply(): ImageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAttribute]
  }
  
  extension [Self <: ImageAttribute](x: Self) {
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setBootMode(value: AttributeValue): Self = StObject.set(x, "BootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "BootMode", js.undefined)
    
    inline def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setImdsSupport(value: AttributeValue): Self = StObject.set(x, "ImdsSupport", value.asInstanceOf[js.Any])
    
    inline def setImdsSupportUndefined: Self = StObject.set(x, "ImdsSupport", js.undefined)
    
    inline def setKernelId(value: AttributeValue): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setLastLaunchedTime(value: AttributeValue): Self = StObject.set(x, "LastLaunchedTime", value.asInstanceOf[js.Any])
    
    inline def setLastLaunchedTimeUndefined: Self = StObject.set(x, "LastLaunchedTime", js.undefined)
    
    inline def setLaunchPermissions(value: LaunchPermissionList): Self = StObject.set(x, "LaunchPermissions", value.asInstanceOf[js.Any])
    
    inline def setLaunchPermissionsUndefined: Self = StObject.set(x, "LaunchPermissions", js.undefined)
    
    inline def setLaunchPermissionsVarargs(value: LaunchPermission*): Self = StObject.set(x, "LaunchPermissions", js.Array(value*))
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setRamdiskId(value: AttributeValue): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSriovNetSupport(value: AttributeValue): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    inline def setTpmSupport(value: AttributeValue): Self = StObject.set(x, "TpmSupport", value.asInstanceOf[js.Any])
    
    inline def setTpmSupportUndefined: Self = StObject.set(x, "TpmSupport", js.undefined)
    
    inline def setUefiData(value: AttributeValue): Self = StObject.set(x, "UefiData", value.asInstanceOf[js.Any])
    
    inline def setUefiDataUndefined: Self = StObject.set(x, "UefiData", js.undefined)
  }
}
