package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OLEObject extends StObject {
  
  def Activate(): js.Any = js.native
  
  var AltHTML: String = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var AutoLoad: Boolean = js.native
  
  var AutoUpdate: Boolean = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  def BottomRightCell(Address: String): Range = js.native
  def BottomRightCell(RowIndex: Double): Range = js.native
  def BottomRightCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  
  def BringToFront(): js.Any = js.native
  
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
  
  @JSName("Excel.OLEObject_typekey")
  var ExcelDotOLEObject_typekey: OLEObject = js.native
  
  var Height: Double = js.native
  
  val Index: Double = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  var Left: Double = js.native
  
  var LinkedCell: String = js.native
  
  var ListFillRange: String = js.native
  
  var Locked: Boolean = js.native
  
  var Name: String = js.native
  
  val OLEType: `0` | `1` = js.native
  
  val Object: js.Any = js.native
  
  var OnAction: String = js.native
  
  val Parent: js.Any = js.native
  
  var Placement: XlPlacement = js.native
  
  var PrintObject: Boolean = js.native
  
  def Select(): js.Any = js.native
  def Select(Replace: Boolean): js.Any = js.native
  
  def SendToBack(): js.Any = js.native
  
  var Shadow: Boolean = js.native
  
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  
  var SourceName: String = js.native
  
  var Top: Double = js.native
  
  def TopLeftCell(Address: String): Range = js.native
  def TopLeftCell(RowIndex: Double): Range = js.native
  def TopLeftCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  
  def Update(): js.Any = js.native
  
  /** @param Verb [Verb=1] */
  def Verb(): js.Any = js.native
  def Verb(Verb: XlOLEVerb): js.Any = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  val ZOrder: Double = js.native
  
  val progID: String = js.native
}
