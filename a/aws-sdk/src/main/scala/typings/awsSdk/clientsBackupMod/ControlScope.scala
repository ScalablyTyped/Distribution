package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlScope extends StObject {
  
  /**
    * The ID of the only Amazon Web Services resource that you want your control scope to contain.
    */
  var ComplianceResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined
  
  /**
    * Describes whether the control scope includes one or more types of resources, such as EFS or RDS.
    */
  var ComplianceResourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
  
  /**
    * The tag key-value pair applied to those Amazon Web Services resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided. The tag value is optional, but it cannot be an empty string. The structure to assign a tag is: [{"Key":"string","Value":"string"}].
    */
  var Tags: js.UndefOr[stringMap] = js.undefined
}
object ControlScope {
  
  inline def apply(): ControlScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlScope]
  }
  
  extension [Self <: ControlScope](x: Self) {
    
    inline def setComplianceResourceIds(value: ComplianceResourceIdList): Self = StObject.set(x, "ComplianceResourceIds", value.asInstanceOf[js.Any])
    
    inline def setComplianceResourceIdsUndefined: Self = StObject.set(x, "ComplianceResourceIds", js.undefined)
    
    inline def setComplianceResourceIdsVarargs(value: String*): Self = StObject.set(x, "ComplianceResourceIds", js.Array(value*))
    
    inline def setComplianceResourceTypes(value: ResourceTypeList): Self = StObject.set(x, "ComplianceResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setComplianceResourceTypesUndefined: Self = StObject.set(x, "ComplianceResourceTypes", js.undefined)
    
    inline def setComplianceResourceTypesVarargs(value: ARN*): Self = StObject.set(x, "ComplianceResourceTypes", js.Array(value*))
    
    inline def setTags(value: stringMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
