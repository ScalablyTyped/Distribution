package typings.akuminaCore.ipagewidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageWidget extends js.Object {
  var ContainerId: String
  var DisplayOrder: String
  var Grid: String
  var LayoutId: String
  var PageId: String
  var Title: String
  var VirtualWidgetInstanceId: String
  var WidgetDescription: String
  var WidgetIcon: String
  var WidgetInstanceId: String
  var WidgetName: String
  var WidgetOptions: String
  var WidgetProperties: String
  var ZoneId: String
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
}

