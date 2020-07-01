package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.SoftphoneError")
@js.native
class SoftphoneError protected ()
  extends typings.amazonConnectStreams.connect.SoftphoneError {
  def this(errorType: String, errorMessage: String, endPointUrl: String) = this()
  /* CompleteClass */
  override val endPointUrl: String = js.native
  /* CompleteClass */
  override val errorMessage: String = js.native
  /* CompleteClass */
  override val errorType: String = js.native
  /* CompleteClass */
  override def getEndPointUrl(): String = js.native
  /* CompleteClass */
  override def getErrorMessage(): String = js.native
  /* CompleteClass */
  override def getErrorType(): String = js.native
}

