package typings.antd.scrollNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollNumberState extends js.Object {
  var animateStarted: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[String | Double | Null] = js.native
}

object ScrollNumberState {
  @scala.inline
  def apply(): ScrollNumberState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollNumberState]
  }
  @scala.inline
  implicit class ScrollNumberStateOps[Self <: ScrollNumberState] (val x: Self) extends AnyVal {
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
    def setAnimateStarted(value: Boolean): Self = this.set("animateStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateStarted: Self = this.set("animateStarted", js.undefined)
    @scala.inline
    def setCount(value: String | Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountNull: Self = this.set("count", null)
  }
  
}

