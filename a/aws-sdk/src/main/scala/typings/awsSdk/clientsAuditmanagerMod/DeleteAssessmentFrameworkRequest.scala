package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssessmentFrameworkRequest extends StObject {
  
  /**
    *  The identifier for the custom framework. 
    */
  var frameworkId: UUID
}
object DeleteAssessmentFrameworkRequest {
  
  inline def apply(frameworkId: UUID): DeleteAssessmentFrameworkRequest = {
    val __obj = js.Dynamic.literal(frameworkId = frameworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentFrameworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAssessmentFrameworkRequest] (val x: Self) extends AnyVal {
    
    inline def setFrameworkId(value: UUID): Self = StObject.set(x, "frameworkId", value.asInstanceOf[js.Any])
  }
}
