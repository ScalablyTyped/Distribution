package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunGroupsResponse extends StObject {
  
  /**
    * A list of groups.
    */
  var items: js.UndefOr[RunGroupList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[RunGroupListToken] = js.undefined
}
object ListRunGroupsResponse {
  
  inline def apply(): ListRunGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRunGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: RunGroupList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RunGroupListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: RunGroupListToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
