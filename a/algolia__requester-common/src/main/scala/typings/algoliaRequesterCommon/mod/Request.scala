package typings.algoliaRequesterCommon.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * The timeout to stablish a connection with the server.
    */
  val connectTimeout: Double = js.native
  /**
    * The data to be transfered to the server.
    */
  val data: js.UndefOr[String] = js.native
  /**
    * The headers of the request.
    */
  val headers: Record[String, String] = js.native
  /**
    * The method of the request. `GET`, etc.
    */
  val method: MethodType = js.native
  /**
    * The timeout to receive the response.
    */
  val responseTimeout: Double = js.native
  /**
    * The complete url of the request, with the protocol.
    */
  val url: String = js.native
}

object Request {
  @scala.inline
  def apply(
    connectTimeout: Double,
    headers: Record[String, String],
    method: MethodType,
    responseTimeout: Double,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(connectTimeout = connectTimeout.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: MethodType): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseTimeout(value: Double): Self = this.set("responseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

