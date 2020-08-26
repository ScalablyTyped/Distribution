package typings.androiduix.android.widget.ExpandableListView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnChildClickListener extends js.Object {
  def onChildClick(
    parent: typings.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    childPosition: Double,
    id: Double
  ): Boolean = js.native
}

object OnChildClickListener {
  @scala.inline
  def apply(
    onChildClick: (typings.androiduix.android.widget.ExpandableListView, View, Double, Double, Double) => Boolean
  ): OnChildClickListener = {
    val __obj = js.Dynamic.literal(onChildClick = js.Any.fromFunction5(onChildClick))
    __obj.asInstanceOf[OnChildClickListener]
  }
  @scala.inline
  implicit class OnChildClickListenerOps[Self <: OnChildClickListener] (val x: Self) extends AnyVal {
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
    def setOnChildClick(
      value: (typings.androiduix.android.widget.ExpandableListView, View, Double, Double, Double) => Boolean
    ): Self = this.set("onChildClick", js.Any.fromFunction5(value))
  }
  
}

