package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroupsType extends StObject {
  
  /**
    * The groups.
    */
  var AutoScalingGroups: typings.awsSdk.clientsAutoscalingMod.AutoScalingGroups
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object AutoScalingGroupsType {
  
  inline def apply(AutoScalingGroups: AutoScalingGroups): AutoScalingGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroups = AutoScalingGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroupsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoScalingGroupsType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroups(value: AutoScalingGroups): Self = StObject.set(x, "AutoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "AutoScalingGroups", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
