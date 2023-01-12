package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCasesResponseItem extends StObject {
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
  
  /**
    * List of case field values.
    */
  var fields: SearchCasesResponseItemFieldsList
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object SearchCasesResponseItem {
  
  inline def apply(caseId: CaseId, fields: SearchCasesResponseItemFieldsList, templateId: TemplateId): SearchCasesResponseItem = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCasesResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchCasesResponseItem] (val x: Self) extends AnyVal {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: SearchCasesResponseItemFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldValue*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
