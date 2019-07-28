package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.MsoHorizontalAnchor
import typings.activexDashOffice.OfficeNs.MsoPathFormat
import typings.activexDashOffice.OfficeNs.MsoTextOrientation
import typings.activexDashOffice.OfficeNs.MsoTriState
import typings.activexDashOffice.OfficeNs.MsoVerticalAnchor
import typings.activexDashOffice.OfficeNs.MsoWarpFormat
import typings.activexDashOffice.OfficeNs.TextColumn2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var AutoSize: Double = js.native
  val Column: TextColumn2 = js.native
  val ContainingRange: Range = js.native
  val Creator: Double = js.native
  val HasText: Double = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Next: TextFrame = js.native
  var NoTextRotation: MsoTriState = js.native
  var Orientation: MsoTextOrientation = js.native
  val Overflowing: Boolean = js.native
  val Parent: Shape = js.native
  var PathFormat: MsoPathFormat = js.native
  var Previous: TextFrame = js.native
  val TextRange: Range = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  var `Word.TextFrame_typekey`: TextFrame = js.native
  var WordWrap: Double = js.native
  def BreakForwardLink(): Unit = js.native
  def DeleteText(): Unit = js.native
  def ValidLinkTarget(TargetTextFrame: TextFrame): Boolean = js.native
}

