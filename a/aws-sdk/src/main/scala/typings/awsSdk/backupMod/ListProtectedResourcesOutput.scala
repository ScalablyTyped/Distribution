package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtectedResourcesOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  var Results: js.UndefOr[ProtectedResourcesList] = js.native
}
object ListProtectedResourcesOutput {
  
  @scala.inline
  def apply(): ListProtectedResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectedResourcesOutput]
  }
  
  @scala.inline
  implicit class ListProtectedResourcesOutputMutableBuilder[Self <: ListProtectedResourcesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResults(value: ProtectedResourcesList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: ProtectedResource*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
