package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoreSuccessItem extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which fast snapshot restores entered the disabled state.
    */
  var DisabledTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which fast snapshot restores entered the disabling state.
    */
  var DisablingTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which fast snapshot restores entered the enabled state.
    */
  var EnabledTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which fast snapshot restores entered the enabling state.
    */
  var EnablingTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which fast snapshot restores entered the optimizing state.
    */
  var OptimizingTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services owner alias that enabled fast snapshot restores on the snapshot. This is intended for future use.
    */
  var OwnerAlias: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that enabled fast snapshot restores on the snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of fast snapshot restores for the snapshot.
    */
  var State: js.UndefOr[FastSnapshotRestoreStateCode] = js.undefined
  
  /**
    * The reason for the state transition. The possible values are as follows:    Client.UserInitiated - The state successfully transitioned to enabling or disabling.    Client.UserInitiated - Lifecycle state transition - The state successfully transitioned to optimizing, enabled, or disabled.  
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
}
object DisableFastSnapshotRestoreSuccessItem {
  
  inline def apply(): DisableFastSnapshotRestoreSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreSuccessItem]
  }
  
  extension [Self <: DisableFastSnapshotRestoreSuccessItem](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDisabledTime(value: js.Date): Self = StObject.set(x, "DisabledTime", value.asInstanceOf[js.Any])
    
    inline def setDisabledTimeUndefined: Self = StObject.set(x, "DisabledTime", js.undefined)
    
    inline def setDisablingTime(value: js.Date): Self = StObject.set(x, "DisablingTime", value.asInstanceOf[js.Any])
    
    inline def setDisablingTimeUndefined: Self = StObject.set(x, "DisablingTime", js.undefined)
    
    inline def setEnabledTime(value: js.Date): Self = StObject.set(x, "EnabledTime", value.asInstanceOf[js.Any])
    
    inline def setEnabledTimeUndefined: Self = StObject.set(x, "EnabledTime", js.undefined)
    
    inline def setEnablingTime(value: js.Date): Self = StObject.set(x, "EnablingTime", value.asInstanceOf[js.Any])
    
    inline def setEnablingTimeUndefined: Self = StObject.set(x, "EnablingTime", js.undefined)
    
    inline def setOptimizingTime(value: js.Date): Self = StObject.set(x, "OptimizingTime", value.asInstanceOf[js.Any])
    
    inline def setOptimizingTimeUndefined: Self = StObject.set(x, "OptimizingTime", js.undefined)
    
    inline def setOwnerAlias(value: String): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    inline def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setState(value: FastSnapshotRestoreStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
