package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroupNamesType extends StObject {
  
  /**
    * The names of the Auto Scaling groups. By default, you can only specify up to 50 names. You can optionally increase this limit using the MaxRecords parameter. If you omit this parameter, all Auto Scaling groups are described.
    */
  var AutoScalingGroupNames: js.UndefOr[typings.awsSdk.autoscalingMod.AutoScalingGroupNames] = js.native
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}
object AutoScalingGroupNamesType {
  
  @scala.inline
  def apply(): AutoScalingGroupNamesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupNamesType]
  }
  
  @scala.inline
  implicit class AutoScalingGroupNamesTypeMutableBuilder[Self <: AutoScalingGroupNamesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupNames(value: AutoScalingGroupNames): Self = StObject.set(x, "AutoScalingGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNamesUndefined: Self = StObject.set(x, "AutoScalingGroupNames", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupNamesVarargs(value: ResourceName*): Self = StObject.set(x, "AutoScalingGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
