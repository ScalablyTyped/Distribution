package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesCount extends StObject {
  
  /**
    * The number of instances in the Assigning state.
    */
  var Assigning: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with booting status.
    */
  var Booting: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with connection_lost status.
    */
  var ConnectionLost: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Deregistering state.
    */
  var Deregistering: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with online status.
    */
  var Online: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with pending status.
    */
  var Pending: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with rebooting status.
    */
  var Rebooting: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Registered state.
    */
  var Registered: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Registering state.
    */
  var Registering: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with requested status.
    */
  var Requested: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with running_setup status.
    */
  var RunningSetup: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with setup_failed status.
    */
  var SetupFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with shutting_down status.
    */
  var ShuttingDown: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with start_failed status.
    */
  var StartFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with stop_failed status.
    */
  var StopFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with stopped status.
    */
  var Stopped: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with stopping status.
    */
  var Stopping: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with terminated status.
    */
  var Terminated: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with terminating status.
    */
  var Terminating: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Unassigning state.
    */
  var Unassigning: js.UndefOr[Integer] = js.undefined
}
object InstancesCount {
  
  inline def apply(): InstancesCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCount]
  }
  
  extension [Self <: InstancesCount](x: Self) {
    
    inline def setAssigning(value: Integer): Self = StObject.set(x, "Assigning", value.asInstanceOf[js.Any])
    
    inline def setAssigningUndefined: Self = StObject.set(x, "Assigning", js.undefined)
    
    inline def setBooting(value: Integer): Self = StObject.set(x, "Booting", value.asInstanceOf[js.Any])
    
    inline def setBootingUndefined: Self = StObject.set(x, "Booting", js.undefined)
    
    inline def setConnectionLost(value: Integer): Self = StObject.set(x, "ConnectionLost", value.asInstanceOf[js.Any])
    
    inline def setConnectionLostUndefined: Self = StObject.set(x, "ConnectionLost", js.undefined)
    
    inline def setDeregistering(value: Integer): Self = StObject.set(x, "Deregistering", value.asInstanceOf[js.Any])
    
    inline def setDeregisteringUndefined: Self = StObject.set(x, "Deregistering", js.undefined)
    
    inline def setOnline(value: Integer): Self = StObject.set(x, "Online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "Online", js.undefined)
    
    inline def setPending(value: Integer): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    inline def setRebooting(value: Integer): Self = StObject.set(x, "Rebooting", value.asInstanceOf[js.Any])
    
    inline def setRebootingUndefined: Self = StObject.set(x, "Rebooting", js.undefined)
    
    inline def setRegistered(value: Integer): Self = StObject.set(x, "Registered", value.asInstanceOf[js.Any])
    
    inline def setRegisteredUndefined: Self = StObject.set(x, "Registered", js.undefined)
    
    inline def setRegistering(value: Integer): Self = StObject.set(x, "Registering", value.asInstanceOf[js.Any])
    
    inline def setRegisteringUndefined: Self = StObject.set(x, "Registering", js.undefined)
    
    inline def setRequested(value: Integer): Self = StObject.set(x, "Requested", value.asInstanceOf[js.Any])
    
    inline def setRequestedUndefined: Self = StObject.set(x, "Requested", js.undefined)
    
    inline def setRunningSetup(value: Integer): Self = StObject.set(x, "RunningSetup", value.asInstanceOf[js.Any])
    
    inline def setRunningSetupUndefined: Self = StObject.set(x, "RunningSetup", js.undefined)
    
    inline def setSetupFailed(value: Integer): Self = StObject.set(x, "SetupFailed", value.asInstanceOf[js.Any])
    
    inline def setSetupFailedUndefined: Self = StObject.set(x, "SetupFailed", js.undefined)
    
    inline def setShuttingDown(value: Integer): Self = StObject.set(x, "ShuttingDown", value.asInstanceOf[js.Any])
    
    inline def setShuttingDownUndefined: Self = StObject.set(x, "ShuttingDown", js.undefined)
    
    inline def setStartFailed(value: Integer): Self = StObject.set(x, "StartFailed", value.asInstanceOf[js.Any])
    
    inline def setStartFailedUndefined: Self = StObject.set(x, "StartFailed", js.undefined)
    
    inline def setStopFailed(value: Integer): Self = StObject.set(x, "StopFailed", value.asInstanceOf[js.Any])
    
    inline def setStopFailedUndefined: Self = StObject.set(x, "StopFailed", js.undefined)
    
    inline def setStopped(value: Integer): Self = StObject.set(x, "Stopped", value.asInstanceOf[js.Any])
    
    inline def setStoppedUndefined: Self = StObject.set(x, "Stopped", js.undefined)
    
    inline def setStopping(value: Integer): Self = StObject.set(x, "Stopping", value.asInstanceOf[js.Any])
    
    inline def setStoppingUndefined: Self = StObject.set(x, "Stopping", js.undefined)
    
    inline def setTerminated(value: Integer): Self = StObject.set(x, "Terminated", value.asInstanceOf[js.Any])
    
    inline def setTerminatedUndefined: Self = StObject.set(x, "Terminated", js.undefined)
    
    inline def setTerminating(value: Integer): Self = StObject.set(x, "Terminating", value.asInstanceOf[js.Any])
    
    inline def setTerminatingUndefined: Self = StObject.set(x, "Terminating", js.undefined)
    
    inline def setUnassigning(value: Integer): Self = StObject.set(x, "Unassigning", value.asInstanceOf[js.Any])
    
    inline def setUnassigningUndefined: Self = StObject.set(x, "Unassigning", js.undefined)
  }
}
