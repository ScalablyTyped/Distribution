package typings.awsLambda

import typings.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotPrincipal extends js.Object {
  var NotPrincipal: PrincipalValue
}

object AnonNotPrincipal {
  @scala.inline
  def apply(NotPrincipal: PrincipalValue): AnonNotPrincipal = {
    val __obj = js.Dynamic.literal(NotPrincipal = NotPrincipal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotPrincipal]
  }
}

