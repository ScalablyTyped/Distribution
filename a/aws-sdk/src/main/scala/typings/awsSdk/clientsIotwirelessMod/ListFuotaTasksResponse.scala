package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFuotaTasksResponse extends StObject {
  
  var FuotaTaskList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FuotaTaskList] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListFuotaTasksResponse {
  
  inline def apply(): ListFuotaTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFuotaTasksResponse]
  }
  
  extension [Self <: ListFuotaTasksResponse](x: Self) {
    
    inline def setFuotaTaskList(value: FuotaTaskList): Self = StObject.set(x, "FuotaTaskList", value.asInstanceOf[js.Any])
    
    inline def setFuotaTaskListUndefined: Self = StObject.set(x, "FuotaTaskList", js.undefined)
    
    inline def setFuotaTaskListVarargs(value: FuotaTask*): Self = StObject.set(x, "FuotaTaskList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
