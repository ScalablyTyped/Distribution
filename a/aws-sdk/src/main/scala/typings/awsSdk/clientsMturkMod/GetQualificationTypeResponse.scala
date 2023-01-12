package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQualificationTypeResponse extends StObject {
  
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[typings.awsSdk.clientsMturkMod.QualificationType] = js.undefined
}
object GetQualificationTypeResponse {
  
  inline def apply(): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQualificationTypeResponse] (val x: Self) extends AnyVal {
    
    inline def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
