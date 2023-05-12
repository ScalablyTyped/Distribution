package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerGroupAutoScalingPolicy extends StObject {
  
  /**
    * Length of time, in seconds, it takes for a new instance to start new game server processes and register with Amazon GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up, because it avoids prematurely starting new instances. 
    */
  var EstimatedInstanceWarmup: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a target-based policy that tracks the Amazon GameLift FleetIQ metric "PercentUtilizedGameServers" and specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server group capacity so that the metric returns to the target value. 
    */
  var TargetTrackingConfiguration: typings.awsSdk.clientsGameliftMod.TargetTrackingConfiguration
}
object GameServerGroupAutoScalingPolicy {
  
  inline def apply(TargetTrackingConfiguration: TargetTrackingConfiguration): GameServerGroupAutoScalingPolicy = {
    val __obj = js.Dynamic.literal(TargetTrackingConfiguration = TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameServerGroupAutoScalingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameServerGroupAutoScalingPolicy] (val x: Self) extends AnyVal {
    
    inline def setEstimatedInstanceWarmup(value: PositiveInteger): Self = StObject.set(x, "EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    inline def setEstimatedInstanceWarmupUndefined: Self = StObject.set(x, "EstimatedInstanceWarmup", js.undefined)
    
    inline def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = StObject.set(x, "TargetTrackingConfiguration", value.asInstanceOf[js.Any])
  }
}
