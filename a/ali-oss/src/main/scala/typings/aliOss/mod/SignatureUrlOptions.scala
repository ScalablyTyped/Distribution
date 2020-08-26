package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureUrlOptions extends js.Object {
   // the HTTP method, default is 'GET'
  var `Content-Type`: js.UndefOr[String] = js.native
   // set the response headers for download
  var callback: js.UndefOr[ObjectCallback] = js.native
  var expires: js.UndefOr[Double] = js.native
   // after expires seconds, the url will become invalid, default is 1800
  var method: js.UndefOr[HTTPMethods] = js.native
   // set the request content type
  var process: js.UndefOr[String] = js.native
  var response: js.UndefOr[ResponseHeaderType] = js.native
}

object SignatureUrlOptions {
  @scala.inline
  def apply(): SignatureUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureUrlOptions]
  }
  @scala.inline
  implicit class SignatureUrlOptionsOps[Self <: SignatureUrlOptions] (val x: Self) extends AnyVal {
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
    def `setContent-Type`(value: String): Self = this.set("Content-Type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-Type`: Self = this.set("Content-Type", js.undefined)
    @scala.inline
    def setCallback(value: ObjectCallback): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setMethod(value: HTTPMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setProcess(value: String): Self = this.set("process", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    @scala.inline
    def setResponse(value: ResponseHeaderType): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

