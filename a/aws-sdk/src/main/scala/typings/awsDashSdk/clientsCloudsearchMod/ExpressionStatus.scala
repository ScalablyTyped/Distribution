package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatus extends js.Object {
  /**
    * The expression that is evaluated for sorting while processing a search request.
    */
  var Options: Expression = js.native
  var Status: OptionStatus = js.native
}

object ExpressionStatus {
  @scala.inline
  def apply(Options: Expression, Status: OptionStatus): ExpressionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpressionStatus]
  }
}

