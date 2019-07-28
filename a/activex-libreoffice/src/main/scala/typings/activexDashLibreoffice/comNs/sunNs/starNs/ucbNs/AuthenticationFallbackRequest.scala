package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back some authentication data
  * @since LibreOffice 4.4
  */
trait AuthenticationFallbackRequest extends ClassifiedInteractionRequest {
  /** Instructions to be followed by the user */
  var instructions: String
  /** url to be opened in browser */
  var url: String
}

object AuthenticationFallbackRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    instructions: String,
    url: String
  ): AuthenticationFallbackRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, instructions = instructions, url = url)
  
    __obj.asInstanceOf[AuthenticationFallbackRequest]
  }
}

