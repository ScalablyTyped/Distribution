package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIGatewayProxyResult extends js.Object {
  
  var body: String = js.native
  
  var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.native
  
  var isBase64Encoded: js.UndefOr[Boolean] = js.native
  
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.native
  
  var statusCode: Double = js.native
}
object APIGatewayProxyResult {
  
  @scala.inline
  def apply(body: String, statusCode: Double): APIGatewayProxyResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyResult]
  }
  
  @scala.inline
  implicit class APIGatewayProxyResultOps[Self <: APIGatewayProxyResult] (val x: Self) extends AnyVal {
    
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIsBase64Encoded(value: Boolean): Self = this.set("isBase64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBase64Encoded: Self = this.set("isBase64Encoded", js.undefined)
    
    @scala.inline
    def setMultiValueHeaders(value: StringDictionary[js.Array[Boolean | Double | String]]): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueHeaders: Self = this.set("multiValueHeaders", js.undefined)
  }
}
