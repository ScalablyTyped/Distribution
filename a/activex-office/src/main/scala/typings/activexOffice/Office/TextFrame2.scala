package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFrame2 extends js.Object {
  val Application: js.Any
  var AutoSize: MsoAutoSize
  val Column: TextColumn2
  val Creator: Double
  val HasText: MsoTriState
  var HorizontalAnchor: MsoHorizontalAnchor
  var MarginBottom: Double
  var MarginLeft: Double
  var MarginRight: Double
  var MarginTop: Double
  var NoTextRotation: MsoTriState
  @JSName("Office.TextFrame2_typekey")
  var OfficeDotTextFrame2_typekey: TextFrame2
  var Orientation: MsoTextOrientation
  val Parent: js.Any
  var PathFormat: MsoPathFormat
  val Ruler: Ruler2
  val TextRange: TextRange2
  val ThreeD: ThreeDFormat
  var VerticalAnchor: MsoVerticalAnchor
  var WarpFormat: MsoWarpFormat
  var WordArtformat: MsoPresetTextEffect
  var WordWrap: MsoTriState
  def DeleteText(): Unit
}

object TextFrame2 {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoSize: MsoAutoSize,
    Column: TextColumn2,
    Creator: Double,
    DeleteText: () => Unit,
    HasText: MsoTriState,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    NoTextRotation: MsoTriState,
    OfficeDotTextFrame2_typekey: TextFrame2,
    Orientation: MsoTextOrientation,
    Parent: js.Any,
    PathFormat: MsoPathFormat,
    Ruler: Ruler2,
    TextRange: TextRange2,
    ThreeD: ThreeDFormat,
    VerticalAnchor: MsoVerticalAnchor,
    WarpFormat: MsoWarpFormat,
    WordArtformat: MsoPresetTextEffect,
    WordWrap: MsoTriState
  ): TextFrame2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], NoTextRotation = NoTextRotation.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PathFormat = PathFormat.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any], VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WarpFormat = WarpFormat.asInstanceOf[js.Any], WordArtformat = WordArtformat.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextFrame2_typekey")(OfficeDotTextFrame2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame2]
  }
}

