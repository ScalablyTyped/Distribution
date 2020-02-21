package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeStatementPrincipal extends js.Object {
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
  var Principal: js.UndefOr[PrincipalValue] = js.undefined
}

object MaybeStatementPrincipal {
  @scala.inline
  def apply(NotPrincipal: PrincipalValue = null, Principal: PrincipalValue = null): MaybeStatementPrincipal = {
    val __obj = js.Dynamic.literal()
    if (NotPrincipal != null) __obj.updateDynamic("NotPrincipal")(NotPrincipal.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeStatementPrincipal]
  }
}

