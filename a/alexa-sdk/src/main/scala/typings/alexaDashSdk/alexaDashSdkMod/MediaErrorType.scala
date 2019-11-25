package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_UNKNOWN
  - typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_INVALID_REQUEST
  - typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_SERVICE_UNAVAILABLE
  - typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_INTERNAL_SERVER_ERROR
  - typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_INTERNAL_DEVICE_ERROR
*/
trait MediaErrorType extends js.Object

object MediaErrorType {
  @scala.inline
  def MEDIA_ERROR_INTERNAL_DEVICE_ERROR: typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_INTERNAL_DEVICE_ERROR = this.cast("MEDIA_ERROR_INTERNAL_DEVICE_ERROR")
  @scala.inline
  def MEDIA_ERROR_INTERNAL_SERVER_ERROR: typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_INTERNAL_SERVER_ERROR = this.cast("MEDIA_ERROR_INTERNAL_SERVER_ERROR")
  @scala.inline
  def MEDIA_ERROR_INVALID_REQUEST: typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_INVALID_REQUEST = this.cast("MEDIA_ERROR_INVALID_REQUEST")
  @scala.inline
  def MEDIA_ERROR_SERVICE_UNAVAILABLE: typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_SERVICE_UNAVAILABLE = this.cast("MEDIA_ERROR_SERVICE_UNAVAILABLE")
  @scala.inline
  def MEDIA_ERROR_UNKNOWN: typings.alexaDashSdk.alexaDashSdkStrings.MEDIA_ERROR_UNKNOWN = this.cast("MEDIA_ERROR_UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

