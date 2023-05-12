package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachTrafficSourcesType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The unique identifiers of one or more traffic sources. You can specify up to 10 traffic sources.
    */
  var TrafficSources: typings.awsSdk.clientsAutoscalingMod.TrafficSources
}
object AttachTrafficSourcesType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, TrafficSources: TrafficSources): AttachTrafficSourcesType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TrafficSources = TrafficSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachTrafficSourcesType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachTrafficSourcesType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setTrafficSources(value: TrafficSources): Self = StObject.set(x, "TrafficSources", value.asInstanceOf[js.Any])
    
    inline def setTrafficSourcesVarargs(value: TrafficSourceIdentifier*): Self = StObject.set(x, "TrafficSources", js.Array(value*))
  }
}
