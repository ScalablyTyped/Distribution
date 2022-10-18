package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentFrameworkResponse extends StObject {
  
  /**
    *  The name of the framework. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
}
object UpdateAssessmentFrameworkResponse {
  
  inline def apply(): UpdateAssessmentFrameworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssessmentFrameworkResponse]
  }
  
  extension [Self <: UpdateAssessmentFrameworkResponse](x: Self) {
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
  }
}
