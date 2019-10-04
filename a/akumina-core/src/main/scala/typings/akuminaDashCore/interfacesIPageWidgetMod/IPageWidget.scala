package typings.akuminaDashCore.interfacesIPageWidgetMod

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
    val __obj = js.Dynamic.literal(ContainerId = ContainerId, DisplayOrder = DisplayOrder, Grid = Grid, LayoutId = LayoutId, PageId = PageId, Title = Title, VirtualWidgetInstanceId = VirtualWidgetInstanceId, WidgetDescription = WidgetDescription, WidgetIcon = WidgetIcon, WidgetInstanceId = WidgetInstanceId, WidgetName = WidgetName, WidgetOptions = WidgetOptions, WidgetProperties = WidgetProperties, ZoneId = ZoneId)
  
    __obj.asInstanceOf[IPageWidget]
  }
}

