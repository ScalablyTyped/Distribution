package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.AnonActionArray
  - typings.awsLambda.AnonNotAction
*/
trait StatementAction extends js.Object

object StatementAction {
  @scala.inline
  def AnonActionArray(Action: String | js.Array[String]): StatementAction = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatementAction]
  }
  @scala.inline
  def AnonNotAction(NotAction: String | js.Array[String]): StatementAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatementAction]
  }
}

