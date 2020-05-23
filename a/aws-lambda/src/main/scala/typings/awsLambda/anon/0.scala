package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends StatementAction {
  var Action: String | js.Array[String]
}

object `0` {
  @scala.inline
  def apply(Action: String | js.Array[String]): `0` = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

