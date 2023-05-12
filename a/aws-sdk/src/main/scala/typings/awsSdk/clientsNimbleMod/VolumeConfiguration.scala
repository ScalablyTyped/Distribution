package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeConfiguration extends StObject {
  
  /**
    * The number of I/O operations per second for the root volume that is attached to streaming session.
    */
  var iops: js.UndefOr[VolumeIops] = js.undefined
  
  /**
    * The size of the root volume that is attached to the streaming session. The root volume size is measured in GiBs.
    */
  var size: js.UndefOr[VolumeSizeInGiB] = js.undefined
  
  /**
    * The throughput to provision for the root volume that is attached to the streaming session. The throughput is measured in MiB/s.
    */
  var throughput: js.UndefOr[VolumeThroughputInMiBs] = js.undefined
}
object VolumeConfiguration {
  
  inline def apply(): VolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIops(value: VolumeIops): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setSize(value: VolumeSizeInGiB): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThroughput(value: VolumeThroughputInMiBs): Self = StObject.set(x, "throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "throughput", js.undefined)
  }
}
