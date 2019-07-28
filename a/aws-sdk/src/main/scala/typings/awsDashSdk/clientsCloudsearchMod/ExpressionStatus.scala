package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionStatus extends js.Object {
  /**
    * The expression that is evaluated for sorting while processing a search request.
    */
  var Options: Expression
  var Status: OptionStatus
}

object ExpressionStatus {
  @scala.inline
  def apply(Options: Expression, Status: OptionStatus): ExpressionStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[ExpressionStatus]
  }
}

