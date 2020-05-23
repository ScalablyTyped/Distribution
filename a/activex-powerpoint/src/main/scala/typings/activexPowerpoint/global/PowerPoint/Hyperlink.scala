package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoHyperlinkType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Hyperlink")
@js.native
class Hyperlink protected ()
  extends typings.activexPowerpoint.PowerPoint.Hyperlink {
  /* CompleteClass */
  override var Address: String = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var EmailSubject: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Hyperlink_typekey")
  override var PowerPointDotHyperlink_typekey: typings.activexPowerpoint.PowerPoint.Hyperlink = js.native
  /* CompleteClass */
  override var ScreenTip: String = js.native
  /* CompleteClass */
  override var ShowAndReturn: MsoTriState = js.native
  /* CompleteClass */
  override var SubAddress: String = js.native
  /* CompleteClass */
  override var TextToDisplay: String = js.native
  /* CompleteClass */
  override val Type: MsoHyperlinkType = js.native
  /* CompleteClass */
  override def AddToFavorites(): Unit = js.native
  /* CompleteClass */
  override def CreateNewDocument(FileName: String, EditNow: MsoTriState, Overwrite: MsoTriState): Unit = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Follow(): Unit = js.native
}

