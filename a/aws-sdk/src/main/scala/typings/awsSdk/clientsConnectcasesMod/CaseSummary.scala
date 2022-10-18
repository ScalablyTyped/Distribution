package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseSummary extends StObject {
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object CaseSummary {
  
  inline def apply(caseId: CaseId, templateId: TemplateId): CaseSummary = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSummary]
  }
  
  extension [Self <: CaseSummary](x: Self) {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
