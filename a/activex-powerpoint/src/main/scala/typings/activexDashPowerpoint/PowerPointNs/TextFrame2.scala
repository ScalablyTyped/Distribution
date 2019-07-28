package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoAutoSize
import typings.activexDashOffice.OfficeNs.MsoHorizontalAnchor
import typings.activexDashOffice.OfficeNs.MsoPathFormat
import typings.activexDashOffice.OfficeNs.MsoPresetTextEffect
import typings.activexDashOffice.OfficeNs.MsoTextOrientation
import typings.activexDashOffice.OfficeNs.MsoTriState
import typings.activexDashOffice.OfficeNs.MsoVerticalAnchor
import typings.activexDashOffice.OfficeNs.MsoWarpFormat
import typings.activexDashOffice.OfficeNs.Ruler2
import typings.activexDashOffice.OfficeNs.TextColumn2
import typings.activexDashOffice.OfficeNs.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextFrame2")
@js.native
class TextFrame2 protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: MsoAutoSize = js.native
  val Column: TextColumn2 = js.native
  val Creator: Double = js.native
  val HasText: MsoTriState = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var NoTextRotation: MsoTriState = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  var PathFormat: MsoPathFormat = js.native
  var `PowerPoint.TextFrame2_typekey`: TextFrame2 = js.native
  val Ruler: Ruler2 = js.native
  val TextRange: TextRange2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  var WordArtFormat: MsoPresetTextEffect = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

