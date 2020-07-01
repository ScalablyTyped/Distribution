package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftphoneError extends js.Object {
  val endPointUrl: String
  val errorMessage: String
  val errorType: String
  def getEndPointUrl(): String
  def getErrorMessage(): String
  def getErrorType(): String
}

object SoftphoneError {
  @scala.inline
  def apply(
    endPointUrl: String,
    errorMessage: String,
    errorType: String,
    getEndPointUrl: () => String,
    getErrorMessage: () => String,
    getErrorType: () => String
  ): SoftphoneError = {
    val __obj = js.Dynamic.literal(endPointUrl = endPointUrl.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], getEndPointUrl = js.Any.fromFunction0(getEndPointUrl), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getErrorType = js.Any.fromFunction0(getErrorType))
    __obj.asInstanceOf[SoftphoneError]
  }
}

