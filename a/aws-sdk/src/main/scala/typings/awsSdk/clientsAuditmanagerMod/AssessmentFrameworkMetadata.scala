package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentFrameworkMetadata extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the framework. 
    */
  var arn: js.UndefOr[AuditManagerArn] = js.undefined
  
  /**
    *  The compliance type that the new custom framework supports, such as CIS or HIPAA. 
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  The number of control sets that are associated with the framework. 
    */
  var controlSetsCount: js.UndefOr[ControlSetsCount] = js.undefined
  
  /**
    *  The number of controls that are associated with the framework. 
    */
  var controlsCount: js.UndefOr[ControlsCount] = js.undefined
  
  /**
    *  The time when the framework was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The description of the framework. 
    */
  var description: js.UndefOr[FrameworkDescription] = js.undefined
  
  /**
    *  The unique identifier for the framework. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The time when the framework was most recently updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The logo that's associated with the framework. 
    */
  var logo: js.UndefOr[Filename] = js.undefined
  
  /**
    *  The name of the framework. 
    */
  var name: js.UndefOr[FrameworkName] = js.undefined
  
  /**
    *  The framework type, such as a standard framework or a custom framework. 
    */
  var `type`: js.UndefOr[FrameworkType] = js.undefined
}
object AssessmentFrameworkMetadata {
  
  inline def apply(): AssessmentFrameworkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentFrameworkMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssessmentFrameworkMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AuditManagerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setControlSetsCount(value: ControlSetsCount): Self = StObject.set(x, "controlSetsCount", value.asInstanceOf[js.Any])
    
    inline def setControlSetsCountUndefined: Self = StObject.set(x, "controlSetsCount", js.undefined)
    
    inline def setControlsCount(value: ControlsCount): Self = StObject.set(x, "controlsCount", value.asInstanceOf[js.Any])
    
    inline def setControlsCountUndefined: Self = StObject.set(x, "controlsCount", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: FrameworkDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLogo(value: Filename): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: FrameworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: FrameworkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
