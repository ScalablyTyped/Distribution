package typings.activexDashExcel.ExcelNs

import typings.activexDashOffice.OfficeNs.ByteArray
import typings.activexDashOffice.OfficeNs.MsoExtraInfoMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: String = js.native
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var EmailSubject: String = js.native
  var `Excel.Hyperlink_typekey`: Hyperlink = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  var ScreenTip: String = js.native
  val Shape: typings.activexDashExcel.ExcelNs.Shape = js.native
  var SubAddress: String = js.native
  var TextToDisplay: String = js.native
  val Type: Double = js.native
  def AddToFavorites(): Unit = js.native
  def CreateNewDocument(Filename: String, EditNow: Boolean, Overwrite: Boolean): Unit = js.native
  def Delete(): Unit = js.native
  def Follow(): Unit = js.native
  def Follow(NewWindow: Boolean): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: String): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: ByteArray): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Range(Address: String): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
}

