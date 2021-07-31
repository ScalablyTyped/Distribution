package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledActionsResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Information about the scheduled actions.
    */
  var ScheduledActions: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScheduledActions] = js.undefined
}
object DescribeScheduledActionsResponse {
  
  @scala.inline
  def apply(): DescribeScheduledActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsResponse]
  }
  
  @scala.inline
  implicit class DescribeScheduledActionsResponseMutableBuilder[Self <: DescribeScheduledActionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduledActions(value: ScheduledActions): Self = StObject.set(x, "ScheduledActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionsUndefined: Self = StObject.set(x, "ScheduledActions", js.undefined)
    
    @scala.inline
    def setScheduledActionsVarargs(value: ScheduledAction*): Self = StObject.set(x, "ScheduledActions", js.Array(value :_*))
  }
}
