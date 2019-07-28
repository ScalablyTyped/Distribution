package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineExpressionRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
  var Expression: typings.awsDashSdk.clientsCloudsearchMod.Expression
}

object DefineExpressionRequest {
  @scala.inline
  def apply(DomainName: DomainName, Expression: Expression): DefineExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Expression = Expression)
  
    __obj.asInstanceOf[DefineExpressionRequest]
  }
}

