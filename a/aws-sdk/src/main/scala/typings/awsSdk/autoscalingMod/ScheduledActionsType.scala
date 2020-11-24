package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledActionsType extends js.Object {
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * The scheduled actions.
    */
  var ScheduledUpdateGroupActions: js.UndefOr[typings.awsSdk.autoscalingMod.ScheduledUpdateGroupActions] = js.native
}
object ScheduledActionsType {
  
  @scala.inline
  def apply(): ScheduledActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionsType]
  }
  
  @scala.inline
  implicit class ScheduledActionsTypeOps[Self <: ScheduledActionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScheduledUpdateGroupActionsVarargs(value: ScheduledUpdateGroupAction*): Self = this.set("ScheduledUpdateGroupActions", js.Array(value :_*))
    
    @scala.inline
    def setScheduledUpdateGroupActions(value: ScheduledUpdateGroupActions): Self = this.set("ScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledUpdateGroupActions: Self = this.set("ScheduledUpdateGroupActions", js.undefined)
  }
}
