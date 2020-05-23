package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request is used in case a content can't keep files from overwriting
  *
  * It is supported by {@link InteractionHandler} service, and can be used in case a content can not keep files from overwriting and user specifies to do
  * so. Continuations for using with the mentioned service are Abort and Approve.
  * @since OOo 1.1.2
  */
trait UnsupportedOverwriteRequest extends ClassifiedInteractionRequest {
  /** the name of the target that might be overwritten, can be empty. */
  var Name: String
}

object UnsupportedOverwriteRequest {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Name: String): UnsupportedOverwriteRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOverwriteRequest]
  }
}

