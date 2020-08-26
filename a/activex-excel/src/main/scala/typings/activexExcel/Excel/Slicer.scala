package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slicer extends js.Object {
  val ActiveItem: SlicerItem = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  var Caption: String = js.native
  var ColumnWidth: Double = js.native
  val Creator: XlCreator = js.native
  var DisableMoveResizeUI: Boolean = js.native
  var DisplayHeader: Boolean = js.native
  @JSName("Excel.Slicer_typekey")
  var ExcelDotSlicer_typekey: Slicer = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  var Locked: Boolean = js.native
  var Name: String = js.native
  var NumberOfColumns: Double = js.native
  val Parent: js.Any = js.native
  var RowHeight: Double = js.native
  val Shape: typings.activexExcel.Excel.Shape = js.native
  val SlicerCache: typings.activexExcel.Excel.SlicerCache = js.native
  val SlicerCacheLevel: typings.activexExcel.Excel.SlicerCacheLevel = js.native
  var Style: js.Any = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class SlicerOps[Self <: Slicer] (val x: Self) extends AnyVal {
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
    def setActiveItem(value: SlicerItem): Self = this.set("ActiveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("ColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableMoveResizeUI(value: Boolean): Self = this.set("DisableMoveResizeUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayHeader(value: Boolean): Self = this.set("DisplayHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotSlicer_typekey(value: Slicer): Self = this.set("Excel.Slicer_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfColumns(value: Double): Self = this.set("NumberOfColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("RowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Shape): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlicerCache(value: SlicerCache): Self = this.set("SlicerCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlicerCacheLevel(value: SlicerCacheLevel): Self = this.set("SlicerCacheLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

