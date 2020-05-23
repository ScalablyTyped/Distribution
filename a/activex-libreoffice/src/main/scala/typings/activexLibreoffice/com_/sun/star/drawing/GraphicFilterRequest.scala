package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicFilterRequest]
  }
}

