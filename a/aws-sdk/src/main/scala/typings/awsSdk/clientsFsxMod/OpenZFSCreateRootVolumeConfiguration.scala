package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSCreateRootVolumeConfiguration extends StObject {
  
  /**
    * A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This value defaults to false. If it's set to true, all tags for the volume are copied to snapshots where the user doesn't specify tags. If this value is true and you specify one or more tags, only the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are copied from the volume, regardless of this value. 
    */
  var CopyTagsToSnapshots: js.UndefOr[Flag] = js.undefined
  
  /**
    * Specifies the method used to compress the data on the volume. The compression type is NONE by default.    NONE - Doesn't compress the data on the volume. NONE is the default.    ZSTD - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.    LZ4 - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.  
    */
  var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined
  
  /**
    * The configuration object for mounting a file system.
    */
  var NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined
  
  /**
    * A Boolean value indicating whether the volume is read-only. Setting this value to true can be useful after you have completed changes to a volume and no longer want changes to occur. 
    */
  var ReadOnly: js.UndefOr[typings.awsSdk.clientsFsxMod.ReadOnly] = js.undefined
  
  /**
    * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a larger record size. For additional guidance on setting a custom record size, see  Tips for maximizing performance in the Amazon FSx for OpenZFS User Guide.
    */
  var RecordSizeKiB: js.UndefOr[IntegerRecordSizeKiB] = js.undefined
  
  /**
    * An object specifying how much storage users or groups can use on the volume.
    */
  var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
}
object OpenZFSCreateRootVolumeConfiguration {
  
  inline def apply(): OpenZFSCreateRootVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenZFSCreateRootVolumeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenZFSCreateRootVolumeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCopyTagsToSnapshots(value: Flag): Self = StObject.set(x, "CopyTagsToSnapshots", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotsUndefined: Self = StObject.set(x, "CopyTagsToSnapshots", js.undefined)
    
    inline def setDataCompressionType(value: OpenZFSDataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
    inline def setNfsExports(value: OpenZFSNfsExports): Self = StObject.set(x, "NfsExports", value.asInstanceOf[js.Any])
    
    inline def setNfsExportsUndefined: Self = StObject.set(x, "NfsExports", js.undefined)
    
    inline def setNfsExportsVarargs(value: OpenZFSNfsExport*): Self = StObject.set(x, "NfsExports", js.Array(value*))
    
    inline def setReadOnly(value: ReadOnly): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRecordSizeKiB(value: IntegerRecordSizeKiB): Self = StObject.set(x, "RecordSizeKiB", value.asInstanceOf[js.Any])
    
    inline def setRecordSizeKiBUndefined: Self = StObject.set(x, "RecordSizeKiB", js.undefined)
    
    inline def setUserAndGroupQuotas(value: OpenZFSUserAndGroupQuotas): Self = StObject.set(x, "UserAndGroupQuotas", value.asInstanceOf[js.Any])
    
    inline def setUserAndGroupQuotasUndefined: Self = StObject.set(x, "UserAndGroupQuotas", js.undefined)
    
    inline def setUserAndGroupQuotasVarargs(value: OpenZFSUserOrGroupQuota*): Self = StObject.set(x, "UserAndGroupQuotas", js.Array(value*))
  }
}
