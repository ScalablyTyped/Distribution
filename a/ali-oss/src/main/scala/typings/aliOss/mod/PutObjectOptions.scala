package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectOptions extends js.Object {
   // user meta, will send with x-oss-meta- prefix string e.g.: { uid: 123, pid: 110 }
  var callback: js.UndefOr[ObjectCallback] = js.native
  var headers: js.UndefOr[js.Object] = js.native
   // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.native
   // the operation timeout
  var mime: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PutObjectOptions {
  @scala.inline
  def apply(): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectOptions]
  }
  @scala.inline
  implicit class PutObjectOptionsOps[Self <: PutObjectOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: ObjectCallback): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMeta(value: UserMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

