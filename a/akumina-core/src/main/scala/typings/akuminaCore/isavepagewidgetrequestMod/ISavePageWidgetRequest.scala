package typings.akuminaCore.isavepagewidgetrequestMod

import typings.akuminaCore.ipagewidgetMod.IPageWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISavePageWidgetRequest extends js.Object {
  var pageId: String
  var pageWidgets: js.Array[IPageWidget]
}

object ISavePageWidgetRequest {
  @scala.inline
  def apply(pageId: String, pageWidgets: js.Array[IPageWidget]): ISavePageWidgetRequest = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], pageWidgets = pageWidgets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISavePageWidgetRequest]
  }
}

