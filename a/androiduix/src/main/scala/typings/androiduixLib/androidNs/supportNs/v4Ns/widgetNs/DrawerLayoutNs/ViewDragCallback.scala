package typings
package androiduixLib.androidNs.supportNs.v4Ns.widgetNs.DrawerLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.DrawerLayout.ViewDragCallback")
@js.native
class ViewDragCallback protected ()
  extends androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs.Callback {
  def this(arg: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.DrawerLayout, gravity: scala.Double) = this()
  var _DrawerLayout_this: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.DrawerLayout = js.native
  var mAbsGravity: js.Any = js.native
  var mDragger: js.Any = js.native
  var mPeekRunnable: js.Any = js.native
  /* private */ def closeOtherDrawer(): js.Any = js.native
  /* private */ def peekDrawer(): js.Any = js.native
  def removeCallbacks(): scala.Unit = js.native
  def setDragger(dragger: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelper): scala.Unit = js.native
}

