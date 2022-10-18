package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentFrameworkResponse extends StObject {
  
  /**
    *  The name of the new framework that the CreateAssessmentFramework API returned. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
}
object CreateAssessmentFrameworkResponse {
  
  inline def apply(): CreateAssessmentFrameworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssessmentFrameworkResponse]
  }
  
  extension [Self <: CreateAssessmentFrameworkResponse](x: Self) {
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
  }
}
