package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionSolverDetails extends StObject {
  
  /**
    * The Semtech GNSS solver object details.
    */
  var SemtechGnss: js.UndefOr[SemtechGnssDetail] = js.undefined
}
object PositionSolverDetails {
  
  inline def apply(): PositionSolverDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionSolverDetails]
  }
  
  extension [Self <: PositionSolverDetails](x: Self) {
    
    inline def setSemtechGnss(value: SemtechGnssDetail): Self = StObject.set(x, "SemtechGnss", value.asInstanceOf[js.Any])
    
    inline def setSemtechGnssUndefined: Self = StObject.set(x, "SemtechGnss", js.undefined)
  }
}
