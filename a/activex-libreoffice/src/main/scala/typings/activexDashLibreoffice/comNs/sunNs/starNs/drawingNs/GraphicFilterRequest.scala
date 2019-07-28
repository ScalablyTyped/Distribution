package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a general error graphic filter exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 3.0
  */
trait GraphicFilterRequest extends Exception {
  /** specifies the error code. */
  var ErrCode: Double
}

object GraphicFilterRequest {
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): GraphicFilterRequest = {
    val __obj = js.Dynamic.literal(Context = Context, ErrCode = ErrCode, Message = Message)
  
    __obj.asInstanceOf[GraphicFilterRequest]
  }
}

