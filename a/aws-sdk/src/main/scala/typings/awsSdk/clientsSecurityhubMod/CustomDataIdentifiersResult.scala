package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDataIdentifiersResult extends StObject {
  
  /**
    * The list of detected instances of sensitive data.
    */
  var Detections: js.UndefOr[CustomDataIdentifiersDetectionsList] = js.undefined
  
  /**
    * The total number of occurrences of sensitive data.
    */
  var TotalCount: js.UndefOr[Long] = js.undefined
}
object CustomDataIdentifiersResult {
  
  inline def apply(): CustomDataIdentifiersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataIdentifiersResult]
  }
  
  extension [Self <: CustomDataIdentifiersResult](x: Self) {
    
    inline def setDetections(value: CustomDataIdentifiersDetectionsList): Self = StObject.set(x, "Detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "Detections", js.undefined)
    
    inline def setDetectionsVarargs(value: CustomDataIdentifiersDetections*): Self = StObject.set(x, "Detections", js.Array(value*))
    
    inline def setTotalCount(value: Long): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
