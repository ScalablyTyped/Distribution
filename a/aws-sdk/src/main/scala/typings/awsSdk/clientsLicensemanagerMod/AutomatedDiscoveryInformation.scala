package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomatedDiscoveryInformation extends StObject {
  
  /**
    * Time that automated discovery last ran.
    */
  var LastRunTime: js.UndefOr[js.Date] = js.undefined
}
object AutomatedDiscoveryInformation {
  
  inline def apply(): AutomatedDiscoveryInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedDiscoveryInformation]
  }
  
  extension [Self <: AutomatedDiscoveryInformation](x: Self) {
    
    inline def setLastRunTime(value: js.Date): Self = StObject.set(x, "LastRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeUndefined: Self = StObject.set(x, "LastRunTime", js.undefined)
  }
}
