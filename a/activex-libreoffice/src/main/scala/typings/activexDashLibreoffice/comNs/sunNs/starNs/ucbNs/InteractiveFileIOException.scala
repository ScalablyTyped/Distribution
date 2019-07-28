package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Classification = Classification, Code = Code, Context = Context, FileName = FileName, Message = Message)
  
    __obj.asInstanceOf[InteractiveFileIOException]
  }
}

