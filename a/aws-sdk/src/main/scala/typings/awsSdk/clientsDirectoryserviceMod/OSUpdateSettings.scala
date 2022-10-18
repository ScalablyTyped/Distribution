package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSUpdateSettings extends StObject {
  
  /**
    *  OS version that the directory needs to be updated to. 
    */
  var OSVersion: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.OSVersion] = js.undefined
}
object OSUpdateSettings {
  
  inline def apply(): OSUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSUpdateSettings]
  }
  
  extension [Self <: OSUpdateSettings](x: Self) {
    
    inline def setOSVersion(value: OSVersion): Self = StObject.set(x, "OSVersion", value.asInstanceOf[js.Any])
    
    inline def setOSVersionUndefined: Self = StObject.set(x, "OSVersion", js.undefined)
  }
}
