package typings.androiduix.android.view

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.View.OnKeyListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.view.menu.MenuPopupHelper
import typings.androiduix.android.widget.AdapterView
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.BaseAdapter
import typings.androiduix.android.widget.PopupWindow.OnDismissListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.menu")
@js.native
object menu extends js.Object {
  @js.native
  class MenuPopupHelper protected ()
    extends OnItemClickListener
       with OnKeyListener
       with OnGlobalLayoutListener
       with OnDismissListener {
    def this(context: Context, menu: Menu) = this()
    def this(context: Context, menu: Menu, anchorView: View) = this()
    var mAdapter: js.Any = js.native
    var mAnchorView: js.Any = js.native
    var mContext: js.Any = js.native
    var mInflater: js.Any = js.native
    var mMeasureParent: js.Any = js.native
    var mMenu: js.Any = js.native
    var mPopup: js.Any = js.native
    var mPopupMaxWidth: js.Any = js.native
    var mTreeObserver: js.Any = js.native
    def dismiss(): Unit = js.native
    def isShowing(): Boolean = js.native
    /* private */ def measureContentWidth(adapter: js.Any): js.Any = js.native
    /* CompleteClass */
    override def onDismiss(): Unit = js.native
    /* CompleteClass */
    override def onGlobalLayout(): js.Any = js.native
    /* CompleteClass */
    override def onItemClick(parent: AdapterView[_], view: View, position: Double, id: Double): Unit = js.native
    /* CompleteClass */
    override def onKey(v: View, keyCode: Double, event: KeyEvent): Unit = js.native
    def setAnchorView(anchor: View): Unit = js.native
    def show(): Unit = js.native
    def tryShow(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MenuPopupHelper extends js.Object {
    @js.native
    class MenuAdapter protected () extends BaseAdapter {
      def this(menu: Menu, arg: MenuPopupHelper) = this()
      var _MenuPopupHelper_this: MenuPopupHelper = js.native
      var mAdapterMenu: js.Any = js.native
    }
    
    var ITEM_LAYOUT: String = js.native
    var TAG: js.Any = js.native
  }
  
}

