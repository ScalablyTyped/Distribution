package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledActionsType extends StObject {
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The scheduled actions.
    */
  var ScheduledUpdateGroupActions: js.UndefOr[typings.awsSdk.autoscalingMod.ScheduledUpdateGroupActions] = js.undefined
}
object ScheduledActionsType {
  
  inline def apply(): ScheduledActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionsType]
  }
  
  extension [Self <: ScheduledActionsType](x: Self) {
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledUpdateGroupActions(value: ScheduledUpdateGroupActions): Self = StObject.set(x, "ScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
    
    inline def setScheduledUpdateGroupActionsUndefined: Self = StObject.set(x, "ScheduledUpdateGroupActions", js.undefined)
    
    inline def setScheduledUpdateGroupActionsVarargs(value: ScheduledUpdateGroupAction*): Self = StObject.set(x, "ScheduledUpdateGroupActions", js.Array(value :_*))
  }
}
