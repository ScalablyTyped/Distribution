package typings.autoSni.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http extends js.Object {
  var http: js.UndefOr[Double] = js.native
  var https: js.UndefOr[Double] = js.native
}

object Http {
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
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
    def setHttp(value: Double): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    @scala.inline
    def setHttps(value: Double): Self = this.set("https", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
  }
  
}

