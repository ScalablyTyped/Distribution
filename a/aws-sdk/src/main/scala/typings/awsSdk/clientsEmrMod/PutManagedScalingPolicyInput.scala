package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutManagedScalingPolicyInput extends StObject {
  
  /**
    * Specifies the ID of an Amazon EMR cluster where the managed scaling policy is attached. 
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
  
  /**
    * Specifies the constraints for the managed scaling policy. 
    */
  var ManagedScalingPolicy: typings.awsSdk.clientsEmrMod.ManagedScalingPolicy
}
object PutManagedScalingPolicyInput {
  
  inline def apply(ClusterId: ClusterId, ManagedScalingPolicy: ManagedScalingPolicy): PutManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], ManagedScalingPolicy = ManagedScalingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutManagedScalingPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutManagedScalingPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = StObject.set(x, "ManagedScalingPolicy", value.asInstanceOf[js.Any])
  }
}
