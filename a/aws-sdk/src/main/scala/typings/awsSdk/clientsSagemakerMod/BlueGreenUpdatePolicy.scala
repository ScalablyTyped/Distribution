package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreenUpdatePolicy extends StObject {
  
  /**
    * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting time specified in TerminationWaitInSeconds and WaitIntervalInSeconds.
    */
  var MaximumExecutionTimeoutInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaximumExecutionTimeoutInSeconds] = js.undefined
  
  /**
    * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old endpoint fleet. Default is 0.
    */
  var TerminationWaitInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TerminationWaitInSeconds] = js.undefined
  
  /**
    * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment.
    */
  var TrafficRoutingConfiguration: TrafficRoutingConfig
}
object BlueGreenUpdatePolicy {
  
  inline def apply(TrafficRoutingConfiguration: TrafficRoutingConfig): BlueGreenUpdatePolicy = {
    val __obj = js.Dynamic.literal(TrafficRoutingConfiguration = TrafficRoutingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlueGreenUpdatePolicy]
  }
  
  extension [Self <: BlueGreenUpdatePolicy](x: Self) {
    
    inline def setMaximumExecutionTimeoutInSeconds(value: MaximumExecutionTimeoutInSeconds): Self = StObject.set(x, "MaximumExecutionTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumExecutionTimeoutInSecondsUndefined: Self = StObject.set(x, "MaximumExecutionTimeoutInSeconds", js.undefined)
    
    inline def setTerminationWaitInSeconds(value: TerminationWaitInSeconds): Self = StObject.set(x, "TerminationWaitInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTerminationWaitInSecondsUndefined: Self = StObject.set(x, "TerminationWaitInSeconds", js.undefined)
    
    inline def setTrafficRoutingConfiguration(value: TrafficRoutingConfig): Self = StObject.set(x, "TrafficRoutingConfiguration", value.asInstanceOf[js.Any])
  }
}
