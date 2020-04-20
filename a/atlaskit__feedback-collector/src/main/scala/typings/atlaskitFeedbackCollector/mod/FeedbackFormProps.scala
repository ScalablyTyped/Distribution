package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackFormProps extends js.Object {
  /** Function that will be called to initiate the exit transition. */
  def onClose(): Unit
  /** Function that will be called immediately after the submit action  */
  def onSubmit(formValues: FormFields): Unit
}

object FeedbackFormProps {
  @scala.inline
  def apply(onClose: () => Unit, onSubmit: FormFields => Unit): FeedbackFormProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[FeedbackFormProps]
  }
}

