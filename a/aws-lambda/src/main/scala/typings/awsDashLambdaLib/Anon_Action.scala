package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action
  extends awsDashLambdaLib.awsDashLambdaMod.StatementAction {
  var Action: java.lang.String | js.Array[java.lang.String]
}

object Anon_Action {
  @scala.inline
  def apply(Action: java.lang.String | js.Array[java.lang.String]): Anon_Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

