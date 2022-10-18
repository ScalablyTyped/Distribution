package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionalConfiguration extends StObject {
  
  /**
    * Maximum time for the provisional configuration, in minutes.
    */
  var MaxTimeToLiveInMinutes: BoxInteger
}
object ProvisionalConfiguration {
  
  inline def apply(MaxTimeToLiveInMinutes: BoxInteger): ProvisionalConfiguration = {
    val __obj = js.Dynamic.literal(MaxTimeToLiveInMinutes = MaxTimeToLiveInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionalConfiguration]
  }
  
  extension [Self <: ProvisionalConfiguration](x: Self) {
    
    inline def setMaxTimeToLiveInMinutes(value: BoxInteger): Self = StObject.set(x, "MaxTimeToLiveInMinutes", value.asInstanceOf[js.Any])
  }
}
