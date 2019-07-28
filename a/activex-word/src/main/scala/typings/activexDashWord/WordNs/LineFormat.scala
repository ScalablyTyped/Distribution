package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.MsoArrowheadLength
import typings.activexDashOffice.OfficeNs.MsoArrowheadStyle
import typings.activexDashOffice.OfficeNs.MsoArrowheadWidth
import typings.activexDashOffice.OfficeNs.MsoLineDashStyle
import typings.activexDashOffice.OfficeNs.MsoLineStyle
import typings.activexDashOffice.OfficeNs.MsoPatternType
import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.LineFormat")
@js.native
class LineFormat protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val BackColor: ColorFormat = js.native
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  val Creator: Double = js.native
  var DashStyle: MsoLineDashStyle = js.native
  var EndArrowheadLength: MsoArrowheadLength = js.native
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  val ForeColor: ColorFormat = js.native
  var InsetPen: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Pattern: MsoPatternType = js.native
  var Style: MsoLineStyle = js.native
  var Transparency: Double = js.native
  var Visible: MsoTriState = js.native
  var Weight: Double = js.native
  var `Word.LineFormat_typekey`: LineFormat = js.native
}

