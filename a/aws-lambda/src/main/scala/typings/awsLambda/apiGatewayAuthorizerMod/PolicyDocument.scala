package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[String] = js.undefined
  var Statement: js.Array[typings.awsLambda.apiGatewayAuthorizerMod.Statement]
  var Version: String
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: js.Array[Statement], Version: String, Id: String = null): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
}

