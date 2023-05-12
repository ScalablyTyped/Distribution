package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSyncResourcesResponse extends StObject {
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The sync resources.
    */
  var syncResources: js.UndefOr[SyncResourceSummaries] = js.undefined
}
object ListSyncResourcesResponse {
  
  inline def apply(): ListSyncResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSyncResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSyncResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSyncResources(value: SyncResourceSummaries): Self = StObject.set(x, "syncResources", value.asInstanceOf[js.Any])
    
    inline def setSyncResourcesUndefined: Self = StObject.set(x, "syncResources", js.undefined)
    
    inline def setSyncResourcesVarargs(value: SyncResourceSummary*): Self = StObject.set(x, "syncResources", js.Array(value*))
  }
}
