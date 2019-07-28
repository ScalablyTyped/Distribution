package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteExpressionRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
  /**
    * The name of the Expression to delete.
    */
  var ExpressionName: StandardName
}

object DeleteExpressionRequest {
  @scala.inline
  def apply(DomainName: DomainName, ExpressionName: StandardName): DeleteExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, ExpressionName = ExpressionName)
  
    __obj.asInstanceOf[DeleteExpressionRequest]
  }
}

