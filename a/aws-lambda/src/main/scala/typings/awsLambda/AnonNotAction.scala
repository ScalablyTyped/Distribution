package typings.awsLambda

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotAction extends StatementAction {
  var NotAction: String | js.Array[String]
}

object AnonNotAction {
  @scala.inline
  def apply(NotAction: String | js.Array[String]): AnonNotAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotAction]
  }
}

