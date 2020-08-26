package typings.akuminaCore.ipagewidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageWidget extends js.Object {
  var ContainerId: String = js.native
  var DisplayOrder: String = js.native
  var Grid: String = js.native
  var LayoutId: String = js.native
  var PageId: String = js.native
  var Title: String = js.native
  var VirtualWidgetInstanceId: String = js.native
  var WidgetDescription: String = js.native
  var WidgetIcon: String = js.native
  var WidgetInstanceId: String = js.native
  var WidgetName: String = js.native
  var WidgetOptions: String = js.native
  var WidgetProperties: String = js.native
  var ZoneId: String = js.native
}

object IPageWidget {
  @scala.inline
  def apply(
    ContainerId: String,
    DisplayOrder: String,
    Grid: String,
    LayoutId: String,
    PageId: String,
    Title: String,
    VirtualWidgetInstanceId: String,
    WidgetDescription: String,
    WidgetIcon: String,
    WidgetInstanceId: String,
    WidgetName: String,
    WidgetOptions: String,
    WidgetProperties: String,
    ZoneId: String
  ): IPageWidget = {
    val __obj = js.Dynamic.literal(ContainerId = ContainerId.asInstanceOf[js.Any], DisplayOrder = DisplayOrder.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any], LayoutId = LayoutId.asInstanceOf[js.Any], PageId = PageId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], VirtualWidgetInstanceId = VirtualWidgetInstanceId.asInstanceOf[js.Any], WidgetDescription = WidgetDescription.asInstanceOf[js.Any], WidgetIcon = WidgetIcon.asInstanceOf[js.Any], WidgetInstanceId = WidgetInstanceId.asInstanceOf[js.Any], WidgetName = WidgetName.asInstanceOf[js.Any], WidgetOptions = WidgetOptions.asInstanceOf[js.Any], WidgetProperties = WidgetProperties.asInstanceOf[js.Any], ZoneId = ZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageWidget]
  }
  @scala.inline
  implicit class IPageWidgetOps[Self <: IPageWidget] (val x: Self) extends AnyVal {
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
    def setContainerId(value: String): Self = this.set("ContainerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayOrder(value: String): Self = this.set("DisplayOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrid(value: String): Self = this.set("Grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutId(value: String): Self = this.set("LayoutId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageId(value: String): Self = this.set("PageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualWidgetInstanceId(value: String): Self = this.set("VirtualWidgetInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgetDescription(value: String): Self = this.set("WidgetDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgetIcon(value: String): Self = this.set("WidgetIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgetInstanceId(value: String): Self = this.set("WidgetInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgetName(value: String): Self = this.set("WidgetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgetOptions(value: String): Self = this.set("WidgetOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgetProperties(value: String): Self = this.set("WidgetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoneId(value: String): Self = this.set("ZoneId", value.asInstanceOf[js.Any])
  }
  
}

