package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingInstancesType extends StObject {
  
  /**
    * The instances.
    */
  var AutoScalingInstances: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AutoScalingInstances] = js.undefined
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object AutoScalingInstancesType {
  
  inline def apply(): AutoScalingInstancesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingInstancesType]
  }
  
  extension [Self <: AutoScalingInstancesType](x: Self) {
    
    inline def setAutoScalingInstances(value: AutoScalingInstances): Self = StObject.set(x, "AutoScalingInstances", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingInstancesUndefined: Self = StObject.set(x, "AutoScalingInstances", js.undefined)
    
    inline def setAutoScalingInstancesVarargs(value: AutoScalingInstanceDetails*): Self = StObject.set(x, "AutoScalingInstances", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
