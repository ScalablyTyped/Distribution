package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceDataSyncResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * A list of your current resource data sync configurations and their statuses.
    */
  var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.undefined
}
object ListResourceDataSyncResult {
  
  inline def apply(): ListResourceDataSyncResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDataSyncResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceDataSyncResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceDataSyncItems(value: ResourceDataSyncItemList): Self = StObject.set(x, "ResourceDataSyncItems", value.asInstanceOf[js.Any])
    
    inline def setResourceDataSyncItemsUndefined: Self = StObject.set(x, "ResourceDataSyncItems", js.undefined)
    
    inline def setResourceDataSyncItemsVarargs(value: ResourceDataSyncItem*): Self = StObject.set(x, "ResourceDataSyncItems", js.Array(value*))
  }
}
