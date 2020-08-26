package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedbackFormProps extends js.Object {
  /** Function that will be called to initiate the exit transition. */
  def onClose(): Unit = js.native
  /** Function that will be called immediately after the submit action  */
  def onSubmit(formValues: FormFields): Unit = js.native
}

object FeedbackFormProps {
  @scala.inline
  def apply(onClose: () => Unit, onSubmit: FormFields => Unit): FeedbackFormProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[FeedbackFormProps]
  }
  @scala.inline
  implicit class FeedbackFormPropsOps[Self <: FeedbackFormProps] (val x: Self) extends AnyVal {
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
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSubmit(value: FormFields => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
  }
  
}

