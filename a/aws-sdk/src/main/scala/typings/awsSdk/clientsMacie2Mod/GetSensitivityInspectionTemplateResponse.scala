package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitivityInspectionTemplateResponse extends StObject {
  
  /**
    * The custom description of the template.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    *  The managed data identifiers that are explicitly excluded (not used) when analyzing data.
    */
  var excludes: js.UndefOr[SensitivityInspectionTemplateExcludes] = js.undefined
  
  /**
    * The allow lists, custom data identifiers, and managed data identifiers that are included (used) when analyzing data.
    */
  var includes: js.UndefOr[SensitivityInspectionTemplateIncludes] = js.undefined
  
  /**
    * The name of the template: automated-sensitive-data-discovery.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the template.
    */
  var sensitivityInspectionTemplateId: js.UndefOr[SensitivityInspectionTemplateId] = js.undefined
}
object GetSensitivityInspectionTemplateResponse {
  
  inline def apply(): GetSensitivityInspectionTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSensitivityInspectionTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSensitivityInspectionTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExcludes(value: SensitivityInspectionTemplateExcludes): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setIncludes(value: SensitivityInspectionTemplateIncludes): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSensitivityInspectionTemplateId(value: SensitivityInspectionTemplateId): Self = StObject.set(x, "sensitivityInspectionTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSensitivityInspectionTemplateIdUndefined: Self = StObject.set(x, "sensitivityInspectionTemplateId", js.undefined)
  }
}
