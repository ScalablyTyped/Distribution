package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

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
  var FileName: java.lang.String
}

object InteractiveFileIOException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Code: IOErrorCode,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    FileName: java.lang.String,
    Message: java.lang.String
  ): InteractiveFileIOException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Classification")(Classification)
    __obj.updateDynamic("Code")(Code)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("FileName")(FileName)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[InteractiveFileIOException]
  }
}

