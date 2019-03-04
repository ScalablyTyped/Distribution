package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the base of all UNO exceptions
  *
  * All exceptions defined in UNO idl should derive from this exception.
  */
trait Exception extends js.Object {
  /**
    * should contain a reference to the original, which raised the exception.
    *
    * May be NULL.
    */
  var Context: XInterface
  /**
    * gives a detailed description of the reason, why the exception was thrown.
    *
    * The description should be as detailed as possible.
    */
  var Message: java.lang.String
}

object Exception {
  @scala.inline
  def apply(Context: XInterface, Message: java.lang.String): Exception = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message)
  
    __obj.asInstanceOf[Exception]
  }
}

