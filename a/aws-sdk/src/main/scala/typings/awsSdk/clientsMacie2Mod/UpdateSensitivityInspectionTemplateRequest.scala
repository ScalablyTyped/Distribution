package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSensitivityInspectionTemplateRequest extends StObject {
  
  /**
    * A custom description of the template. The description can contain as many as 200 characters.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    *  The managed data identifiers to explicitly exclude (not use) when analyzing data. To exclude an allow list or custom data identifier that's currently included by the template, update the values for the SensitivityInspectionTemplateIncludes.allowListIds and SensitivityInspectionTemplateIncludes.customDataIdentifierIds properties, respectively.
    */
  var excludes: js.UndefOr[SensitivityInspectionTemplateExcludes] = js.undefined
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
  
  /**
    * The allow lists, custom data identifiers, and managed data identifiers to include (use) when analyzing data.
    */
  var includes: js.UndefOr[SensitivityInspectionTemplateIncludes] = js.undefined
}
object UpdateSensitivityInspectionTemplateRequest {
  
  inline def apply(id: string): UpdateSensitivityInspectionTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSensitivityInspectionTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSensitivityInspectionTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExcludes(value: SensitivityInspectionTemplateExcludes): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: SensitivityInspectionTemplateIncludes): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
  }
}
