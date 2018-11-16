package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: java.lang.String = js.native
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var EmailSubject: java.lang.String = js.native
  var `Excel.Hyperlink_typekey`: Hyperlink = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  var ScreenTip: java.lang.String = js.native
  val Shape: Shape = js.native
  var SubAddress: java.lang.String = js.native
  var TextToDisplay: java.lang.String = js.native
  val Type: scala.Double = js.native
  def AddToFavorites(): scala.Unit = js.native
  def CreateNewDocument(Filename: java.lang.String, EditNow: scala.Boolean, Overwrite: scala.Boolean): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Follow(): scala.Unit = js.native
  def Follow(NewWindow: scala.Boolean): scala.Unit = js.native
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: activexDashOfficeLib.OfficeNs.ByteArray
  ): scala.Unit = js.native
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: activexDashOfficeLib.OfficeNs.ByteArray,
    Method: activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod
  ): scala.Unit = js.native
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: activexDashOfficeLib.OfficeNs.ByteArray,
    Method: activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod,
    HeaderInfo: java.lang.String
  ): scala.Unit = js.native
  def Follow(NewWindow: scala.Boolean, AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: java.lang.String): scala.Unit = js.native
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: java.lang.String,
    Method: activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod
  ): scala.Unit = js.native
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: java.lang.String,
    Method: activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod,
    HeaderInfo: java.lang.String
  ): scala.Unit = js.native
  def Range(Address: java.lang.String): Range = js.native
  def Range(RowIndex: scala.Double): Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
}

