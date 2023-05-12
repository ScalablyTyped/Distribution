package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorScoreDetails extends StObject {
  
  /**
    * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
    */
  var adjustedCvss: js.UndefOr[CvssScoreDetails] = js.undefined
}
object InspectorScoreDetails {
  
  inline def apply(): InspectorScoreDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorScoreDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectorScoreDetails] (val x: Self) extends AnyVal {
    
    inline def setAdjustedCvss(value: CvssScoreDetails): Self = StObject.set(x, "adjustedCvss", value.asInstanceOf[js.Any])
    
    inline def setAdjustedCvssUndefined: Self = StObject.set(x, "adjustedCvss", js.undefined)
  }
}
