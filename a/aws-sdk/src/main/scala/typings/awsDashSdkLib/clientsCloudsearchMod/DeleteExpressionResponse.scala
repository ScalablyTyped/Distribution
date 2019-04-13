package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteExpressionResponse extends js.Object {
  /**
    * The status of the expression being deleted.
    */
  var Expression: ExpressionStatus
}

object DeleteExpressionResponse {
  @scala.inline
  def apply(Expression: ExpressionStatus): DeleteExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression)
  
    __obj.asInstanceOf[DeleteExpressionResponse]
  }
}

