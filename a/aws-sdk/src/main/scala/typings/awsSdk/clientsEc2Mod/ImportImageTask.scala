package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportImageTask extends StObject {
  
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.undefined
  
  /**
    * The boot mode of the virtual machine.
    */
  var BootMode: js.UndefOr[BootModeValues] = js.undefined
  
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
    * The identifier for the KMS key that was used to create the encrypted image.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARNs of the license configurations that are associated with the import image task.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.undefined
  
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
  
  /**
    * The tags for the import image task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The usage operation value.
    */
  var UsageOperation: js.UndefOr[String] = js.undefined
}
object ImportImageTask {
  
  inline def apply(): ImportImageTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageTask]
  }
  
  extension [Self <: ImportImageTask](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setBootMode(value: BootModeValues): Self = StObject.set(x, "BootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "BootMode", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setHypervisor(value: String): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLicenseSpecifications(value: ImportImageLicenseSpecificationListResponse): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: ImportImageLicenseConfigurationResponse*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value*))
    
    inline def setLicenseType(value: String): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setSnapshotDetails(value: SnapshotDetailList): Self = StObject.set(x, "SnapshotDetails", value.asInstanceOf[js.Any])
    
    inline def setSnapshotDetailsUndefined: Self = StObject.set(x, "SnapshotDetails", js.undefined)
    
    inline def setSnapshotDetailsVarargs(value: SnapshotDetail*): Self = StObject.set(x, "SnapshotDetails", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUsageOperation(value: String): Self = StObject.set(x, "UsageOperation", value.asInstanceOf[js.Any])
    
    inline def setUsageOperationUndefined: Self = StObject.set(x, "UsageOperation", js.undefined)
  }
}
