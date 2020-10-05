package typings.antd.uploadInterfaceMod

import typings.antd.anon.Percent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RcCustomRequestOptions extends js.Object {
  var action: String = js.native
  var data: js.Object = js.native
  var file: RcFile = js.native
  var filename: String = js.native
  var headers: js.Object = js.native
  var withCredentials: Boolean = js.native
  def onError(error: Error): Unit = js.native
  def onProgress(event: Percent, file: RcFile): Unit = js.native
  def onSuccess(response: js.Object, file: RcFile): Unit = js.native
}

object RcCustomRequestOptions {
  @scala.inline
  def apply(
    action: String,
    data: js.Object,
    file: RcFile,
    filename: String,
    headers: js.Object,
    onError: Error => Unit,
    onProgress: (Percent, RcFile) => Unit,
    onSuccess: (js.Object, RcFile) => Unit,
    withCredentials: Boolean
  ): RcCustomRequestOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onProgress = js.Any.fromFunction2(onProgress), onSuccess = js.Any.fromFunction2(onSuccess), withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcCustomRequestOptions]
  }
  @scala.inline
  implicit class RcCustomRequestOptionsOps[Self <: RcCustomRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: RcFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnProgress(value: (Percent, RcFile) => Unit): Self = this.set("onProgress", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSuccess(value: (js.Object, RcFile) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
  
}

