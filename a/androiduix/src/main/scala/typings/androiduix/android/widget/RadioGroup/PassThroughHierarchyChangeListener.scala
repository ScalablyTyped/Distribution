package typings.androiduix.android.widget.RadioGroup

import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.OnHierarchyChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassThroughHierarchyChangeListener extends OnHierarchyChangeListener {
  var _RadioGroup_this: typings.androiduix.android.widget.RadioGroup = js.native
  var mOnHierarchyChangeListener: js.Any = js.native
}

object PassThroughHierarchyChangeListener {
  @scala.inline
  def apply(
    _RadioGroup_this: typings.androiduix.android.widget.RadioGroup,
    mOnHierarchyChangeListener: js.Any,
    onChildViewAdded: (View, View) => js.Any,
    onChildViewRemoved: (View, View) => js.Any
  ): PassThroughHierarchyChangeListener = {
    val __obj = js.Dynamic.literal(_RadioGroup_this = _RadioGroup_this.asInstanceOf[js.Any], mOnHierarchyChangeListener = mOnHierarchyChangeListener.asInstanceOf[js.Any], onChildViewAdded = js.Any.fromFunction2(onChildViewAdded), onChildViewRemoved = js.Any.fromFunction2(onChildViewRemoved))
    __obj.asInstanceOf[PassThroughHierarchyChangeListener]
  }
  @scala.inline
  implicit class PassThroughHierarchyChangeListenerOps[Self <: PassThroughHierarchyChangeListener] (val x: Self) extends AnyVal {
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
    def set_RadioGroup_this(value: typings.androiduix.android.widget.RadioGroup): Self = this.set("_RadioGroup_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOnHierarchyChangeListener(value: js.Any): Self = this.set("mOnHierarchyChangeListener", value.asInstanceOf[js.Any])
  }
  
}

