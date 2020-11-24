package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedbackFlagProps extends js.Object {
  
  var isDismissAllowed: js.UndefOr[Boolean] = js.native
  
  var onDismissed: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object FeedbackFlagProps {
  
  @scala.inline
  def apply(): FeedbackFlagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackFlagProps]
  }
  
  @scala.inline
  implicit class FeedbackFlagPropsOps[Self <: FeedbackFlagProps] (val x: Self) extends AnyVal {
    
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
    def setIsDismissAllowed(value: Boolean): Self = this.set("isDismissAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDismissAllowed: Self = this.set("isDismissAllowed", js.undefined)
    
    @scala.inline
    def setOnDismissed(value: /* repeated */ js.Any => _): Self = this.set("onDismissed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismissed: Self = this.set("onDismissed", js.undefined)
  }
}
