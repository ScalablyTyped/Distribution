package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeMethodResponse extends js.Object {
  /**
    * The body of the HTTP response.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * The headers of the HTTP response.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The execution latency of the test invoke request.
    */
  var latency: js.UndefOr[Long] = js.native
  /**
    * The API Gateway execution log for the test invoke request.
    */
  var log: js.UndefOr[String] = js.native
  /**
    * The headers of the HTTP response as a map from string to list of values.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  /**
    * The HTTP status code.
    */
  var status: js.UndefOr[Integer] = js.native
}

object TestInvokeMethodResponse {
  @scala.inline
  def apply(): TestInvokeMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeMethodResponse]
  }
  @scala.inline
  implicit class TestInvokeMethodResponseOps[Self <: TestInvokeMethodResponse] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: MapOfStringToString): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLatency(value: Long): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMultiValueHeaders(value: MapOfStringToList): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueHeaders: Self = this.set("multiValueHeaders", js.undefined)
    @scala.inline
    def setStatus(value: Integer): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

