package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.ucb.XContent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an error specifying the lack of a document name
  *
  * Usually thrown if someone tries to save a document which hasn't a name yet.
  * @since OOo 2.0
  */
trait DocumentSaveRequest extends ClassifiedInteractionRequest {
  /**
    * specifies the content where the document should save inside. Somebody handling the request could, e.g., use the content as root content to display the
    * hierarchy of the sub contents.
    */
  var Content: XContent
  /** The default name of the document, may be empty. */
  var Name: String
}

object DocumentSaveRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Content: XContent,
    Context: XInterface,
    Message: String,
    Name: String
  ): DocumentSaveRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSaveRequest]
  }
}

