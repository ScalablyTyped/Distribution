package typings
package androiduixLib.androidNs.viewNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.menu.MenuPopupHelper")
@js.native
class MenuPopupHelper protected ()
  extends androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemClickListener
     with androiduixLib.androidNs.viewNs.ViewNs.OnKeyListener
     with androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener
     with androiduixLib.androidNs.widgetNs.PopupWindowNs.OnDismissListener {
  def this(context: androiduixLib.androidNs.contentNs.Context, menu: androiduixLib.androidNs.viewNs.Menu) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, menu: androiduixLib.androidNs.viewNs.Menu, anchorView: androiduixLib.androidNs.viewNs.View) = this()
  var mAdapter: js.Any = js.native
  var mAnchorView: js.Any = js.native
  var mContext: js.Any = js.native
  var mInflater: js.Any = js.native
  var mMeasureParent: js.Any = js.native
  var mMenu: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPopupMaxWidth: js.Any = js.native
  var mTreeObserver: js.Any = js.native
  def dismiss(): scala.Unit = js.native
  def isShowing(): scala.Boolean = js.native
  /* private */ def measureContentWidth(adapter: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onDismiss(): scala.Unit = js.native
  /* CompleteClass */
  override def onGlobalLayout(): js.Any = js.native
  /* CompleteClass */
  override def onItemClick(
    parent: androiduixLib.androidNs.widgetNs.AdapterView[_],
    view: androiduixLib.androidNs.viewNs.View,
    position: scala.Double,
    id: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def onKey(
    v: androiduixLib.androidNs.viewNs.View,
    keyCode: scala.Double,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Unit = js.native
  def setAnchorView(anchor: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def tryShow(): scala.Boolean = js.native
}

@JSGlobal("android.view.menu.MenuPopupHelper")
@js.native
object MenuPopupHelper extends js.Object {
  var ITEM_LAYOUT: java.lang.String = js.native
  var TAG: js.Any = js.native
}

