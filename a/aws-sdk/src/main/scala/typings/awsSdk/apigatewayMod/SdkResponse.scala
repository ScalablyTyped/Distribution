package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SdkResponse extends js.Object {
  /**
    * The binary blob response to GetSdk, which contains the generated SDK.
    */
  var body: js.UndefOr[_Blob] = js.native
  /**
    * The content-disposition header value in the HTTP response.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * The content-type header value in the HTTP response.
    */
  var contentType: js.UndefOr[String] = js.native
}

object SdkResponse {
  @scala.inline
  def apply(): SdkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkResponse]
  }
  @scala.inline
  implicit class SdkResponseOps[Self <: SdkResponse] (val x: Self) extends AnyVal {
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

