package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIGatewayProxyCognitoAuthorizer extends js.Object {
  
  var claims: StringDictionary[String] = js.native
}
object APIGatewayProxyCognitoAuthorizer {
  
  @scala.inline
  def apply(claims: StringDictionary[String]): APIGatewayProxyCognitoAuthorizer = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyCognitoAuthorizer]
  }
  
  @scala.inline
  implicit class APIGatewayProxyCognitoAuthorizerOps[Self <: APIGatewayProxyCognitoAuthorizer] (val x: Self) extends AnyVal {
    
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
    def setClaims(value: StringDictionary[String]): Self = this.set("claims", value.asInstanceOf[js.Any])
  }
}
