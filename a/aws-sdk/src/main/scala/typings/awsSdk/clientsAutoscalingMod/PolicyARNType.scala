package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyARNType extends StObject {
  
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Alarms] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.undefined
}
object PolicyARNType {
  
  inline def apply(): PolicyARNType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyARNType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyARNType] (val x: Self) extends AnyVal {
    
    inline def setAlarms(value: Alarms): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value*))
    
    inline def setPolicyARN(value: ResourceName): Self = StObject.set(x, "PolicyARN", value.asInstanceOf[js.Any])
    
    inline def setPolicyARNUndefined: Self = StObject.set(x, "PolicyARN", js.undefined)
  }
}
