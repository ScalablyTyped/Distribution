package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemRequest extends StObject {
  
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the file system that you are updating.
    */
  var FileSystemId: typings.awsSdk.clientsFsxMod.FileSystemId
  
  var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined
  
  var OntapConfiguration: js.UndefOr[UpdateFileSystemOntapConfiguration] = js.undefined
  
  /**
    * The configuration updates for an Amazon FSx for OpenZFS file system.
    */
  var OpenZFSConfiguration: js.UndefOr[UpdateFileSystemOpenZFSConfiguration] = js.undefined
  
  /**
    * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx for Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in GiB, to increase the storage capacity for the file system that you're updating.   You can't make a storage capacity increase request if there is an existing storage capacity increase request in progress.  For Windows file systems, the storage capacity target value must be at least 10 percent greater than the current storage capacity value. To increase storage capacity, the file system must have at least 16 MBps of throughput capacity. For more information, see Managing storage capacity in the Amazon FSx for Windows File Server User Guide. For Lustre file systems, the storage capacity target value can be the following:   For SCRATCH_2, PERSISTENT_1, and PERSISTENT_2 SSD deployment types, valid values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.   For PERSISTENT HDD file systems, valid values are multiples of 6000 GiB for 12-MBps throughput per TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The values must be greater than the current storage capacity.   For SCRATCH_1 file systems, you can't increase the storage capacity.   For more information, see Managing storage and throughput capacity in the Amazon FSx for Lustre User Guide. For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the current storage capacity value. For more information, see Managing storage capacity and provisioned IOPS in the Amazon FSx for NetApp ONTAP User Guide.
    */
  var StorageCapacity: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageCapacity] = js.undefined
  
  /**
    * The configuration updates for an Amazon FSx for Windows File Server file system.
    */
  var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined
}
object UpdateFileSystemRequest {
  
  inline def apply(FileSystemId: FileSystemId): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFileSystemRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setLustreConfiguration(value: UpdateFileSystemLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    inline def setOntapConfiguration(value: UpdateFileSystemOntapConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: UpdateFileSystemOpenZFSConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "StorageCapacity", js.undefined)
    
    inline def setWindowsConfiguration(value: UpdateFileSystemWindowsConfiguration): Self = StObject.set(x, "WindowsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWindowsConfigurationUndefined: Self = StObject.set(x, "WindowsConfiguration", js.undefined)
  }
}
