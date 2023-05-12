package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroupProviderUpdate extends StObject {
  
  /**
    * The managed scaling settings for the Auto Scaling group capacity provider.
    */
  var managedScaling: js.UndefOr[ManagedScaling] = js.undefined
  
  /**
    * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines whether the Auto Scaling group has managed termination protection.  When using managed termination protection, managed scaling must also be used otherwise managed termination protection doesn't work.  When managed termination protection is on, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance in the Auto Scaling group must have instance protection from scale-in actions on. For more information, see Instance Protection in the Auto Scaling User Guide. When managed termination protection is off, your Amazon EC2 instances aren't protected from termination when the Auto Scaling group scales in.
    */
  var managedTerminationProtection: js.UndefOr[ManagedTerminationProtection] = js.undefined
}
object AutoScalingGroupProviderUpdate {
  
  inline def apply(): AutoScalingGroupProviderUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupProviderUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoScalingGroupProviderUpdate] (val x: Self) extends AnyVal {
    
    inline def setManagedScaling(value: ManagedScaling): Self = StObject.set(x, "managedScaling", value.asInstanceOf[js.Any])
    
    inline def setManagedScalingUndefined: Self = StObject.set(x, "managedScaling", js.undefined)
    
    inline def setManagedTerminationProtection(value: ManagedTerminationProtection): Self = StObject.set(x, "managedTerminationProtection", value.asInstanceOf[js.Any])
    
    inline def setManagedTerminationProtectionUndefined: Self = StObject.set(x, "managedTerminationProtection", js.undefined)
  }
}
