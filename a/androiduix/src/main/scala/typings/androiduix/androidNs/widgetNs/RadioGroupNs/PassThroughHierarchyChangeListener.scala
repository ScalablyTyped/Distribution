package typings.androiduix.androidNs.widgetNs.RadioGroupNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroupNs.OnHierarchyChangeListener
import typings.androiduix.androidNs.widgetNs.RadioGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RadioGroup.PassThroughHierarchyChangeListener")
@js.native
class PassThroughHierarchyChangeListener protected () extends OnHierarchyChangeListener {
  def this(arg: RadioGroup) = this()
  var _RadioGroup_this: RadioGroup = js.native
  var mOnHierarchyChangeListener: js.Any = js.native
  /* CompleteClass */
  override def onChildViewAdded(parent: View, child: View): js.Any = js.native
  /* CompleteClass */
  override def onChildViewRemoved(parent: View, child: View): js.Any = js.native
}

