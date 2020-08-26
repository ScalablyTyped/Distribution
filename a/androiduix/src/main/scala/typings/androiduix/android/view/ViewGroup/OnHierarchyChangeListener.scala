package typings.androiduix.android.view.ViewGroup

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnHierarchyChangeListener extends js.Object {
  def onChildViewAdded(parent: View, child: View): js.Any = js.native
  def onChildViewRemoved(parent: View, child: View): js.Any = js.native
}

object OnHierarchyChangeListener {
  @scala.inline
  def apply(onChildViewAdded: (View, View) => js.Any, onChildViewRemoved: (View, View) => js.Any): OnHierarchyChangeListener = {
    val __obj = js.Dynamic.literal(onChildViewAdded = js.Any.fromFunction2(onChildViewAdded), onChildViewRemoved = js.Any.fromFunction2(onChildViewRemoved))
    __obj.asInstanceOf[OnHierarchyChangeListener]
  }
  @scala.inline
  implicit class OnHierarchyChangeListenerOps[Self <: OnHierarchyChangeListener] (val x: Self) extends AnyVal {
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
    def setOnChildViewAdded(value: (View, View) => js.Any): Self = this.set("onChildViewAdded", js.Any.fromFunction2(value))
    @scala.inline
    def setOnChildViewRemoved(value: (View, View) => js.Any): Self = this.set("onChildViewRemoved", js.Any.fromFunction2(value))
  }
  
}

