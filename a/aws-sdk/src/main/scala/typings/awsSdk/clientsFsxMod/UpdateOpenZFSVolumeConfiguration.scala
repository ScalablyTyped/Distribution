package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOpenZFSVolumeConfiguration extends StObject {
  
  /**
    * Specifies the method used to compress the data on the volume. The compression type is NONE by default.    NONE - Doesn't compress the data on the volume. NONE is the default.    ZSTD - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.    LZ4 - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.  
    */
  var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined
  
  /**
    * The configuration object for mounting a Network File System (NFS) file system.
    */
  var NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined
  
  /**
    * A Boolean value indicating whether the volume is read-only.
    */
  var ReadOnly: js.UndefOr[typings.awsSdk.clientsFsxMod.ReadOnly] = js.undefined
  
  /**
    * Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a larger record size. For additional guidance on when to set a custom record size, see  Tips for maximizing performance in the Amazon FSx for OpenZFS User Guide.
    */
  var RecordSizeKiB: js.UndefOr[IntegerRecordSizeKiB] = js.undefined
  
  /**
    * The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify a quota larger than the storage on the parent volume. You can specify a value of -1 to unset a volume's storage capacity quota.
    */
  var StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMaxFromNegativeOne] = js.undefined
  
  /**
    * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than the parent volume has reserved. You can specify a value of -1 to unset a volume's storage capacity reservation.
    */
  var StorageCapacityReservationGiB: js.UndefOr[IntegerNoMaxFromNegativeOne] = js.undefined
  
  /**
    * An object specifying how much storage users or groups can use on the volume.
    */
  var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
}
object UpdateOpenZFSVolumeConfiguration {
  
  inline def apply(): UpdateOpenZFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOpenZFSVolumeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOpenZFSVolumeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataCompressionType(value: OpenZFSDataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
    inline def setNfsExports(value: OpenZFSNfsExports): Self = StObject.set(x, "NfsExports", value.asInstanceOf[js.Any])
    
    inline def setNfsExportsUndefined: Self = StObject.set(x, "NfsExports", js.undefined)
    
    inline def setNfsExportsVarargs(value: OpenZFSNfsExport*): Self = StObject.set(x, "NfsExports", js.Array(value*))
    
    inline def setReadOnly(value: ReadOnly): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRecordSizeKiB(value: IntegerRecordSizeKiB): Self = StObject.set(x, "RecordSizeKiB", value.asInstanceOf[js.Any])
    
    inline def setRecordSizeKiBUndefined: Self = StObject.set(x, "RecordSizeKiB", js.undefined)
    
    inline def setStorageCapacityQuotaGiB(value: IntegerNoMaxFromNegativeOne): Self = StObject.set(x, "StorageCapacityQuotaGiB", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityQuotaGiBUndefined: Self = StObject.set(x, "StorageCapacityQuotaGiB", js.undefined)
    
    inline def setStorageCapacityReservationGiB(value: IntegerNoMaxFromNegativeOne): Self = StObject.set(x, "StorageCapacityReservationGiB", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityReservationGiBUndefined: Self = StObject.set(x, "StorageCapacityReservationGiB", js.undefined)
    
    inline def setUserAndGroupQuotas(value: OpenZFSUserAndGroupQuotas): Self = StObject.set(x, "UserAndGroupQuotas", value.asInstanceOf[js.Any])
    
    inline def setUserAndGroupQuotasUndefined: Self = StObject.set(x, "UserAndGroupQuotas", js.undefined)
    
    inline def setUserAndGroupQuotasVarargs(value: OpenZFSUserOrGroupQuota*): Self = StObject.set(x, "UserAndGroupQuotas", js.Array(value*))
  }
}
