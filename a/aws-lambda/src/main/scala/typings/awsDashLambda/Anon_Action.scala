package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends StatementAction {
  var Action: String | js.Array[String]
}

object Anon_Action {
  @scala.inline
  def apply(Action: String | js.Array[String]): Anon_Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

