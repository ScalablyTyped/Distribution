package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMulticastGroupsResponse extends StObject {
  
  var MulticastGroupList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.MulticastGroupList] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListMulticastGroupsResponse {
  
  inline def apply(): ListMulticastGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMulticastGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMulticastGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setMulticastGroupList(value: MulticastGroupList): Self = StObject.set(x, "MulticastGroupList", value.asInstanceOf[js.Any])
    
    inline def setMulticastGroupListUndefined: Self = StObject.set(x, "MulticastGroupList", js.undefined)
    
    inline def setMulticastGroupListVarargs(value: MulticastGroup*): Self = StObject.set(x, "MulticastGroupList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
