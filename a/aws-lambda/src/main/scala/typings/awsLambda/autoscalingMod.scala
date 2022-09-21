package typings.awsLambda

import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscalingMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.spot
    - typings.awsLambda.awsLambdaStrings.`on-demand`
  */
  trait AutoScalingInstanceMarketOption extends StObject
  object AutoScalingInstanceMarketOption {
    
    inline def `on-demand`: typings.awsLambda.awsLambdaStrings.`on-demand` = "on-demand".asInstanceOf[typings.awsLambda.awsLambdaStrings.`on-demand`]
    
    inline def spot: typings.awsLambda.awsLambdaStrings.spot = "spot".asInstanceOf[typings.awsLambda.awsLambdaStrings.spot]
  }
  
  trait AutoScalingInstanceRecord extends StObject {
    
    var AvailabilityZone: String
    
    var InstanceId: String
    
    var InstanceMarketOption: AutoScalingInstanceMarketOption
    
    var InstanceType: String
  }
  object AutoScalingInstanceRecord {
    
    inline def apply(
      AvailabilityZone: String,
      InstanceId: String,
      InstanceMarketOption: AutoScalingInstanceMarketOption,
      InstanceType: String
    ): AutoScalingInstanceRecord = {
      val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], InstanceMarketOption = InstanceMarketOption.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingInstanceRecord]
    }
    
    extension [Self <: AutoScalingInstanceRecord](x: Self) {
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceMarketOption(value: AutoScalingInstanceMarketOption): Self = StObject.set(x, "InstanceMarketOption", value.asInstanceOf[js.Any])
      
      inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    }
  }
  
  type AutoScalingScaleInCallback = Callback[AutoScalingScaleInResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.SCALE_IN
    - typings.awsLambda.awsLambdaStrings.INSTANCE_REFRESH
    - typings.awsLambda.awsLambdaStrings.MAX_INSTANCE_LIFETIME
    - typings.awsLambda.awsLambdaStrings.REBALANCE
  */
  trait AutoScalingScaleInCause extends StObject
  object AutoScalingScaleInCause {
    
    inline def INSTANCE_REFRESH: typings.awsLambda.awsLambdaStrings.INSTANCE_REFRESH = "INSTANCE_REFRESH".asInstanceOf[typings.awsLambda.awsLambdaStrings.INSTANCE_REFRESH]
    
    inline def MAX_INSTANCE_LIFETIME: typings.awsLambda.awsLambdaStrings.MAX_INSTANCE_LIFETIME = "MAX_INSTANCE_LIFETIME".asInstanceOf[typings.awsLambda.awsLambdaStrings.MAX_INSTANCE_LIFETIME]
    
    inline def REBALANCE: typings.awsLambda.awsLambdaStrings.REBALANCE = "REBALANCE".asInstanceOf[typings.awsLambda.awsLambdaStrings.REBALANCE]
    
    inline def SCALE_IN: typings.awsLambda.awsLambdaStrings.SCALE_IN = "SCALE_IN".asInstanceOf[typings.awsLambda.awsLambdaStrings.SCALE_IN]
  }
  
  trait AutoScalingScaleInEvent extends StObject {
    
    var AutoScalingGroupARN: String
    
    var AutoScalingGroupName: String
    
    var CapacityToTerminate: js.Array[AutoScalingTerminationRequest]
    
    var Cause: AutoScalingScaleInCause
    
    var HasMoreInstances: js.UndefOr[Boolean] = js.undefined
    
    var Instances: js.Array[AutoScalingInstanceRecord]
  }
  object AutoScalingScaleInEvent {
    
    inline def apply(
      AutoScalingGroupARN: String,
      AutoScalingGroupName: String,
      CapacityToTerminate: js.Array[AutoScalingTerminationRequest],
      Cause: AutoScalingScaleInCause,
      Instances: js.Array[AutoScalingInstanceRecord]
    ): AutoScalingScaleInEvent = {
      val __obj = js.Dynamic.literal(AutoScalingGroupARN = AutoScalingGroupARN.asInstanceOf[js.Any], AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], CapacityToTerminate = CapacityToTerminate.asInstanceOf[js.Any], Cause = Cause.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingScaleInEvent]
    }
    
    extension [Self <: AutoScalingScaleInEvent](x: Self) {
      
      inline def setAutoScalingGroupARN(value: String): Self = StObject.set(x, "AutoScalingGroupARN", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingGroupName(value: String): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
      
      inline def setCapacityToTerminate(value: js.Array[AutoScalingTerminationRequest]): Self = StObject.set(x, "CapacityToTerminate", value.asInstanceOf[js.Any])
      
      inline def setCapacityToTerminateVarargs(value: AutoScalingTerminationRequest*): Self = StObject.set(x, "CapacityToTerminate", js.Array(value*))
      
      inline def setCause(value: AutoScalingScaleInCause): Self = StObject.set(x, "Cause", value.asInstanceOf[js.Any])
      
      inline def setHasMoreInstances(value: Boolean): Self = StObject.set(x, "HasMoreInstances", value.asInstanceOf[js.Any])
      
      inline def setHasMoreInstancesUndefined: Self = StObject.set(x, "HasMoreInstances", js.undefined)
      
      inline def setInstances(value: js.Array[AutoScalingInstanceRecord]): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: AutoScalingInstanceRecord*): Self = StObject.set(x, "Instances", js.Array(value*))
    }
  }
  
  type AutoScalingScaleInHandler = Handler[AutoScalingScaleInEvent, AutoScalingScaleInResult]
  
  trait AutoScalingScaleInResult extends StObject {
    
    var InstanceIDs: js.Array[String]
  }
  object AutoScalingScaleInResult {
    
    inline def apply(InstanceIDs: js.Array[String]): AutoScalingScaleInResult = {
      val __obj = js.Dynamic.literal(InstanceIDs = InstanceIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingScaleInResult]
    }
    
    extension [Self <: AutoScalingScaleInResult](x: Self) {
      
      inline def setInstanceIDs(value: js.Array[String]): Self = StObject.set(x, "InstanceIDs", value.asInstanceOf[js.Any])
      
      inline def setInstanceIDsVarargs(value: String*): Self = StObject.set(x, "InstanceIDs", js.Array(value*))
    }
  }
  
  trait AutoScalingTerminationRequest extends StObject {
    
    var AvailabilityZone: String
    
    var Capacity: Double
    
    var InstanceMarketOption: AutoScalingInstanceMarketOption
  }
  object AutoScalingTerminationRequest {
    
    inline def apply(AvailabilityZone: String, Capacity: Double, InstanceMarketOption: AutoScalingInstanceMarketOption): AutoScalingTerminationRequest = {
      val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Capacity = Capacity.asInstanceOf[js.Any], InstanceMarketOption = InstanceMarketOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingTerminationRequest]
    }
    
    extension [Self <: AutoScalingTerminationRequest](x: Self) {
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
      
      inline def setInstanceMarketOption(value: AutoScalingInstanceMarketOption): Self = StObject.set(x, "InstanceMarketOption", value.asInstanceOf[js.Any])
    }
  }
}
