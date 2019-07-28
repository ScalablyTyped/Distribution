package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An exception used to notify a name clash. */
trait NameClashException extends ClassifiedInteractionRequest {
  /** contains the clashing name. */
  var Name: String
}

object NameClashException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Name: String): NameClashException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Name = Name)
  
    __obj.asInstanceOf[NameClashException]
  }
}

