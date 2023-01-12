package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectedResourcesOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of resources successfully backed up by Backup including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  var Results: js.UndefOr[ProtectedResourcesList] = js.undefined
}
object ListProtectedResourcesOutput {
  
  inline def apply(): ListProtectedResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectedResourcesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProtectedResourcesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResults(value: ProtectedResourcesList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: ProtectedResource*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
