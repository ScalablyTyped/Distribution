package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitivityInspectionTemplateRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
}
object GetSensitivityInspectionTemplateRequest {
  
  inline def apply(id: string): GetSensitivityInspectionTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSensitivityInspectionTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSensitivityInspectionTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
