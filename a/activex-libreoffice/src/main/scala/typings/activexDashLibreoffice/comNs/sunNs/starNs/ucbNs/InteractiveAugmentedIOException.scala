package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
  var Arguments: SafeArray[_]
}

object InteractiveAugmentedIOException {
  @scala.inline
  def apply(
    Arguments: SafeArray[_],
    Classification: InteractionClassification,
    Code: IOErrorCode,
    Context: XInterface,
    Message: String
  ): InteractiveAugmentedIOException = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Classification = Classification, Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InteractiveAugmentedIOException]
  }
}

