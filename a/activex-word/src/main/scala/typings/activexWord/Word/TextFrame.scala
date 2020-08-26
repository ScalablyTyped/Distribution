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

@js.native
trait TextFrame extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
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
  @JSName("Word.TextFrame_typekey")
  var WordDotTextFrame_typekey: TextFrame = js.native
  var WordWrap: Double = js.native
  def BreakForwardLink(): Unit = js.native
  def DeleteText(): Unit = js.native
  def ValidLinkTarget(TargetTextFrame: TextFrame): Boolean = js.native
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
  @scala.inline
  implicit class TextFrameOps[Self <: TextFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSize(value: Double): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakForwardLink(value: () => Unit): Self = this.set("BreakForwardLink", js.Any.fromFunction0(value))
    @scala.inline
    def setColumn(value: TextColumn2): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainingRange(value: Range): Self = this.set("ContainingRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteText(value: () => Unit): Self = this.set("DeleteText", js.Any.fromFunction0(value))
    @scala.inline
    def setHasText(value: Double): Self = this.set("HasText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalAnchor(value: MsoHorizontalAnchor): Self = this.set("HorizontalAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("MarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("MarginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("MarginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("MarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: TextFrame): Self = this.set("Next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoTextRotation(value: MsoTriState): Self = this.set("NoTextRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: MsoTextOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflowing(value: Boolean): Self = this.set("Overflowing", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Shape): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathFormat(value: MsoPathFormat): Self = this.set("PathFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: TextFrame): Self = this.set("Previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextRange(value: Range): Self = this.set("TextRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreeD(value: ThreeDFormat): Self = this.set("ThreeD", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidLinkTarget(value: TextFrame => Boolean): Self = this.set("ValidLinkTarget", js.Any.fromFunction1(value))
    @scala.inline
    def setVerticalAnchor(value: MsoVerticalAnchor): Self = this.set("VerticalAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarpFormat(value: MsoWarpFormat): Self = this.set("WarpFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTextFrame_typekey(value: TextFrame): Self = this.set("Word.TextFrame_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Double): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

