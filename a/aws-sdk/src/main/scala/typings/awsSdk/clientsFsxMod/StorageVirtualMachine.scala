package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageVirtualMachine extends StObject {
  
  /**
    * Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
    */
  var ActiveDirectoryConfiguration: js.UndefOr[SvmActiveDirectoryConfiguration] = js.undefined
  
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp CloudManager. They are the Iscsi, Management, Nfs, and Smb endpoints.
    */
  var Endpoints: js.UndefOr[SvmEndpoints] = js.undefined
  
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemId] = js.undefined
  
  /**
    * Describes the SVM's lifecycle status.    CREATED - The SVM is fully available for use.    CREATING - Amazon FSx is creating the new SVM.    DELETING - Amazon FSx is deleting an existing SVM.    FAILED - Amazon FSx was unable to create the SVM.    MISCONFIGURED - The SVM is in a failed but recoverable state.    PENDING - Amazon FSx has not started creating the SVM.  
    */
  var Lifecycle: js.UndefOr[StorageVirtualMachineLifecycle] = js.undefined
  
  /**
    * Describes why the SVM lifecycle state changed.
    */
  var LifecycleTransitionReason: js.UndefOr[typings.awsSdk.clientsFsxMod.LifecycleTransitionReason] = js.undefined
  
  /**
    * The name of the SVM, if provisioned.
    */
  var Name: js.UndefOr[StorageVirtualMachineName] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
  
  /**
    * The security style of the root volume of the SVM.
    */
  var RootVolumeSecurityStyle: js.UndefOr[StorageVirtualMachineRootVolumeSecurityStyle] = js.undefined
  
  /**
    * The SVM's system generated unique ID.
    */
  var StorageVirtualMachineId: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageVirtualMachineId] = js.undefined
  
  /**
    * Describes the SVM's subtype.
    */
  var Subtype: js.UndefOr[StorageVirtualMachineSubtype] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * The SVM's UUID (universally unique identifier).
    */
  var UUID: js.UndefOr[typings.awsSdk.clientsFsxMod.UUID] = js.undefined
}
object StorageVirtualMachine {
  
  inline def apply(): StorageVirtualMachine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageVirtualMachine]
  }
  
  extension [Self <: StorageVirtualMachine](x: Self) {
    
    inline def setActiveDirectoryConfiguration(value: SvmActiveDirectoryConfiguration): Self = StObject.set(x, "ActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "ActiveDirectoryConfiguration", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEndpoints(value: SvmEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setLifecycle(value: StorageVirtualMachineLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionReason(value: LifecycleTransitionReason): Self = StObject.set(x, "LifecycleTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionReasonUndefined: Self = StObject.set(x, "LifecycleTransitionReason", js.undefined)
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setName(value: StorageVirtualMachineName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setRootVolumeSecurityStyle(value: StorageVirtualMachineRootVolumeSecurityStyle): Self = StObject.set(x, "RootVolumeSecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeSecurityStyleUndefined: Self = StObject.set(x, "RootVolumeSecurityStyle", js.undefined)
    
    inline def setStorageVirtualMachineId(value: StorageVirtualMachineId): Self = StObject.set(x, "StorageVirtualMachineId", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineIdUndefined: Self = StObject.set(x, "StorageVirtualMachineId", js.undefined)
    
    inline def setSubtype(value: StorageVirtualMachineSubtype): Self = StObject.set(x, "Subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "Subtype", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUUID(value: UUID): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
    
    inline def setUUIDUndefined: Self = StObject.set(x, "UUID", js.undefined)
  }
}
