package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slicer extends js.Object {
  val ActiveItem: SlicerItem
  val Application: typings.activexExcel.Excel.Application
  var Caption: String
  var ColumnWidth: Double
  val Creator: XlCreator
  var DisableMoveResizeUI: Boolean
  var DisplayHeader: Boolean
  @JSName("Excel.Slicer_typekey")
  var ExcelDotSlicer_typekey: Slicer
  var Height: Double
  var Left: Double
  var Locked: Boolean
  var Name: String
  var NumberOfColumns: Double
  val Parent: js.Any
  var RowHeight: Double
  val Shape: typings.activexExcel.Excel.Shape
  val SlicerCache: typings.activexExcel.Excel.SlicerCache
  val SlicerCacheLevel: typings.activexExcel.Excel.SlicerCacheLevel
  var Style: js.Any
  var Top: Double
  var Width: Double
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
}

object Slicer {
  @scala.inline
  def apply(
    ActiveItem: SlicerItem,
    Application: Application,
    Caption: String,
    ColumnWidth: Double,
    Copy: () => Unit,
    Creator: XlCreator,
    Cut: () => Unit,
    Delete: () => Unit,
    DisableMoveResizeUI: Boolean,
    DisplayHeader: Boolean,
    ExcelDotSlicer_typekey: Slicer,
    Height: Double,
    Left: Double,
    Locked: Boolean,
    Name: String,
    NumberOfColumns: Double,
    Parent: js.Any,
    RowHeight: Double,
    Shape: Shape,
    SlicerCache: SlicerCache,
    SlicerCacheLevel: SlicerCacheLevel,
    Style: js.Any,
    Top: Double,
    Width: Double
  ): Slicer = {
    val __obj = js.Dynamic.literal(ActiveItem = ActiveItem.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], ColumnWidth = ColumnWidth.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), DisableMoveResizeUI = DisableMoveResizeUI.asInstanceOf[js.Any], DisplayHeader = DisplayHeader.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfColumns = NumberOfColumns.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], SlicerCache = SlicerCache.asInstanceOf[js.Any], SlicerCacheLevel = SlicerCacheLevel.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Slicer_typekey")(ExcelDotSlicer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slicer]
  }
}

