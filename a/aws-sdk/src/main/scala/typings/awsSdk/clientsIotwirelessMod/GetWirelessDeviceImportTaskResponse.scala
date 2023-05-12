package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessDeviceImportTaskResponse extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the import task.
    */
  var Arn: js.UndefOr[ImportTaskArn] = js.undefined
  
  /**
    * The time at which the import task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the destination that's assigned to the wireless devices in the import task.
    */
  var DestinationName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationName] = js.undefined
  
  /**
    * The number of devices in the import task that failed to onboard to the import task.
    */
  var FailedImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The identifier of the import task for which information is retrieved.
    */
  var Id: js.UndefOr[ImportTaskId] = js.undefined
  
  /**
    * The number of devices in the import task that are waiting for the control log to start processing.
    */
  var InitializedImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The number of devices in the import task that have been onboarded to the import task.
    */
  var OnboardedImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The number of devices in the import task that are waiting in the import task queue to be onboarded.
    */
  var PendingImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The Sidewalk-related information about an import task.
    */
  var Sidewalk: js.UndefOr[SidewalkGetStartImportInfo] = js.undefined
  
  /**
    * The import task status.
    */
  var Status: js.UndefOr[ImportTaskStatus] = js.undefined
  
  /**
    * The reason for the provided status information, such as a validation error that causes the import task to fail.
    */
  var StatusReason: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.StatusReason] = js.undefined
}
object GetWirelessDeviceImportTaskResponse {
  
  inline def apply(): GetWirelessDeviceImportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessDeviceImportTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessDeviceImportTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImportTaskArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setFailedImportedDeviceCount(value: ImportedWirelessDeviceCount): Self = StObject.set(x, "FailedImportedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setFailedImportedDeviceCountUndefined: Self = StObject.set(x, "FailedImportedDeviceCount", js.undefined)
    
    inline def setId(value: ImportTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInitializedImportedDeviceCount(value: ImportedWirelessDeviceCount): Self = StObject.set(x, "InitializedImportedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setInitializedImportedDeviceCountUndefined: Self = StObject.set(x, "InitializedImportedDeviceCount", js.undefined)
    
    inline def setOnboardedImportedDeviceCount(value: ImportedWirelessDeviceCount): Self = StObject.set(x, "OnboardedImportedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setOnboardedImportedDeviceCountUndefined: Self = StObject.set(x, "OnboardedImportedDeviceCount", js.undefined)
    
    inline def setPendingImportedDeviceCount(value: ImportedWirelessDeviceCount): Self = StObject.set(x, "PendingImportedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setPendingImportedDeviceCountUndefined: Self = StObject.set(x, "PendingImportedDeviceCount", js.undefined)
    
    inline def setSidewalk(value: SidewalkGetStartImportInfo): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
    
    inline def setStatus(value: ImportTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
