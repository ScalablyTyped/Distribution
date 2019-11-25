package typings.agDashGrid.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedFilter[T] extends js.Object {
  var condition1: T
  var condition2: T
  var operator: String
}

object CombinedFilter {
  @scala.inline
  def apply[T](condition1: T, condition2: T, operator: String): CombinedFilter[T] = {
    val __obj = js.Dynamic.literal(condition1 = condition1.asInstanceOf[js.Any], condition2 = condition2.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CombinedFilter[T]]
  }
}

