package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorScoreDetails extends StObject {
  
  /**
    * An object that contains details about the CVSS score given to a finding.
    */
  var adjustedCvss: js.UndefOr[CvssScoreDetails] = js.undefined
}
object InspectorScoreDetails {
  
  inline def apply(): InspectorScoreDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorScoreDetails]
  }
  
  extension [Self <: InspectorScoreDetails](x: Self) {
    
    inline def setAdjustedCvss(value: CvssScoreDetails): Self = StObject.set(x, "adjustedCvss", value.asInstanceOf[js.Any])
    
    inline def setAdjustedCvssUndefined: Self = StObject.set(x, "adjustedCvss", js.undefined)
  }
}
