package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCaseResponse extends StObject {
  
  /**
    * A list of detailed field information. 
    */
  var fields: GetCaseResponseFieldsList
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object GetCaseResponse {
  
  inline def apply(fields: GetCaseResponseFieldsList, templateId: TemplateId): GetCaseResponse = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCaseResponse] (val x: Self) extends AnyVal {
    
    inline def setFields(value: GetCaseResponseFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldValue*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
