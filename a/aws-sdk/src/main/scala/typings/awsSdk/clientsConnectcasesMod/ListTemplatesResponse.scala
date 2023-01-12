package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplatesResponse extends StObject {
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * List of template summary objects.
    */
  var templates: ListTemplatesResponseTemplatesList
}
object ListTemplatesResponse {
  
  inline def apply(templates: ListTemplatesResponseTemplatesList): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplates(value: ListTemplatesResponseTemplatesList): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesVarargs(value: TemplateSummary*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
