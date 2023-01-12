package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobTemplatesResponse extends StObject {
  
  /**
    * A list of objects that contain information about the job templates.
    */
  var jobTemplates: js.UndefOr[JobTemplateSummaryList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobTemplatesResponse {
  
  inline def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setJobTemplates(value: JobTemplateSummaryList): Self = StObject.set(x, "jobTemplates", value.asInstanceOf[js.Any])
    
    inline def setJobTemplatesUndefined: Self = StObject.set(x, "jobTemplates", js.undefined)
    
    inline def setJobTemplatesVarargs(value: JobTemplateSummary*): Self = StObject.set(x, "jobTemplates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
