package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.MsoHyperlinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: String = js.native
  val AddressOld: String = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Creator: Double = js.native
  var EmailSubject: String = js.native
  val ExtraInfoRequired: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexDashWord.WordNs.Range = js.native
  var ScreenTip: String = js.native
  val Shape: typings.activexDashWord.WordNs.Shape = js.native
  var SubAddress: String = js.native
  val SubAddressOld: String = js.native
  var Target: String = js.native
  var TextToDisplay: String = js.native
  val Type: MsoHyperlinkType = js.native
  var `Word.Hyperlink_typekey`: Hyperlink = js.native
  def AddToFavorites(): Unit = js.native
  def CreateNewDocument(FileName: String, EditNow: Boolean, Overwrite: Boolean): Unit = js.native
  def Delete(): Unit = js.native
  def Follow(): Unit = js.native
  def Follow(NewWindow: js.Any): Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any): Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any, ExtraInfo: js.Any): Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any, ExtraInfo: js.Any, Method: js.Any): Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any, ExtraInfo: js.Any, Method: js.Any, HeaderInfo: js.Any): Unit = js.native
}

