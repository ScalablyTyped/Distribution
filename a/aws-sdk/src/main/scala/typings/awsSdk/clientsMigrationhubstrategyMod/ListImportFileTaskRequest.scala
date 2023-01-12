package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportFileTaskRequest extends StObject {
  
  /**
    *  The total number of items to return. The maximum value is 100. 
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The token from a previous call that you use to retrieve the next set of results. For example, if a previous call to this action returned 100 items, but you set maxResults to 10. You'll receive a set of 10 results along with a token. You then use the returned token to retrieve the next set of 10. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListImportFileTaskRequest {
  
  inline def apply(): ListImportFileTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportFileTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportFileTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
