package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemtechGnssConfiguration extends StObject {
  
  /**
    * Whether forward error correction is enabled.
    */
  var Fec: PositionConfigurationFec
  
  /**
    * The status indicating whether the solver is enabled.
    */
  var Status: PositionConfigurationStatus
}
object SemtechGnssConfiguration {
  
  inline def apply(Fec: PositionConfigurationFec, Status: PositionConfigurationStatus): SemtechGnssConfiguration = {
    val __obj = js.Dynamic.literal(Fec = Fec.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemtechGnssConfiguration]
  }
  
  extension [Self <: SemtechGnssConfiguration](x: Self) {
    
    inline def setFec(value: PositionConfigurationFec): Self = StObject.set(x, "Fec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PositionConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
