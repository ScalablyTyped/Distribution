package typings.awsLambda

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends StatementAction {
  var Action: String | js.Array[String]
}

object Anon0 {
  @scala.inline
  def apply(Action: String | js.Array[String]): Anon0 = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

