package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidStorageOptions extends StObject {
  
  /**
    * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that provisioned IOPS can be between 3 and 10 times storage.
    */
  var IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.undefined
  
  /**
    * The valid range of provisioned IOPS. For example, 1000-256,000.
    */
  var ProvisionedIops: js.UndefOr[RangeList] = js.undefined
  
  /**
    * The valid range of provisioned storage throughput. For example, 500-4,000 mebibytes per second (MiBps).
    */
  var ProvisionedStorageThroughput: js.UndefOr[RangeList] = js.undefined
  
  /**
    * The valid range of storage in gibibytes (GiB). For example, 100 to 16,384.
    */
  var StorageSize: js.UndefOr[RangeList] = js.undefined
  
  /**
    * The valid range of storage throughput to provisioned IOPS ratios. For example, 0-0.25.
    */
  var StorageThroughputToIopsRatio: js.UndefOr[DoubleRangeList] = js.undefined
  
  /**
    * The valid storage types for your DB instance. For example: gp2, gp3, io1.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not Amazon RDS can automatically scale storage for DB instances that use the new instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[Boolean] = js.undefined
}
object ValidStorageOptions {
  
  inline def apply(): ValidStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidStorageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidStorageOptions] (val x: Self) extends AnyVal {
    
    inline def setIopsToStorageRatio(value: DoubleRangeList): Self = StObject.set(x, "IopsToStorageRatio", value.asInstanceOf[js.Any])
    
    inline def setIopsToStorageRatioUndefined: Self = StObject.set(x, "IopsToStorageRatio", js.undefined)
    
    inline def setIopsToStorageRatioVarargs(value: DoubleRange*): Self = StObject.set(x, "IopsToStorageRatio", js.Array(value*))
    
    inline def setProvisionedIops(value: RangeList): Self = StObject.set(x, "ProvisionedIops", value.asInstanceOf[js.Any])
    
    inline def setProvisionedIopsUndefined: Self = StObject.set(x, "ProvisionedIops", js.undefined)
    
    inline def setProvisionedIopsVarargs(value: Range*): Self = StObject.set(x, "ProvisionedIops", js.Array(value*))
    
    inline def setProvisionedStorageThroughput(value: RangeList): Self = StObject.set(x, "ProvisionedStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedStorageThroughputUndefined: Self = StObject.set(x, "ProvisionedStorageThroughput", js.undefined)
    
    inline def setProvisionedStorageThroughputVarargs(value: Range*): Self = StObject.set(x, "ProvisionedStorageThroughput", js.Array(value*))
    
    inline def setStorageSize(value: RangeList): Self = StObject.set(x, "StorageSize", value.asInstanceOf[js.Any])
    
    inline def setStorageSizeUndefined: Self = StObject.set(x, "StorageSize", js.undefined)
    
    inline def setStorageSizeVarargs(value: Range*): Self = StObject.set(x, "StorageSize", js.Array(value*))
    
    inline def setStorageThroughputToIopsRatio(value: DoubleRangeList): Self = StObject.set(x, "StorageThroughputToIopsRatio", value.asInstanceOf[js.Any])
    
    inline def setStorageThroughputToIopsRatioUndefined: Self = StObject.set(x, "StorageThroughputToIopsRatio", js.undefined)
    
    inline def setStorageThroughputToIopsRatioVarargs(value: DoubleRange*): Self = StObject.set(x, "StorageThroughputToIopsRatio", js.Array(value*))
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSupportsStorageAutoscaling(value: Boolean): Self = StObject.set(x, "SupportsStorageAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setSupportsStorageAutoscalingUndefined: Self = StObject.set(x, "SupportsStorageAutoscaling", js.undefined)
  }
}
