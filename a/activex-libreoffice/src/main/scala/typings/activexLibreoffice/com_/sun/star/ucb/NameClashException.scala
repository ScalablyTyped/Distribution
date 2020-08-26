package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An exception used to notify a name clash. */
@js.native
trait NameClashException extends ClassifiedInteractionRequest {
  /** contains the clashing name. */
  var Name: String = js.native
}

object NameClashException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Name: String): NameClashException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameClashException]
  }
  @scala.inline
  implicit class NameClashExceptionOps[Self <: NameClashException] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

