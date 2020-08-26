package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportResponse extends js.Object {
  /**
    * The binary blob response to GetExport, which contains the export.
    */
  var body: js.UndefOr[_Blob] = js.native
  /**
    * The content-disposition header value in the HTTP response.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
    */
  var contentType: js.UndefOr[String] = js.native
}

object ExportResponse {
  @scala.inline
  def apply(): ExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportResponse]
  }
  @scala.inline
  implicit class ExportResponseOps[Self <: ExportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: _Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
  }
  
}

