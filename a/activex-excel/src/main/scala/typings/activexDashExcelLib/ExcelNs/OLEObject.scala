package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.OLEObject")
@js.native
class OLEObject protected () extends js.Object {
  var AltHTML: java.lang.String = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var AutoLoad: scala.Boolean = js.native
  var AutoUpdate: scala.Boolean = js.native
  val Border: activexDashExcelLib.ExcelNs.Border = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  val Creator: XlCreator = js.native
  var Enabled: scala.Boolean = js.native
  var `Excel.OLEObject_typekey`: OLEObject = js.native
  var Height: scala.Double = js.native
  val Index: scala.Double = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var Left: scala.Double = js.native
  var LinkedCell: java.lang.String = js.native
  var ListFillRange: java.lang.String = js.native
  var Locked: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  val OLEType: activexDashExcelLib.activexDashExcelLibNumbers.`0` | activexDashExcelLib.activexDashExcelLibNumbers.`1` = js.native
  val Object: js.Any = js.native
  var OnAction: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Placement: XlPlacement = js.native
  var PrintObject: scala.Boolean = js.native
  var Shadow: scala.Boolean = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var SourceName: java.lang.String = js.native
  var Top: scala.Double = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  val ZOrder: scala.Double = js.native
  val progID: java.lang.String = js.native
  def Activate(): js.Any = js.native
  def BottomRightCell(Address: java.lang.String): Range = js.native
  def BottomRightCell(RowIndex: scala.Double): Range = js.native
  def BottomRightCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def BringToFront(): js.Any = js.native
  def Copy(): js.Any = js.native
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  def Cut(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Duplicate(): js.Any = js.native
  def Select(): js.Any = js.native
  def Select(Replace: scala.Boolean): js.Any = js.native
  def SendToBack(): js.Any = js.native
  def ShapeRange(Index: java.lang.String): Shape = js.native
  def ShapeRange(Index: scala.Double): Shape = js.native
  def TopLeftCell(Address: java.lang.String): Range = js.native
  def TopLeftCell(RowIndex: scala.Double): Range = js.native
  def TopLeftCell(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Update(): js.Any = js.native
  /** @param Verb [Verb=1] */
  def Verb(): js.Any = js.native
  def Verb(Verb: XlOLEVerb): js.Any = js.native
}

