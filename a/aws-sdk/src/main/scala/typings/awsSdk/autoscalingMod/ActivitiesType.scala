package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitiesType extends js.Object {
  
  /**
    * The scaling activities. Activities are sorted by start time. Activities still in progress are described first.
    */
  var Activities: typings.awsSdk.autoscalingMod.Activities = js.native
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}
object ActivitiesType {
  
  @scala.inline
  def apply(Activities: Activities): ActivitiesType = {
    val __obj = js.Dynamic.literal(Activities = Activities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitiesType]
  }
  
  @scala.inline
  implicit class ActivitiesTypeOps[Self <: ActivitiesType] (val x: Self) extends AnyVal {
    
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
    def setActivitiesVarargs(value: Activity*): Self = this.set("Activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: Activities): Self = this.set("Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
