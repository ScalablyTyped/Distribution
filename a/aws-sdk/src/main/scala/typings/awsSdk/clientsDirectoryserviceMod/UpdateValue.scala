package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateValue extends StObject {
  
  /**
    *  The OS update related settings. 
    */
  var OSUpdateSettings: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.OSUpdateSettings] = js.undefined
}
object UpdateValue {
  
  inline def apply(): UpdateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateValue] (val x: Self) extends AnyVal {
    
    inline def setOSUpdateSettings(value: OSUpdateSettings): Self = StObject.set(x, "OSUpdateSettings", value.asInstanceOf[js.Any])
    
    inline def setOSUpdateSettingsUndefined: Self = StObject.set(x, "OSUpdateSettings", js.undefined)
  }
}
