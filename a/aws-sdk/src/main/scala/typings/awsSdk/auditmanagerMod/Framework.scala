package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Framework extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the framework. 
    */
  var arn: js.UndefOr[AuditManagerArn] = js.undefined
  
  /**
    *  The compliance type that the new custom framework supports, such as CIS or HIPAA. 
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  The control sets that are associated with the framework. 
    */
  var controlSets: js.UndefOr[ControlSets] = js.undefined
  
  /**
    *  The sources that Audit Manager collects evidence from for the control. 
    */
  var controlSources: js.UndefOr[ControlSources] = js.undefined
  
  /**
    *  Specifies when the framework was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The IAM user or role that created the framework. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.undefined
  
  /**
    *  The description of the framework. 
    */
  var description: js.UndefOr[FrameworkDescription] = js.undefined
  
  /**
    *  The unique identifier for the framework. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  Specifies when the framework was most recently updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The IAM user or role that most recently updated the framework. 
    */
  var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined
  
  /**
    *  The logo that's associated with the framework. 
    */
  var logo: js.UndefOr[Filename] = js.undefined
  
  /**
    *  The name of the framework. 
    */
  var name: js.UndefOr[FrameworkName] = js.undefined
  
  /**
    *  The tags that are associated with the framework. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The framework type, such as a custom framework or a standard framework. 
    */
  var `type`: js.UndefOr[FrameworkType] = js.undefined
}
object Framework {
  
  inline def apply(): Framework = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Framework]
  }
  
  extension [Self <: Framework](x: Self) {
    
    inline def setArn(value: AuditManagerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setControlSets(value: ControlSets): Self = StObject.set(x, "controlSets", value.asInstanceOf[js.Any])
    
    inline def setControlSetsUndefined: Self = StObject.set(x, "controlSets", js.undefined)
    
    inline def setControlSetsVarargs(value: ControlSet*): Self = StObject.set(x, "controlSets", js.Array(value*))
    
    inline def setControlSources(value: ControlSources): Self = StObject.set(x, "controlSources", value.asInstanceOf[js.Any])
    
    inline def setControlSourcesUndefined: Self = StObject.set(x, "controlSources", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: FrameworkDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLastUpdatedBy(value: LastUpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    inline def setLogo(value: Filename): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: FrameworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: FrameworkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
