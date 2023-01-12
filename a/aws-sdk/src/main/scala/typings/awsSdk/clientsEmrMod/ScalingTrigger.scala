package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingTrigger extends StObject {
  
  /**
    * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger parameters, scaling activity begins.
    */
  var CloudWatchAlarmDefinition: typings.awsSdk.clientsEmrMod.CloudWatchAlarmDefinition
}
object ScalingTrigger {
  
  inline def apply(CloudWatchAlarmDefinition: CloudWatchAlarmDefinition): ScalingTrigger = {
    val __obj = js.Dynamic.literal(CloudWatchAlarmDefinition = CloudWatchAlarmDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingTrigger] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchAlarmDefinition(value: CloudWatchAlarmDefinition): Self = StObject.set(x, "CloudWatchAlarmDefinition", value.asInstanceOf[js.Any])
  }
}
