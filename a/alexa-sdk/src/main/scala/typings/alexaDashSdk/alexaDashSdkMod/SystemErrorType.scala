package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.INVALID_RESPONSE
  - typings.alexaDashSdk.alexaDashSdkStrings.DEVICE_COMMUNICATION_ERROR
  - typings.alexaDashSdk.alexaDashSdkStrings.INTERNAL_ERROR
*/
trait SystemErrorType extends js.Object

object SystemErrorType {
  @scala.inline
  def DEVICE_COMMUNICATION_ERROR: typings.alexaDashSdk.alexaDashSdkStrings.DEVICE_COMMUNICATION_ERROR = this.cast("DEVICE_COMMUNICATION_ERROR")
  @scala.inline
  def INTERNAL_ERROR: typings.alexaDashSdk.alexaDashSdkStrings.INTERNAL_ERROR = this.cast("INTERNAL_ERROR")
  @scala.inline
  def INVALID_RESPONSE: typings.alexaDashSdk.alexaDashSdkStrings.INVALID_RESPONSE = this.cast("INVALID_RESPONSE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

