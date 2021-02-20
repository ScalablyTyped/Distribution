package typings.activexExcel.Excel

import typings.activexOffice.Office.ByteArray
import typings.activexOffice.Office.MsoExtraInfoMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlink extends StObject {
  
  def AddToFavorites(): Unit = js.native
  
  var Address: String = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def CreateNewDocument(Filename: String, EditNow: Boolean, Overwrite: Boolean): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  var EmailSubject: String = js.native
  
  @JSName("Excel.Hyperlink_typekey")
  var ExcelDotHyperlink_typekey: Hyperlink = js.native
  
  def Follow(): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: js.UndefOr[scala.Nothing], AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: String): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: js.UndefOr[scala.Nothing], AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: ByteArray): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: ByteArray,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: String): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: String,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
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
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
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
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  
  var ScreenTip: String = js.native
  
  val Shape: typings.activexExcel.Excel.Shape = js.native
  
  var SubAddress: String = js.native
  
  var TextToDisplay: String = js.native
  
  val Type: Double = js.native
}
