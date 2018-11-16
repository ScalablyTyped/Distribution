package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var Address: java.lang.String = js.native
  val Application: Application = js.native
  var EmailSubject: java.lang.String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Hyperlink_typekey`: Hyperlink = js.native
  var ScreenTip: java.lang.String = js.native
  var ShowAndReturn: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var SubAddress: java.lang.String = js.native
  var TextToDisplay: java.lang.String = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoHyperlinkType = js.native
  def AddToFavorites(): scala.Unit = js.native
  def CreateNewDocument(
    FileName: java.lang.String,
    EditNow: activexDashOfficeLib.OfficeNs.MsoTriState,
    Overwrite: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Follow(): scala.Unit = js.native
}

