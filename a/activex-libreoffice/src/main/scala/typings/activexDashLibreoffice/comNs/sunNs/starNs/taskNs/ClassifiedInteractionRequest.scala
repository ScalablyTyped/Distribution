package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A classified interaction request. */
trait ClassifiedInteractionRequest extends Exception {
  /** The classification of the request. */
  var Classification: InteractionClassification
}

object ClassifiedInteractionRequest {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String): ClassifiedInteractionRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message)
  
    __obj.asInstanceOf[ClassifiedInteractionRequest]
  }
}

