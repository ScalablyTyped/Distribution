package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobTemplatesResponse extends StObject {
  
  /**
    *  This output displays the token for the next set of job templates.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * This output lists information about the specified job templates.
    */
  var templates: js.UndefOr[JobTemplates] = js.undefined
}
object ListJobTemplatesResponse {
  
  inline def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplates(value: JobTemplates): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: JobTemplate*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
