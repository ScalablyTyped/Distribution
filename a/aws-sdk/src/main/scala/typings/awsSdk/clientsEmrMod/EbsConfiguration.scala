package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsConfiguration extends StObject {
  
  /**
    * An array of Amazon EBS volume specifications attached to a cluster instance.
    */
  var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.undefined
  
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
}
object EbsConfiguration {
  
  inline def apply(): EbsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEbsBlockDeviceConfigs(value: EbsBlockDeviceConfigList): Self = StObject.set(x, "EbsBlockDeviceConfigs", value.asInstanceOf[js.Any])
    
    inline def setEbsBlockDeviceConfigsUndefined: Self = StObject.set(x, "EbsBlockDeviceConfigs", js.undefined)
    
    inline def setEbsBlockDeviceConfigsVarargs(value: EbsBlockDeviceConfig*): Self = StObject.set(x, "EbsBlockDeviceConfigs", js.Array(value*))
    
    inline def setEbsOptimized(value: BooleanObject): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
  }
}
