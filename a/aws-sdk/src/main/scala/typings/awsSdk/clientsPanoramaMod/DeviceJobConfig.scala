package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceJobConfig extends StObject {
  
  /**
    * A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
    */
  var OTAJobConfig: js.UndefOr[typings.awsSdk.clientsPanoramaMod.OTAJobConfig] = js.undefined
}
object DeviceJobConfig {
  
  inline def apply(): DeviceJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceJobConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceJobConfig] (val x: Self) extends AnyVal {
    
    inline def setOTAJobConfig(value: OTAJobConfig): Self = StObject.set(x, "OTAJobConfig", value.asInstanceOf[js.Any])
    
    inline def setOTAJobConfigUndefined: Self = StObject.set(x, "OTAJobConfig", js.undefined)
  }
}
