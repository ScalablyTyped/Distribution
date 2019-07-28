package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoHyperlinkType
import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: String = js.native
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  var EmailSubject: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Hyperlink_typekey`: Hyperlink = js.native
  var ScreenTip: String = js.native
  var ShowAndReturn: MsoTriState = js.native
  var SubAddress: String = js.native
  var TextToDisplay: String = js.native
  val Type: MsoHyperlinkType = js.native
  def AddToFavorites(): Unit = js.native
  def CreateNewDocument(FileName: String, EditNow: MsoTriState, Overwrite: MsoTriState): Unit = js.native
  def Delete(): Unit = js.native
  def Follow(): Unit = js.native
}

