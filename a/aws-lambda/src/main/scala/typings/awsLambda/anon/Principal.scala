package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  var Principal: PrincipalValue
}

object Principal {
  @scala.inline
  def apply(Principal: PrincipalValue): Principal = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
}

