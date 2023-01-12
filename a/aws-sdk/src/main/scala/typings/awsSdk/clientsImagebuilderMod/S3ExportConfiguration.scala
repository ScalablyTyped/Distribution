package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ExportConfiguration extends StObject {
  
  /**
    * Export the updated image to one of the following supported disk image formats:    Virtual Hard Disk (VHD) – Compatible with Citrix Xen and Microsoft Hyper-V virtualization products.    Stream-optimized ESX Virtual Machine Disk (VMDK) – Compatible with VMware ESX and VMware vSphere versions 4, 5, and 6.    Raw – Raw format.  
    */
  var diskImageFormat: DiskImageFormat
  
  /**
    * The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
    */
  var roleName: NonEmptyString
  
  /**
    * The S3 bucket in which to store the output disk images for your VM.
    */
  var s3Bucket: NonEmptyString
  
  /**
    * The Amazon S3 path for the bucket where the output disk images for your VM are stored.
    */
  var s3Prefix: js.UndefOr[NonEmptyString] = js.undefined
}
object S3ExportConfiguration {
  
  inline def apply(diskImageFormat: DiskImageFormat, roleName: NonEmptyString, s3Bucket: NonEmptyString): S3ExportConfiguration = {
    val __obj = js.Dynamic.literal(diskImageFormat = diskImageFormat.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ExportConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ExportConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDiskImageFormat(value: DiskImageFormat): Self = StObject.set(x, "diskImageFormat", value.asInstanceOf[js.Any])
    
    inline def setRoleName(value: NonEmptyString): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setS3Bucket(value: NonEmptyString): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Prefix(value: NonEmptyString): Self = StObject.set(x, "s3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "s3Prefix", js.undefined)
  }
}
