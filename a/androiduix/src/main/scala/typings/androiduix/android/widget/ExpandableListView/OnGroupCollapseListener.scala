package typings.androiduix.android.widget.ExpandableListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGroupCollapseListener extends js.Object {
  def onGroupCollapse(groupPosition: Double): Unit = js.native
}

object OnGroupCollapseListener {
  @scala.inline
  def apply(onGroupCollapse: Double => Unit): OnGroupCollapseListener = {
    val __obj = js.Dynamic.literal(onGroupCollapse = js.Any.fromFunction1(onGroupCollapse))
    __obj.asInstanceOf[OnGroupCollapseListener]
  }
  @scala.inline
  implicit class OnGroupCollapseListenerOps[Self <: OnGroupCollapseListener] (val x: Self) extends AnyVal {
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
    def setOnGroupCollapse(value: Double => Unit): Self = this.set("onGroupCollapse", js.Any.fromFunction1(value))
  }
  
}

