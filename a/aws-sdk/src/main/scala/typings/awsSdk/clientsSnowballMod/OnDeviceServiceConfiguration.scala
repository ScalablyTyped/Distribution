package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDeviceServiceConfiguration extends StObject {
  
  /**
    * Represents the NFS (Network File System) service on a Snow Family device.
    */
  var NFSOnDeviceService: js.UndefOr[NFSOnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
    */
  var TGWOnDeviceService: js.UndefOr[TGWOnDeviceServiceConfiguration] = js.undefined
}
object OnDeviceServiceConfiguration {
  
  inline def apply(): OnDeviceServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDeviceServiceConfiguration]
  }
  
  extension [Self <: OnDeviceServiceConfiguration](x: Self) {
    
    inline def setNFSOnDeviceService(value: NFSOnDeviceServiceConfiguration): Self = StObject.set(x, "NFSOnDeviceService", value.asInstanceOf[js.Any])
    
    inline def setNFSOnDeviceServiceUndefined: Self = StObject.set(x, "NFSOnDeviceService", js.undefined)
    
    inline def setTGWOnDeviceService(value: TGWOnDeviceServiceConfiguration): Self = StObject.set(x, "TGWOnDeviceService", value.asInstanceOf[js.Any])
    
    inline def setTGWOnDeviceServiceUndefined: Self = StObject.set(x, "TGWOnDeviceService", js.undefined)
  }
}
