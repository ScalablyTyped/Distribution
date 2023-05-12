package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWirelessDeviceImportTasksResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * List of import tasks and summary information of onboarding status of devices in each import task.
    */
  var WirelessDeviceImportTaskList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WirelessDeviceImportTaskList] = js.undefined
}
object ListWirelessDeviceImportTasksResponse {
  
  inline def apply(): ListWirelessDeviceImportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWirelessDeviceImportTasksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWirelessDeviceImportTasksResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWirelessDeviceImportTaskList(value: WirelessDeviceImportTaskList): Self = StObject.set(x, "WirelessDeviceImportTaskList", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceImportTaskListUndefined: Self = StObject.set(x, "WirelessDeviceImportTaskList", js.undefined)
    
    inline def setWirelessDeviceImportTaskListVarargs(value: WirelessDeviceImportTask*): Self = StObject.set(x, "WirelessDeviceImportTaskList", js.Array(value*))
  }
}
