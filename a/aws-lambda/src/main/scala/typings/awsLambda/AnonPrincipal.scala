package typings.awsLambda

import typings.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrincipal extends js.Object {
  var Principal: PrincipalValue
}

object AnonPrincipal {
  @scala.inline
  def apply(Principal: PrincipalValue): AnonPrincipal = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrincipal]
  }
}

