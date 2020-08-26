package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avg extends js.Object {
  /**
    * The average facet value in the result set.
    */
  var avg: Double = js.native
  /**
    * The maximum value in the result set.
    */
  var max: Double = js.native
  /**
    * The minimum value in the result set.
    */
  var min: Double = js.native
  /**
    * The sum of all values in the result set.
    */
  var sum: Double = js.native
}

object Avg {
  @scala.inline
  def apply(avg: Double, max: Double, min: Double, sum: Double): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
  @scala.inline
  implicit class AvgOps[Self <: Avg] (val x: Self) extends AnyVal {
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
    def setAvg(value: Double): Self = this.set("avg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
  }
  
}

