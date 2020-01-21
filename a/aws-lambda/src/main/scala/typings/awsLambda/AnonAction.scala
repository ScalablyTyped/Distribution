package typings.awsLambda

import typings.awsLambda.mod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends StatementAction {
  var Action: String | js.Array[String]
}

object AnonAction {
  @scala.inline
  def apply(Action: String | js.Array[String]): AnonAction = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

