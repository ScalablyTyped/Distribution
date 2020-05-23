package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input/output error while processing a file.
  *
  * This exception is deprecated. Use {@link InteractiveAugmentedIOException} instead.
  * @deprecated Deprecated
  */
trait InteractiveFileIOException extends InteractiveIOException {
  /** The file url where the i/o error occurred */
  var FileName: String
}

object InteractiveFileIOException {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Code: IOErrorCode,
    Context: XInterface,
    FileName: String,
    Message: String
  ): InteractiveFileIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveFileIOException]
  }
}

