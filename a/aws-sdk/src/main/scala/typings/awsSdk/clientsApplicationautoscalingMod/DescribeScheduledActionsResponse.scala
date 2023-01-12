package typings.awsSdk.clientsApplicationautoscalingMod

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
  var ScheduledActions: js.UndefOr[typings.awsSdk.clientsApplicationautoscalingMod.ScheduledActions] = js.undefined
}
object DescribeScheduledActionsResponse {
  
  inline def apply(): DescribeScheduledActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeScheduledActionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledActions(value: ScheduledActions): Self = StObject.set(x, "ScheduledActions", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionsUndefined: Self = StObject.set(x, "ScheduledActions", js.undefined)
    
    inline def setScheduledActionsVarargs(value: ScheduledAction*): Self = StObject.set(x, "ScheduledActions", js.Array(value*))
  }
}
