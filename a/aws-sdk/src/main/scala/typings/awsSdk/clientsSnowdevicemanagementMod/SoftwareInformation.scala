package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareInformation extends StObject {
  
  /**
    * The state of the software that is installed or that is being installed on the device.
    */
  var installState: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the software currently installed on the device.
    */
  var installedVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the software being installed on the device.
    */
  var installingVersion: js.UndefOr[String] = js.undefined
}
object SoftwareInformation {
  
  inline def apply(): SoftwareInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareInformation]
  }
  
  extension [Self <: SoftwareInformation](x: Self) {
    
    inline def setInstallState(value: String): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    inline def setInstallStateUndefined: Self = StObject.set(x, "installState", js.undefined)
    
    inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    inline def setInstalledVersionUndefined: Self = StObject.set(x, "installedVersion", js.undefined)
    
    inline def setInstallingVersion(value: String): Self = StObject.set(x, "installingVersion", value.asInstanceOf[js.Any])
    
    inline def setInstallingVersionUndefined: Self = StObject.set(x, "installingVersion", js.undefined)
  }
}
