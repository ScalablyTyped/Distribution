package typings.antd.uploadInterfaceMod

import typings.antd.AnonPercent
import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RcCustomRequestOptions extends js.Object {
  var action: String
  var data: js.Object
  var file: File
  var filename: String
  var headers: js.Object
  var withCredentials: Boolean
  def onError(error: Error): Unit
  def onProgress(event: AnonPercent, file: File): Unit
  def onSuccess(response: js.Object, file: File): Unit
}

object RcCustomRequestOptions {
  @scala.inline
  def apply(
    action: String,
    data: js.Object,
    file: File,
    filename: String,
    headers: js.Object,
    onError: Error => Unit,
    onProgress: (AnonPercent, File) => Unit,
    onSuccess: (js.Object, File) => Unit,
    withCredentials: Boolean
  ): RcCustomRequestOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onProgress = js.Any.fromFunction2(onProgress), onSuccess = js.Any.fromFunction2(onSuccess), withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcCustomRequestOptions]
  }
}

