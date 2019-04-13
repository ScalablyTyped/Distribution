package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExpressionsResponse extends js.Object {
  /**
    * The expressions configured for the domain.
    */
  var Expressions: ExpressionStatusList
}

object DescribeExpressionsResponse {
  @scala.inline
  def apply(Expressions: ExpressionStatusList): DescribeExpressionsResponse = {
    val __obj = js.Dynamic.literal(Expressions = Expressions)
  
    __obj.asInstanceOf[DescribeExpressionsResponse]
  }
}

