package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesForWirelessDeviceImportTaskRequest extends StObject {
  
  /**
    * The identifier of the import task for which wireless devices are listed.
    */
  var Id: ImportTaskId
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.MaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * The status of the devices in the import task.
    */
  var Status: js.UndefOr[OnboardStatus] = js.undefined
}
object ListDevicesForWirelessDeviceImportTaskRequest {
  
  inline def apply(Id: ImportTaskId): ListDevicesForWirelessDeviceImportTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesForWirelessDeviceImportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicesForWirelessDeviceImportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ImportTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: OnboardStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
