package typings.agGrid.baseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedFilter[T] extends js.Object {
  var condition1: T = js.native
  var condition2: T = js.native
  var operator: String = js.native
}

object CombinedFilter {
  @scala.inline
  def apply[T](condition1: T, condition2: T, operator: String): CombinedFilter[T] = {
    val __obj = js.Dynamic.literal(condition1 = condition1.asInstanceOf[js.Any], condition2 = condition2.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedFilter[T]]
  }
  @scala.inline
  implicit class CombinedFilterOps[Self <: CombinedFilter[_], T] (val x: Self with CombinedFilter[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCondition1(value: T): Self = this.set("condition1", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition2(value: T): Self = this.set("condition2", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
  }
  
}

