package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotAction extends StatementAction {
  var NotAction: String | js.Array[String]
}

object NotAction {
  @scala.inline
  def apply(NotAction: String | js.Array[String]): NotAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAction]
  }
}

