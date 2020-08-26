package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayProxyStructuredResultV2 extends js.Object {
  var body: js.UndefOr[String] = js.native
  var cookies: js.UndefOr[js.Array[String]] = js.native
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.native
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
  var statusCode: js.UndefOr[Double] = js.native
}

object APIGatewayProxyStructuredResultV2 {
  @scala.inline
  def apply(): APIGatewayProxyStructuredResultV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIGatewayProxyStructuredResultV2]
  }
  @scala.inline
  implicit class APIGatewayProxyStructuredResultV2Ops[Self <: APIGatewayProxyStructuredResultV2] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCookiesVarargs(value: String*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[String]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIsBase64Encoded(value: Boolean): Self = this.set("isBase64Encoded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBase64Encoded: Self = this.set("isBase64Encoded", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

