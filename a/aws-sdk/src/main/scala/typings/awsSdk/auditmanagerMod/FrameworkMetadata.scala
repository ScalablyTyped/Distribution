package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameworkMetadata extends StObject {
  
  /**
    *  The compliance standard that's associated with the framework. For example, this could be PCI DSS or HIPAA. 
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  The description of the framework. 
    */
  var description: js.UndefOr[AssessmentFrameworkDescription] = js.undefined
  
  /**
    *  The logo that's associated with the framework. 
    */
  var logo: js.UndefOr[Filename] = js.undefined
  
  /**
    *  The name of the framework. 
    */
  var name: js.UndefOr[AssessmentName] = js.undefined
}
object FrameworkMetadata {
  
  inline def apply(): FrameworkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameworkMetadata]
  }
  
  extension [Self <: FrameworkMetadata](x: Self) {
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setDescription(value: AssessmentFrameworkDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLogo(value: Filename): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: AssessmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
