package typings.androiduix.android.widget.ExpandableListView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGroupClickListener extends js.Object {
  
  def onGroupClick(
    parent: typings.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    id: Double
  ): Boolean = js.native
}
object OnGroupClickListener {
  
  @scala.inline
  def apply(
    onGroupClick: (typings.androiduix.android.widget.ExpandableListView, View, Double, Double) => Boolean
  ): OnGroupClickListener = {
    val __obj = js.Dynamic.literal(onGroupClick = js.Any.fromFunction4(onGroupClick))
    __obj.asInstanceOf[OnGroupClickListener]
  }
  
  @scala.inline
  implicit class OnGroupClickListenerOps[Self <: OnGroupClickListener] (val x: Self) extends AnyVal {
    
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
    def setOnGroupClick(value: (typings.androiduix.android.widget.ExpandableListView, View, Double, Double) => Boolean): Self = this.set("onGroupClick", js.Any.fromFunction4(value))
  }
}
