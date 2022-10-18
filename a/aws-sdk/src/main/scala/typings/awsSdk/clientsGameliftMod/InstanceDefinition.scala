package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceDefinition extends StObject {
  
  /**
    * An Amazon EC2 instance type designation.
    */
  var InstanceType: GameServerGroupInstanceType
  
  /**
    * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and better identify the most cost-effective options. For detailed information on weighting instance capacity, see Instance Weighting in the Amazon Elastic Compute Cloud Auto Scaling User Guide. Default value is "1".
    */
  var WeightedCapacity: js.UndefOr[typings.awsSdk.clientsGameliftMod.WeightedCapacity] = js.undefined
}
object InstanceDefinition {
  
  inline def apply(InstanceType: GameServerGroupInstanceType): InstanceDefinition = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDefinition]
  }
  
  extension [Self <: InstanceDefinition](x: Self) {
    
    inline def setInstanceType(value: GameServerGroupInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacity(value: WeightedCapacity): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
