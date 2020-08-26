package typings.airbnbPropTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gt extends js.Object {
  var gt: js.UndefOr[Double] = js.native
  var gte: js.UndefOr[Double] = js.native
  var lt: js.UndefOr[Double] = js.native
  var lte: js.UndefOr[Double] = js.native
}

object Gt {
  @scala.inline
  def apply(): Gt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gt]
  }
  @scala.inline
  implicit class GtOps[Self <: Gt] (val x: Self) extends AnyVal {
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
    def setGt(value: Double): Self = this.set("gt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    @scala.inline
    def setGte(value: Double): Self = this.set("gte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGte: Self = this.set("gte", js.undefined)
    @scala.inline
    def setLt(value: Double): Self = this.set("lt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    @scala.inline
    def setLte(value: Double): Self = this.set("lte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLte: Self = this.set("lte", js.undefined)
  }
  
}

