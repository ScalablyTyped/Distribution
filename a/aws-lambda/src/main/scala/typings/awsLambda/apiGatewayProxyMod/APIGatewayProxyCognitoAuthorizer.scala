package typings.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayProxyCognitoAuthorizer extends js.Object {
  var claims: StringDictionary[String]
}

object APIGatewayProxyCognitoAuthorizer {
  @scala.inline
  def apply(claims: StringDictionary[String]): APIGatewayProxyCognitoAuthorizer = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyCognitoAuthorizer]
  }
}

