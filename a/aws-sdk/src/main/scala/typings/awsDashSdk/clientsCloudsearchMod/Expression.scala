package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var ExpressionName: StandardName
  var ExpressionValue: typings.awsDashSdk.clientsCloudsearchMod.ExpressionValue
}

object Expression {
  @scala.inline
  def apply(ExpressionName: StandardName, ExpressionValue: ExpressionValue): Expression = {
    val __obj = js.Dynamic.literal(ExpressionName = ExpressionName, ExpressionValue = ExpressionValue)
  
    __obj.asInstanceOf[Expression]
  }
}

