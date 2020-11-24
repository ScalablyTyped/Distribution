package typings.androiduix.android.widget.ListView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedViewInfo extends js.Object {
  
  var _ListView_this: typings.androiduix.android.widget.ListView = js.native
  
  var data: js.Any = js.native
  
  var isSelectable: Boolean = js.native
  
  var view: View = js.native
}
object FixedViewInfo {
  
  @scala.inline
  def apply(
    _ListView_this: typings.androiduix.android.widget.ListView,
    data: js.Any,
    isSelectable: Boolean,
    view: View
  ): FixedViewInfo = {
    val __obj = js.Dynamic.literal(_ListView_this = _ListView_this.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedViewInfo]
  }
  
  @scala.inline
  implicit class FixedViewInfoOps[Self <: FixedViewInfo] (val x: Self) extends AnyVal {
    
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
    def set_ListView_this(value: typings.androiduix.android.widget.ListView): Self = this.set("_ListView_this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectable(value: Boolean): Self = this.set("isSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
