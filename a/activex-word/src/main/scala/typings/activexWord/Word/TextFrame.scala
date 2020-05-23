package typings.activexWord.Word

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoPathFormat
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexOffice.Office.MsoWarpFormat
import typings.activexOffice.Office.TextColumn2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFrame extends js.Object {
  val Application: typings.activexWord.Word.Application
  var AutoSize: Double
  val Column: TextColumn2
  val ContainingRange: Range
  val Creator: Double
  val HasText: Double
  var HorizontalAnchor: MsoHorizontalAnchor
  var MarginBottom: Double
  var MarginLeft: Double
  var MarginRight: Double
  var MarginTop: Double
  var Next: TextFrame
  var NoTextRotation: MsoTriState
  var Orientation: MsoTextOrientation
  val Overflowing: Boolean
  val Parent: Shape
  var PathFormat: MsoPathFormat
  var Previous: TextFrame
  val TextRange: Range
  val ThreeD: ThreeDFormat
  var VerticalAnchor: MsoVerticalAnchor
  var WarpFormat: MsoWarpFormat
  @JSName("Word.TextFrame_typekey")
  var WordDotTextFrame_typekey: TextFrame
  var WordWrap: Double
  def BreakForwardLink(): Unit
  def DeleteText(): Unit
  def ValidLinkTarget(TargetTextFrame: TextFrame): Boolean
}

object TextFrame {
  @scala.inline
  def apply(
    Application: Application,
    AutoSize: Double,
    BreakForwardLink: () => Unit,
    Column: TextColumn2,
    ContainingRange: Range,
    Creator: Double,
    DeleteText: () => Unit,
    HasText: Double,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    Next: TextFrame,
    NoTextRotation: MsoTriState,
    Orientation: MsoTextOrientation,
    Overflowing: Boolean,
    Parent: Shape,
    PathFormat: MsoPathFormat,
    Previous: TextFrame,
    TextRange: Range,
    ThreeD: ThreeDFormat,
    ValidLinkTarget: TextFrame => Boolean,
    VerticalAnchor: MsoVerticalAnchor,
    WarpFormat: MsoWarpFormat,
    WordDotTextFrame_typekey: TextFrame,
    WordWrap: Double
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BreakForwardLink = js.Any.fromFunction0(BreakForwardLink), Column = Column.asInstanceOf[js.Any], ContainingRange = ContainingRange.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], NoTextRotation = NoTextRotation.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Overflowing = Overflowing.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PathFormat = PathFormat.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any], ValidLinkTarget = js.Any.fromFunction1(ValidLinkTarget), VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WarpFormat = WarpFormat.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextFrame_typekey")(WordDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
}

