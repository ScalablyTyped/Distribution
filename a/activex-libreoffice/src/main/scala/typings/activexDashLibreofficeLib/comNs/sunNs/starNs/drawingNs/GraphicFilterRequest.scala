package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a general error graphic filter exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 3.0
  */
trait GraphicFilterRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** specifies the error code. */
  var ErrCode: scala.Double
}

object GraphicFilterRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrCode: scala.Double,
    Message: java.lang.String
  ): GraphicFilterRequest = {
    val __obj = js.Dynamic.literal(Context = Context, ErrCode = ErrCode, Message = Message)
  
    __obj.asInstanceOf[GraphicFilterRequest]
  }
}

