package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexPowerpoint.PowerPoint.PpAutoSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextFrame")
@js.native
class TextFrame protected ()
  extends typings.activexPowerpoint.PowerPoint.TextFrame {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var AutoSize: PpAutoSize = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val HasText: MsoTriState = js.native
  /* CompleteClass */
  override var HorizontalAnchor: MsoHorizontalAnchor = js.native
  /* CompleteClass */
  override var MarginBottom: Double = js.native
  /* CompleteClass */
  override var MarginLeft: Double = js.native
  /* CompleteClass */
  override var MarginRight: Double = js.native
  /* CompleteClass */
  override var MarginTop: Double = js.native
  /* CompleteClass */
  override var Orientation: MsoTextOrientation = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.TextFrame_typekey")
  override var PowerPointDotTextFrame_typekey: typings.activexPowerpoint.PowerPoint.TextFrame = js.native
  /* CompleteClass */
  override val Ruler: typings.activexPowerpoint.PowerPoint.Ruler = js.native
  /* CompleteClass */
  override val TextRange: typings.activexPowerpoint.PowerPoint.TextRange = js.native
  /* CompleteClass */
  override var VerticalAnchor: MsoVerticalAnchor = js.native
  /* CompleteClass */
  override var WordWrap: MsoTriState = js.native
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
}

