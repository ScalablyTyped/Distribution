package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyARNType extends StObject {
  
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.autoscalingMod.Alarms] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
}
object PolicyARNType {
  
  @scala.inline
  def apply(): PolicyARNType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyARNType]
  }
  
  @scala.inline
  implicit class PolicyARNTypeMutableBuilder[Self <: PolicyARNType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value :_*))
    
    @scala.inline
    def setPolicyARN(value: ResourceName): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyARNUndefined: Self = StObject.set(x, "PolicyARN", js.undefined)
  }
}
