package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFrame extends js.Object {
  val Application: js.Any
  var AutoSize: PpAutoSize
  val Creator: Double
  val HasText: MsoTriState
  var HorizontalAnchor: MsoHorizontalAnchor
  var MarginBottom: Double
  var MarginLeft: Double
  var MarginRight: Double
  var MarginTop: Double
  var Orientation: MsoTextOrientation
  val Parent: js.Any
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame
  val Ruler: typings.activexPowerpoint.PowerPoint.Ruler
  val TextRange: typings.activexPowerpoint.PowerPoint.TextRange
  var VerticalAnchor: MsoVerticalAnchor
  var WordWrap: MsoTriState
  def DeleteText(): Unit
}

object TextFrame {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoSize: PpAutoSize,
    Creator: Double,
    DeleteText: () => Unit,
    HasText: MsoTriState,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    Orientation: MsoTextOrientation,
    Parent: js.Any,
    PowerPointDotTextFrame_typekey: TextFrame,
    Ruler: Ruler,
    TextRange: TextRange,
    VerticalAnchor: MsoVerticalAnchor,
    WordWrap: MsoTriState
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextFrame_typekey")(PowerPointDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
}

