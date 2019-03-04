package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input/output error with arguments. */
trait InteractiveAugmentedIOException extends InteractiveIOException {
  /**
    * Additional arguments.
    *
    * See {@link com.sun.star.task.InteractionHandler} for a description of well-known arguments.
    */
  var Arguments: activexDashInteropLib.SafeArray[_]
}

object InteractiveAugmentedIOException {
  @scala.inline
  def apply(
    Arguments: activexDashInteropLib.SafeArray[_],
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Code: IOErrorCode,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): InteractiveAugmentedIOException = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Classification = Classification, Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InteractiveAugmentedIOException]
  }
}

