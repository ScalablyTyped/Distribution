package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoAutoSize
import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoPathFormat
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexOffice.Office.MsoWarpFormat
import typings.activexOffice.Office.Ruler2
import typings.activexOffice.Office.TextColumn2
import typings.activexOffice.Office.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextFrame2")
@js.native
class TextFrame2 protected ()
  extends typings.activexPowerpoint.PowerPoint.TextFrame2 {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var AutoSize: MsoAutoSize = js.native
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
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
  override var NoTextRotation: MsoTriState = js.native
  /* CompleteClass */
  override var Orientation: MsoTextOrientation = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PathFormat: MsoPathFormat = js.native
  /* CompleteClass */
  @JSName("PowerPoint.TextFrame2_typekey")
  override var PowerPointDotTextFrame2_typekey: typings.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  /* CompleteClass */
  override val Ruler: Ruler2 = js.native
  /* CompleteClass */
  override val TextRange: TextRange2 = js.native
  /* CompleteClass */
  override val ThreeD: typings.activexPowerpoint.PowerPoint.ThreeDFormat = js.native
  /* CompleteClass */
  override var VerticalAnchor: MsoVerticalAnchor = js.native
  /* CompleteClass */
  override var WarpFormat: MsoWarpFormat = js.native
  /* CompleteClass */
  override var WordArtFormat: MsoPresetTextEffect = js.native
  /* CompleteClass */
  override var WordWrap: MsoTriState = js.native
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
}

