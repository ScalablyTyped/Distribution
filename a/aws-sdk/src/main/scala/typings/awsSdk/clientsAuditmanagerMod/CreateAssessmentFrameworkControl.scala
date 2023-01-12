package typings.awsSdk.clientsAuditmanagerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssessmentFrameworkControl] (val x: Self) extends AnyVal {
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
