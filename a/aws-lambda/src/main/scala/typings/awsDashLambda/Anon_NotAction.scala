package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotAction extends StatementAction {
  var NotAction: String | js.Array[String]
}

object Anon_NotAction {
  @scala.inline
  def apply(NotAction: String | js.Array[String]): Anon_NotAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NotAction]
  }
}

