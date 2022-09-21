package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentFrameworkControl extends StObject {
  
  /**
    *  The unique identifier of the control. 
    */
  var id: UUID
}
object CreateAssessmentFrameworkControl {
  
  inline def apply(id: UUID): CreateAssessmentFrameworkControl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentFrameworkControl]
  }
  
  extension [Self <: CreateAssessmentFrameworkControl](x: Self) {
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
