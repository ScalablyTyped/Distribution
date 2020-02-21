package typings.awsLambda

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionArray extends StatementAction {
  var Action: String | js.Array[String]
}

object AnonActionArray {
  @scala.inline
  def apply(Action: String | js.Array[String]): AnonActionArray = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionArray]
  }
}

