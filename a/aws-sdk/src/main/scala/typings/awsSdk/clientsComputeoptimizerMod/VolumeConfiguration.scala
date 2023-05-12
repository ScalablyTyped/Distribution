package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeConfiguration extends StObject {
  
  /**
    *  Contains the image used to boot the instance during launch. 
    */
  var rootVolume: js.UndefOr[RootVolume] = js.undefined
  
  /**
    * The baseline IOPS of the volume.
    */
  var volumeBaselineIOPS: js.UndefOr[VolumeBaselineIOPS] = js.undefined
  
  /**
    * The baseline throughput of the volume.
    */
  var volumeBaselineThroughput: js.UndefOr[VolumeBaselineThroughput] = js.undefined
  
  /**
    * The burst IOPS of the volume.
    */
  var volumeBurstIOPS: js.UndefOr[VolumeBurstIOPS] = js.undefined
  
  /**
    * The burst throughput of the volume.
    */
  var volumeBurstThroughput: js.UndefOr[VolumeBurstThroughput] = js.undefined
  
  /**
    * The size of the volume, in GiB.
    */
  var volumeSize: js.UndefOr[VolumeSize] = js.undefined
  
  /**
    * The volume type. This can be gp2 for General Purpose SSD, io1 or io2 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.
    */
  var volumeType: js.UndefOr[VolumeType] = js.undefined
}
object VolumeConfiguration {
  
  inline def apply(): VolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRootVolume(value: RootVolume): Self = StObject.set(x, "rootVolume", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeUndefined: Self = StObject.set(x, "rootVolume", js.undefined)
    
    inline def setVolumeBaselineIOPS(value: VolumeBaselineIOPS): Self = StObject.set(x, "volumeBaselineIOPS", value.asInstanceOf[js.Any])
    
    inline def setVolumeBaselineIOPSUndefined: Self = StObject.set(x, "volumeBaselineIOPS", js.undefined)
    
    inline def setVolumeBaselineThroughput(value: VolumeBaselineThroughput): Self = StObject.set(x, "volumeBaselineThroughput", value.asInstanceOf[js.Any])
    
    inline def setVolumeBaselineThroughputUndefined: Self = StObject.set(x, "volumeBaselineThroughput", js.undefined)
    
    inline def setVolumeBurstIOPS(value: VolumeBurstIOPS): Self = StObject.set(x, "volumeBurstIOPS", value.asInstanceOf[js.Any])
    
    inline def setVolumeBurstIOPSUndefined: Self = StObject.set(x, "volumeBurstIOPS", js.undefined)
    
    inline def setVolumeBurstThroughput(value: VolumeBurstThroughput): Self = StObject.set(x, "volumeBurstThroughput", value.asInstanceOf[js.Any])
    
    inline def setVolumeBurstThroughputUndefined: Self = StObject.set(x, "volumeBurstThroughput", js.undefined)
    
    inline def setVolumeSize(value: VolumeSize): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
