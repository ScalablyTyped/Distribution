package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupObject extends js.Object {
  
  var AddIndent: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var ArrowHeadLength: js.Any = js.native
  
  var ArrowHeadStyle: js.Any = js.native
  
  var ArrowHeadWidth: js.Any = js.native
  
  var AutoSize: Boolean = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  def BottomRightCell(Address: String): Range = js.native
  def BottomRightCell(RowIndex: Double): Range = js.native
  def BottomRightCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  
  def BringToFront(): js.Any = js.native
  
  def CheckSpelling(): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.Any
  ): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.Any,
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.UndefOr[scala.Nothing], IgnoreUppercase: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.Any,
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.UndefOr[scala.Nothing], IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.UndefOr[scala.Nothing],
    IgnoreUppercase: js.Any,
    AlwaysSuggest: js.Any,
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.Any,
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.UndefOr[scala.Nothing], AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.Any,
    IgnoreUppercase: js.UndefOr[scala.Nothing],
    AlwaysSuggest: js.Any,
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any): js.Any = js.native
  def CheckSpelling(
    CustomDictionary: js.Any,
    IgnoreUppercase: js.Any,
    AlwaysSuggest: js.UndefOr[scala.Nothing],
    SpellLang: js.Any
  ): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any, SpellLang: js.Any): js.Any = js.native
  
  def Copy(): js.Any = js.native
  
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: XlCopyPictureFormat): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  def Cut(): js.Any = js.native
  
  def Delete(): js.Any = js.native
  
  def Duplicate(): js.Any = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Excel.GroupObject_typekey")
  var ExcelDotGroupObject_typekey: GroupObject = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  var Height: Double = js.native
  
  var HorizontalAlignment: js.Any = js.native
  
  val Index: Double = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  var Left: Double = js.native
  
  var Locked: Boolean = js.native
  
  var Name: String = js.native
  
  var OnAction: String = js.native
  
  var Orientation: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  var Placement: js.Any = js.native
  
  var PrintObject: Boolean = js.native
  
  var ReadingOrder: Double = js.native
  
  var RoundedCorners: Boolean = js.native
  
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  
  def SendToBack(): js.Any = js.native
  
  var Shadow: Boolean = js.native
  
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  
  var Top: Double = js.native
  
  def TopLeftCell(Address: String): Range = js.native
  def TopLeftCell(RowIndex: Double): Range = js.native
  def TopLeftCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  
  def Ungroup(): js.Any = js.native
  
  var VerticalAlignment: js.Any = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  val ZOrder: Double = js.native
  
  var _Default: Double = js.native
}
