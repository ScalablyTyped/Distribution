package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateDiskConf extends StObject {
  
  /**
    * Launch template disk iops configuration.
    */
  var iops: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Launch template disk throughput configuration.
    */
  var throughput: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Launch template disk volume type configuration.
    */
  var volumeType: js.UndefOr[VolumeType] = js.undefined
}
object LaunchTemplateDiskConf {
  
  inline def apply(): LaunchTemplateDiskConf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateDiskConf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateDiskConf] (val x: Self) extends AnyVal {
    
    inline def setIops(value: PositiveInteger): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setThroughput(value: PositiveInteger): Self = StObject.set(x, "throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "throughput", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
