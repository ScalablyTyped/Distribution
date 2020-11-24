package typings.agGrid.scrollVisibleServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetScrollsVisibleParams extends js.Object {
  
  var bodyHorizontalScrollShowing: Boolean = js.native
  
  var leftVerticalScrollShowing: Boolean = js.native
  
  var rightVerticalScrollShowing: Boolean = js.native
}
object SetScrollsVisibleParams {
  
  @scala.inline
  def apply(
    bodyHorizontalScrollShowing: Boolean,
    leftVerticalScrollShowing: Boolean,
    rightVerticalScrollShowing: Boolean
  ): SetScrollsVisibleParams = {
    val __obj = js.Dynamic.literal(bodyHorizontalScrollShowing = bodyHorizontalScrollShowing.asInstanceOf[js.Any], leftVerticalScrollShowing = leftVerticalScrollShowing.asInstanceOf[js.Any], rightVerticalScrollShowing = rightVerticalScrollShowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScrollsVisibleParams]
  }
  
  @scala.inline
  implicit class SetScrollsVisibleParamsOps[Self <: SetScrollsVisibleParams] (val x: Self) extends AnyVal {
    
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
    def setBodyHorizontalScrollShowing(value: Boolean): Self = this.set("bodyHorizontalScrollShowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftVerticalScrollShowing(value: Boolean): Self = this.set("leftVerticalScrollShowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightVerticalScrollShowing(value: Boolean): Self = this.set("rightVerticalScrollShowing", value.asInstanceOf[js.Any])
  }
}
