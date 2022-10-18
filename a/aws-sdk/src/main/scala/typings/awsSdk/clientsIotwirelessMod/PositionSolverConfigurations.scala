package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionSolverConfigurations extends StObject {
  
  /**
    * The Semtech GNSS solver configuration object.
    */
  var SemtechGnss: js.UndefOr[SemtechGnssConfiguration] = js.undefined
}
object PositionSolverConfigurations {
  
  inline def apply(): PositionSolverConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionSolverConfigurations]
  }
  
  extension [Self <: PositionSolverConfigurations](x: Self) {
    
    inline def setSemtechGnss(value: SemtechGnssConfiguration): Self = StObject.set(x, "SemtechGnss", value.asInstanceOf[js.Any])
    
    inline def setSemtechGnssUndefined: Self = StObject.set(x, "SemtechGnss", js.undefined)
  }
}
