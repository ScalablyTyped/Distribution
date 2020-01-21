package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoHyperlinkType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: String = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var EmailSubject: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Hyperlink_typekey")
  var PowerPointDotHyperlink_typekey: Hyperlink = js.native
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

