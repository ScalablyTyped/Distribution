package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: java.lang.String = js.native
  val AddressOld: java.lang.String = js.native
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  var EmailSubject: java.lang.String = js.native
  val ExtraInfoRequired: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Range: Range = js.native
  var ScreenTip: java.lang.String = js.native
  val Shape: Shape = js.native
  var SubAddress: java.lang.String = js.native
  val SubAddressOld: java.lang.String = js.native
  var Target: java.lang.String = js.native
  var TextToDisplay: java.lang.String = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoHyperlinkType = js.native
  var `Word.Hyperlink_typekey`: Hyperlink = js.native
  def AddToFavorites(): scala.Unit = js.native
  def CreateNewDocument(FileName: java.lang.String, EditNow: scala.Boolean, Overwrite: scala.Boolean): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Follow(): scala.Unit = js.native
  def Follow(NewWindow: js.Any): scala.Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any): scala.Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any, ExtraInfo: js.Any): scala.Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any, ExtraInfo: js.Any, Method: js.Any): scala.Unit = js.native
  def Follow(NewWindow: js.Any, AddHistory: js.Any, ExtraInfo: js.Any, Method: js.Any, HeaderInfo: js.Any): scala.Unit = js.native
}

