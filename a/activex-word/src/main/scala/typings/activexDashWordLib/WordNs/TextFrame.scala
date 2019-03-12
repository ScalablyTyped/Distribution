package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  var AutoSize: scala.Double = js.native
  val Column: activexDashOfficeLib.OfficeNs.TextColumn2 = js.native
  val ContainingRange: Range = js.native
  val Creator: scala.Double = js.native
  val HasText: scala.Double = js.native
  var HorizontalAnchor: activexDashOfficeLib.OfficeNs.MsoHorizontalAnchor = js.native
  var MarginBottom: scala.Double = js.native
  var MarginLeft: scala.Double = js.native
  var MarginRight: scala.Double = js.native
  var MarginTop: scala.Double = js.native
  var Next: TextFrame = js.native
  var NoTextRotation: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation = js.native
  val Overflowing: scala.Boolean = js.native
  val Parent: Shape = js.native
  var PathFormat: activexDashOfficeLib.OfficeNs.MsoPathFormat = js.native
  var Previous: TextFrame = js.native
  val TextRange: Range = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: activexDashOfficeLib.OfficeNs.MsoVerticalAnchor = js.native
  var WarpFormat: activexDashOfficeLib.OfficeNs.MsoWarpFormat = js.native
  var `Word.TextFrame_typekey`: TextFrame = js.native
  var WordWrap: scala.Double = js.native
  def BreakForwardLink(): scala.Unit = js.native
  def DeleteText(): scala.Unit = js.native
  def ValidLinkTarget(TargetTextFrame: TextFrame): scala.Boolean = js.native
}

