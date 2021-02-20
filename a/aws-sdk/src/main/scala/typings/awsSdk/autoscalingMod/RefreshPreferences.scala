package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshPreferences extends StObject {
  
  /**
    * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value for the health check grace period defined for the group.
    */
  var InstanceWarmup: js.UndefOr[RefreshInstanceWarmup] = js.native
  
  /**
    * The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group (rounded up to the nearest integer). The default is 90. 
    */
  var MinHealthyPercentage: js.UndefOr[IntPercent] = js.native
}
object RefreshPreferences {
  
  @scala.inline
  def apply(): RefreshPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshPreferences]
  }
  
  @scala.inline
  implicit class RefreshPreferencesMutableBuilder[Self <: RefreshPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceWarmup(value: RefreshInstanceWarmup): Self = StObject.set(x, "InstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceWarmupUndefined: Self = StObject.set(x, "InstanceWarmup", js.undefined)
    
    @scala.inline
    def setMinHealthyPercentage(value: IntPercent): Self = StObject.set(x, "MinHealthyPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHealthyPercentageUndefined: Self = StObject.set(x, "MinHealthyPercentage", js.undefined)
  }
}
