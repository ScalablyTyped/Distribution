package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInputSourcesResponse extends StObject {
  
  /**
    * The list of Resilience Hub application input sources.
    */
  var appInputSources: AppInputSourceList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppInputSourcesResponse {
  
  inline def apply(appInputSources: AppInputSourceList): ListAppInputSourcesResponse = {
    val __obj = js.Dynamic.literal(appInputSources = appInputSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppInputSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppInputSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInputSources(value: AppInputSourceList): Self = StObject.set(x, "appInputSources", value.asInstanceOf[js.Any])
    
    inline def setAppInputSourcesVarargs(value: AppInputSource*): Self = StObject.set(x, "appInputSources", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
