package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentFrameworkResponse extends StObject {
  
  /**
    *  The framework that the GetAssessmentFramework API returned. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
}
object GetAssessmentFrameworkResponse {
  
  inline def apply(): GetAssessmentFrameworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssessmentFrameworkResponse]
  }
  
  extension [Self <: GetAssessmentFrameworkResponse](x: Self) {
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
  }
}
