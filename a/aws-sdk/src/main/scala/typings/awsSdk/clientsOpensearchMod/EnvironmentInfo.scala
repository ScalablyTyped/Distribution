package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentInfo extends StObject {
  
  /**
    *  A list of AvailabilityZoneInfo for the domain.
    */
  var AvailabilityZoneInformation: js.UndefOr[AvailabilityZoneInfoList] = js.undefined
}
object EnvironmentInfo {
  
  inline def apply(): EnvironmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentInfo] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneInformation(value: AvailabilityZoneInfoList): Self = StObject.set(x, "AvailabilityZoneInformation", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneInformationUndefined: Self = StObject.set(x, "AvailabilityZoneInformation", js.undefined)
    
    inline def setAvailabilityZoneInformationVarargs(value: AvailabilityZoneInfo*): Self = StObject.set(x, "AvailabilityZoneInformation", js.Array(value*))
  }
}
