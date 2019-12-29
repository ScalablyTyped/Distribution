package typings.activexDashExcel.Excel

import typings.activexDashOffice.Office.MsoAutoSize
import typings.activexDashOffice.Office.MsoHorizontalAnchor
import typings.activexDashOffice.Office.MsoPathFormat
import typings.activexDashOffice.Office.MsoPresetTextEffect
import typings.activexDashOffice.Office.MsoTextOrientation
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.MsoVerticalAnchor
import typings.activexDashOffice.Office.MsoWarpFormat
import typings.activexDashOffice.Office.Ruler2
import typings.activexDashOffice.Office.TextColumn2
import typings.activexDashOffice.Office.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TextFrame2")
@js.native
class TextFrame2 protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: MsoAutoSize = js.native
  val Column: TextColumn2 = js.native
  val Creator: Double = js.native
  @JSName("Excel.TextFrame2_typekey")
  var ExcelDotTextFrame2_typekey: TextFrame2 = js.native
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
  val Ruler: Ruler2 = js.native
  val TextRange: TextRange2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  var WordArtformat: MsoPresetTextEffect = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

