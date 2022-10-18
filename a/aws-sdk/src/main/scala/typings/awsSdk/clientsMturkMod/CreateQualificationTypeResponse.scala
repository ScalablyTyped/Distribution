package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQualificationTypeResponse extends StObject {
  
  /**
    * The created Qualification type, returned as a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typings.awsSdk.clientsMturkMod.QualificationType] = js.undefined
}
object CreateQualificationTypeResponse {
  
  inline def apply(): CreateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQualificationTypeResponse]
  }
  
  extension [Self <: CreateQualificationTypeResponse](x: Self) {
    
    inline def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
