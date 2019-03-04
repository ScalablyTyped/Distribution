package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back some authentication data
  * @since LibreOffice 4.4
  */
trait AuthenticationFallbackRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** Instructions to be followed by the user */
  var instructions: java.lang.String
  /** url to be opened in browser */
  var url: java.lang.String
}

object AuthenticationFallbackRequest {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    instructions: java.lang.String,
    url: java.lang.String
  ): AuthenticationFallbackRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, instructions = instructions, url = url)
  
    __obj.asInstanceOf[AuthenticationFallbackRequest]
  }
}

