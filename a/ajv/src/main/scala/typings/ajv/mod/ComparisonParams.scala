package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparisonParams extends ErrorParameters {
  var comparison: String = js.native
  var exclusive: Boolean = js.native
  var limit: Double | String = js.native
}

object ComparisonParams {
  @scala.inline
  def apply(comparison: String, exclusive: Boolean, limit: Double | String): ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparisonParams]
  }
  @scala.inline
  implicit class ComparisonParamsOps[Self <: ComparisonParams] (val x: Self) extends AnyVal {
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
    def setComparison(value: String): Self = this.set("comparison", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double | String): Self = this.set("limit", value.asInstanceOf[js.Any])
  }
  
}

