package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQualificationTypeResponse extends StObject {
  
  /**
    *  Contains a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typings.awsSdk.clientsMturkMod.QualificationType] = js.undefined
}
object UpdateQualificationTypeResponse {
  
  inline def apply(): UpdateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQualificationTypeResponse]
  }
  
  extension [Self <: UpdateQualificationTypeResponse](x: Self) {
    
    inline def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
