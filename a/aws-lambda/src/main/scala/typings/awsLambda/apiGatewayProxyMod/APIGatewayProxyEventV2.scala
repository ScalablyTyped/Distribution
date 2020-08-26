package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayProxyEventV2 extends js.Object {
  var body: js.UndefOr[String] = js.native
  var cookies: js.UndefOr[js.Array[String]] = js.native
  var headers: StringDictionary[String] = js.native
  var isBase64Encoded: Boolean = js.native
  var pathParameters: js.UndefOr[StringDictionary[String]] = js.native
  var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.native
  var rawPath: String = js.native
  var rawQueryString: String = js.native
  var requestContext: AccountId = js.native
  var routeKey: String = js.native
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.native
  var version: String = js.native
}

object APIGatewayProxyEventV2 {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    isBase64Encoded: Boolean,
    rawPath: String,
    rawQueryString: String,
    requestContext: AccountId,
    routeKey: String,
    version: String
  ): APIGatewayProxyEventV2 = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], rawPath = rawPath.asInstanceOf[js.Any], rawQueryString = rawQueryString.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyEventV2]
  }
  @scala.inline
  implicit class APIGatewayProxyEventV2Ops[Self <: APIGatewayProxyEventV2] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBase64Encoded(value: Boolean): Self = this.set("isBase64Encoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawPath(value: String): Self = this.set("rawPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawQueryString(value: String): Self = this.set("rawQueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestContext(value: AccountId): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteKey(value: String): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
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
    def setPathParameters(value: StringDictionary[String]): Self = this.set("pathParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathParameters: Self = this.set("pathParameters", js.undefined)
    @scala.inline
    def setQueryStringParameters(value: StringDictionary[String]): Self = this.set("queryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStringParameters: Self = this.set("queryStringParameters", js.undefined)
    @scala.inline
    def setStageVariables(value: StringDictionary[String]): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageVariables: Self = this.set("stageVariables", js.undefined)
  }
  
}

