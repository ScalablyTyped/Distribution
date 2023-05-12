package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessDeviceImportTask extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the wireless device import task.
    */
  var Arn: js.UndefOr[ImportTaskArn] = js.undefined
  
  /**
    * The time at which the import task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Sidewalk destination that that describes the IoT rule to route messages from the device in the import task that will be onboarded to AWS IoT Wireless
    */
  var DestinationName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationName] = js.undefined
  
  /**
    * The summary information of count of wireless devices in an import task that failed to onboarded to the import task.
    */
  var FailedImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The ID of the wireless device import task.
    */
  var Id: js.UndefOr[ImportTaskId] = js.undefined
  
  /**
    * The summary information of count of wireless devices that are waiting for the control log to be added to an import task.
    */
  var InitializedImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The summary information of count of wireless devices in an import task that have been onboarded to the import task.
    */
  var OnboardedImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The summary information of count of wireless devices in an import task that are waiting in the queue to be onboarded.
    */
  var PendingImportedDeviceCount: js.UndefOr[ImportedWirelessDeviceCount] = js.undefined
  
  /**
    * The Sidewalk-related information of the wireless device import task.
    */
  var Sidewalk: js.UndefOr[SidewalkGetStartImportInfo] = js.undefined
  
  /**
    * The status information of the wireless device import task.
    */
  var Status: js.UndefOr[ImportTaskStatus] = js.undefined
  
  /**
    * The reason that provides additional information about the import task status.
    */
  var StatusReason: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.StatusReason] = js.undefined
}
object WirelessDeviceImportTask {
  
  inline def apply(): WirelessDeviceImportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessDeviceImportTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WirelessDeviceImportTask] (val x: Self) extends AnyVal {
    
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
