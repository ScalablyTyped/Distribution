package typings.akuminaCore.isavepagewidgetrequestMod

import typings.akuminaCore.ipagewidgetMod.IPageWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISavePageWidgetRequest extends js.Object {
  
  var pageId: String = js.native
  
  var pageWidgets: js.Array[IPageWidget] = js.native
}
object ISavePageWidgetRequest {
  
  @scala.inline
  def apply(pageId: String, pageWidgets: js.Array[IPageWidget]): ISavePageWidgetRequest = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], pageWidgets = pageWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavePageWidgetRequest]
  }
  
  @scala.inline
  implicit class ISavePageWidgetRequestOps[Self <: ISavePageWidgetRequest] (val x: Self) extends AnyVal {
    
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
    def setPageId(value: String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageWidgetsVarargs(value: IPageWidget*): Self = this.set("pageWidgets", js.Array(value :_*))
    
    @scala.inline
    def setPageWidgets(value: js.Array[IPageWidget]): Self = this.set("pageWidgets", value.asInstanceOf[js.Any])
  }
}
