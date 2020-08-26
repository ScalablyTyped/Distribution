package typings.animejs.mod

import typings.animejs.animejsStrings.center
import typings.animejs.animejsStrings.first
import typings.animejs.animejsStrings.last
import typings.animejs.animejsStrings.normal
import typings.animejs.animejsStrings.reverse
import typings.animejs.animejsStrings.x
import typings.animejs.animejsStrings.y
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaggerOptions extends js.Object {
  var axis: js.UndefOr[x | y] = js.native
  var direction: js.UndefOr[normal | reverse] = js.native
  var easing: js.UndefOr[CustomEasingFunction | String | EasingOptions] = js.native
  var from: js.UndefOr[first | last | center | Double] = js.native
  var grid: js.UndefOr[js.Array[Double]] = js.native
  var start: js.UndefOr[Double | String] = js.native
}

object StaggerOptions {
  @scala.inline
  def apply(): StaggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaggerOptions]
  }
  @scala.inline
  implicit class StaggerOptionsOps[Self <: StaggerOptions] (val x: Self) extends AnyVal {
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
    def setAxis(value: typings.animejs.animejsStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setDirection(value: normal | reverse): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEasingFunction3(
      value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
    ): Self = this.set("easing", js.Any.fromFunction3(value))
    @scala.inline
    def setEasing(value: CustomEasingFunction | String | EasingOptions): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFrom(value: first | last | center | Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setGridVarargs(value: Double*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: js.Array[Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setStart(value: Double | String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

