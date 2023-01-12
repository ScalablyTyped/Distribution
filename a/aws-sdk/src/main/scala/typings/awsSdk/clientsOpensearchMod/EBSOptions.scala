package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSOptions extends StObject {
  
  /**
    * Indicates whether EBS volumes are attached to data nodes in an OpenSearch Service domain.
    */
  var EBSEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the gp3 and provisioned IOPS EBS volume types.
    */
  var Iops: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Specifies the throughput (in MiB/s) of the EBS volumes attached to data nodes. Applicable only for the gp3 volume type.
    */
  var Throughput: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Specifies the size (in GiB) of EBS volumes attached to data nodes.
    */
  var VolumeSize: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Specifies the type of EBS volumes attached to data nodes.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.VolumeType] = js.undefined
}
object EBSOptions {
  
  inline def apply(): EBSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EBSOptions] (val x: Self) extends AnyVal {
    
    inline def setEBSEnabled(value: Boolean): Self = StObject.set(x, "EBSEnabled", value.asInstanceOf[js.Any])
    
    inline def setEBSEnabledUndefined: Self = StObject.set(x, "EBSEnabled", js.undefined)
    
    inline def setIops(value: IntegerClass): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setThroughput(value: IntegerClass): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeSize(value: IntegerClass): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
