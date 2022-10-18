package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTaskTemplatesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.  This is always returned as a null in the response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * Provides details about a list of task templates belonging to an instance.
    */
  var TaskTemplates: js.UndefOr[TaskTemplateList] = js.undefined
}
object ListTaskTemplatesResponse {
  
  inline def apply(): ListTaskTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskTemplatesResponse]
  }
  
  extension [Self <: ListTaskTemplatesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskTemplates(value: TaskTemplateList): Self = StObject.set(x, "TaskTemplates", value.asInstanceOf[js.Any])
    
    inline def setTaskTemplatesUndefined: Self = StObject.set(x, "TaskTemplates", js.undefined)
    
    inline def setTaskTemplatesVarargs(value: TaskTemplateMetadata*): Self = StObject.set(x, "TaskTemplates", js.Array(value*))
  }
}
