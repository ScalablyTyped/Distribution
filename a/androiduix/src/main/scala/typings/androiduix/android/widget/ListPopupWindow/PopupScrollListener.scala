package typings.androiduix.android.widget.ListPopupWindow

import typings.androiduix.android.widget.AbsListView
import typings.androiduix.android.widget.AbsListView.OnScrollListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupScrollListener extends OnScrollListener {
  
  var _ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow = js.native
}
object PopupScrollListener {
  
  @scala.inline
  def apply(
    _ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow,
    onScroll: (AbsListView, Double, Double, Double) => Unit,
    onScrollStateChanged: (AbsListView, Double) => Unit
  ): PopupScrollListener = {
    val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], onScroll = js.Any.fromFunction4(onScroll), onScrollStateChanged = js.Any.fromFunction2(onScrollStateChanged))
    __obj.asInstanceOf[PopupScrollListener]
  }
  
  @scala.inline
  implicit class PopupScrollListenerOps[Self <: PopupScrollListener] (val x: Self) extends AnyVal {
    
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
    def set_ListPopupWindow_this(value: typings.androiduix.android.widget.ListPopupWindow): Self = this.set("_ListPopupWindow_this", value.asInstanceOf[js.Any])
  }
}
