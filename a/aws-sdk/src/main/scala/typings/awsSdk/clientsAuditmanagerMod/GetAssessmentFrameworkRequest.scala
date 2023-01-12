package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentFrameworkRequest extends StObject {
  
  /**
    *  The identifier for the framework. 
    */
  var frameworkId: UUID
}
object GetAssessmentFrameworkRequest {
  
  inline def apply(frameworkId: UUID): GetAssessmentFrameworkRequest = {
    val __obj = js.Dynamic.literal(frameworkId = frameworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentFrameworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssessmentFrameworkRequest] (val x: Self) extends AnyVal {
    
    inline def setFrameworkId(value: UUID): Self = StObject.set(x, "frameworkId", value.asInstanceOf[js.Any])
  }
}
