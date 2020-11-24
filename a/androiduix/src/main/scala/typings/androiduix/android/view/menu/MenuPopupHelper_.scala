package typings.androiduix.android.view.menu

import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnKeyListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.widget.AdapterView
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.PopupWindow.OnDismissListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuPopupHelper_
  extends OnItemClickListener
     with OnKeyListener
     with OnGlobalLayoutListener
     with OnDismissListener {
  
  def dismiss(): Unit = js.native
  
  def isShowing(): Boolean = js.native
  
  var mAdapter: js.Any = js.native
  
  var mAnchorView: js.Any = js.native
  
  var mContext: js.Any = js.native
  
  var mInflater: js.Any = js.native
  
  var mMeasureParent: js.Any = js.native
  
  var mMenu: js.Any = js.native
  
  var mPopup: js.Any = js.native
  
  var mPopupMaxWidth: js.Any = js.native
  
  var mTreeObserver: js.Any = js.native
  
  /* private */ def measureContentWidth(adapter: js.Any): js.Any = js.native
  
  def setAnchorView(anchor: View): Unit = js.native
  
  def show(): Unit = js.native
  
  def tryShow(): Boolean = js.native
}
object MenuPopupHelper_ {
  
  @scala.inline
  def apply(
    dismiss: () => Unit,
    isShowing: () => Boolean,
    mAdapter: js.Any,
    mAnchorView: js.Any,
    mContext: js.Any,
    mInflater: js.Any,
    mMeasureParent: js.Any,
    mMenu: js.Any,
    mPopup: js.Any,
    mPopupMaxWidth: js.Any,
    mTreeObserver: js.Any,
    measureContentWidth: js.Any => js.Any,
    onDismiss: () => Unit,
    onGlobalLayout: () => js.Any,
    onItemClick: (AdapterView[_], View, Double, Double) => Unit,
    onKey: (View, Double, KeyEvent) => Unit,
    setAnchorView: View => Unit,
    show: () => Unit,
    tryShow: () => Boolean
  ): MenuPopupHelper_ = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mAnchorView = mAnchorView.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mMeasureParent = mMeasureParent.asInstanceOf[js.Any], mMenu = mMenu.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPopupMaxWidth = mPopupMaxWidth.asInstanceOf[js.Any], mTreeObserver = mTreeObserver.asInstanceOf[js.Any], measureContentWidth = js.Any.fromFunction1(measureContentWidth), onDismiss = js.Any.fromFunction0(onDismiss), onGlobalLayout = js.Any.fromFunction0(onGlobalLayout), onItemClick = js.Any.fromFunction4(onItemClick), onKey = js.Any.fromFunction3(onKey), setAnchorView = js.Any.fromFunction1(setAnchorView), show = js.Any.fromFunction0(show), tryShow = js.Any.fromFunction0(tryShow))
    __obj.asInstanceOf[MenuPopupHelper_]
  }
  
  @scala.inline
  implicit class MenuPopupHelper_Ops[Self <: MenuPopupHelper_] (val x: Self) extends AnyVal {
    
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
    def setDismiss(value: () => Unit): Self = this.set("dismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsShowing(value: () => Boolean): Self = this.set("isShowing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAdapter(value: js.Any): Self = this.set("mAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAnchorView(value: js.Any): Self = this.set("mAnchorView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMContext(value: js.Any): Self = this.set("mContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInflater(value: js.Any): Self = this.set("mInflater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMeasureParent(value: js.Any): Self = this.set("mMeasureParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMenu(value: js.Any): Self = this.set("mMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPopup(value: js.Any): Self = this.set("mPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPopupMaxWidth(value: js.Any): Self = this.set("mPopupMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTreeObserver(value: js.Any): Self = this.set("mTreeObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureContentWidth(value: js.Any => js.Any): Self = this.set("measureContentWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnchorView(value: View => Unit): Self = this.set("setAnchorView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTryShow(value: () => Boolean): Self = this.set("tryShow", js.Any.fromFunction0(value))
  }
}
