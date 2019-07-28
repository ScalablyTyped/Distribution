package typings.androiduix.androidNs.supportNs.v4Ns.widgetNs.DrawerLayoutNs

import typings.androiduix.androidNs.supportNs.v4Ns.widgetNs.DrawerLayout
import typings.androiduix.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelper
import typings.androiduix.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.DrawerLayout.ViewDragCallback")
@js.native
class ViewDragCallback protected () extends Callback {
  def this(arg: DrawerLayout, gravity: Double) = this()
  var _DrawerLayout_this: DrawerLayout = js.native
  var mAbsGravity: js.Any = js.native
  var mDragger: js.Any = js.native
  var mPeekRunnable: js.Any = js.native
  /* private */ def closeOtherDrawer(): js.Any = js.native
  /* private */ def peekDrawer(): js.Any = js.native
  def removeCallbacks(): Unit = js.native
  def setDragger(dragger: ViewDragHelper): Unit = js.native
}

