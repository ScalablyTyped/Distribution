package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInfoEntry extends StObject {
  
  /**
    *  This specifies if the update was initiated by the customer or by the service team. 
    */
  var InitiatedBy: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.InitiatedBy] = js.undefined
  
  /**
    *  The last updated date and time of a particular directory setting. 
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The new value of the target setting. 
    */
  var NewValue: js.UndefOr[UpdateValue] = js.undefined
  
  /**
    *  The old value of the target setting. 
    */
  var PreviousValue: js.UndefOr[UpdateValue] = js.undefined
  
  /**
    *  The name of the Region. 
    */
  var Region: js.UndefOr[RegionName] = js.undefined
  
  /**
    *  The start time of the UpdateDirectorySetup for the particular type. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of the update performed on the directory. 
    */
  var Status: js.UndefOr[UpdateStatus] = js.undefined
  
  /**
    *  The reason for the current status of the update type activity. 
    */
  var StatusReason: js.UndefOr[UpdateStatusReason] = js.undefined
}
object UpdateInfoEntry {
  
  inline def apply(): UpdateInfoEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInfoEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInfoEntry] (val x: Self) extends AnyVal {
    
    inline def setInitiatedBy(value: InitiatedBy): Self = StObject.set(x, "InitiatedBy", value.asInstanceOf[js.Any])
    
    inline def setInitiatedByUndefined: Self = StObject.set(x, "InitiatedBy", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    inline def setNewValue(value: UpdateValue): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "NewValue", js.undefined)
    
    inline def setPreviousValue(value: UpdateValue): Self = StObject.set(x, "PreviousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueUndefined: Self = StObject.set(x, "PreviousValue", js.undefined)
    
    inline def setRegion(value: RegionName): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: UpdateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: UpdateStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
