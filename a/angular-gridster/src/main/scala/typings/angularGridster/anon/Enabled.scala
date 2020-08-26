package typings.angularGridster.anon

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  // whether the items are resizable
  var enabled: js.UndefOr[Boolean] = js.native
  // location of the resize handles
  // e.g // ['s', 'e', 'n', 'w', 'se', 'ne', 'sw', 'nw']
  var handles: js.UndefOr[js.Array[String]] = js.native
  // optional callback fired when item is resized
  var resize: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.native
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.native
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.native
}

object Enabled {
  @scala.inline
  def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHandlesVarargs(value: String*): Self = this.set("handles", js.Array(value :_*))
    @scala.inline
    def setHandles(value: js.Array[String]): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
    @scala.inline
    def setResize(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit): Self = this.set("resize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit): Self = this.set("start", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit): Self = this.set("stop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

