package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.GroupObject")
@js.native
class GroupObject protected () extends js.Object {
  var AddIndent: scala.Boolean = js.native
  val Application: Application = js.native
  var ArrowHeadLength: js.Any = js.native
  var ArrowHeadStyle: js.Any = js.native
  var ArrowHeadWidth: js.Any = js.native
  var AutoSize: scala.Boolean = js.native
  val Border: Border = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  val Creator: XlCreator = js.native
  var Enabled: scala.Boolean = js.native
  var `Excel.GroupObject_typekey`: GroupObject = js.native
  val Font: Font = js.native
  var Height: scala.Double = js.native
  var HorizontalAlignment: js.Any = js.native
  val Index: scala.Double = js.native
  val Interior: Interior = js.native
  var Left: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var OnAction: java.lang.String = js.native
  var Orientation: js.Any = js.native
  val Parent: js.Any = js.native
  var Placement: js.Any = js.native
  var PrintObject: scala.Boolean = js.native
  var ReadingOrder: scala.Double = js.native
  var RoundedCorners: scala.Boolean = js.native
  var Shadow: scala.Boolean = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var Top: scala.Double = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  var VerticalAlignment: js.Any = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  val ZOrder: scala.Double = js.native
  var _Default: scala.Double = js.native
  def BottomRightCell(Address: java.lang.String): Range = js.native
  def BottomRightCell(RowIndex: scala.Double): Range = js.native
  def BottomRightCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def BringToFront(): js.Any = js.native
  def CheckSpelling(): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any): js.Any = js.native
  def CheckSpelling(CustomDictionary: js.Any, IgnoreUppercase: js.Any, AlwaysSuggest: js.Any, SpellLang: js.Any): js.Any = js.native
  def Copy(): js.Any = js.native
  /**
           * @param Appearance [Appearance=2]
           * @param Format [Format=-4147]
           */
  def CopyPicture(): js.Any = js.native
  /**
           * @param Appearance [Appearance=2]
           * @param Format [Format=-4147]
           */
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  /**
           * @param Appearance [Appearance=2]
           * @param Format [Format=-4147]
           */
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  def Cut(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Duplicate(): js.Any = js.native
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  def SendToBack(): js.Any = js.native
  def ShapeRange(Index: java.lang.String): Shape = js.native
  def ShapeRange(Index: scala.Double): Shape = js.native
  def TopLeftCell(Address: java.lang.String): Range = js.native
  def TopLeftCell(RowIndex: scala.Double): Range = js.native
  def TopLeftCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Ungroup(): js.Any = js.native
}

