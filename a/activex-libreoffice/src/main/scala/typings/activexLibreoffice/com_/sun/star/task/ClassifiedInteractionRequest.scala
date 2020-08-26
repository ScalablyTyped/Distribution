package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A classified interaction request. */
@js.native
trait ClassifiedInteractionRequest extends Exception {
  /** The classification of the request. */
  var Classification: InteractionClassification = js.native
}

object ClassifiedInteractionRequest {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String): ClassifiedInteractionRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedInteractionRequest]
  }
  @scala.inline
  implicit class ClassifiedInteractionRequestOps[Self <: ClassifiedInteractionRequest] (val x: Self) extends AnyVal {
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
    def setClassification(value: InteractionClassification): Self = this.set("Classification", value.asInstanceOf[js.Any])
  }
  
}

