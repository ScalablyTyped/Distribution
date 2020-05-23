package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlicerItem extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Caption: String
  val Creator: XlCreator
  @JSName("Excel.SlicerItem_typekey")
  var ExcelDotSlicerItem_typekey: SlicerItem
  val HasData: Boolean
  val Name: String
  val Parent: SlicerCache
  var Selected: Boolean
  val SourceName: js.Any
  val SourceNameStandard: String
  val Value: String
}

object SlicerItem {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: XlCreator,
    ExcelDotSlicerItem_typekey: SlicerItem,
    HasData: Boolean,
    Name: String,
    Parent: SlicerCache,
    Selected: Boolean,
    SourceName: js.Any,
    SourceNameStandard: String,
    Value: String
  ): SlicerItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HasData = HasData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourceNameStandard = SourceNameStandard.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SlicerItem_typekey")(ExcelDotSlicerItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerItem]
  }
}

