package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFrame2 extends js.Object {
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
  @JSName("Office.TextFrame2_typekey")
  var OfficeDotTextFrame2_typekey: TextFrame2 = js.native
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
  @scala.inline
  implicit class TextFrame2Ops[Self <: TextFrame2] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSize(value: MsoAutoSize): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: TextColumn2): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteText(value: () => Unit): Self = this.set("DeleteText", js.Any.fromFunction0(value))
    @scala.inline
    def setHasText(value: MsoTriState): Self = this.set("HasText", value.asInstanceOf[js.Any])
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
    def setNoTextRotation(value: MsoTriState): Self = this.set("NoTextRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotTextFrame2_typekey(value: TextFrame2): Self = this.set("Office.TextFrame2_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: MsoTextOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathFormat(value: MsoPathFormat): Self = this.set("PathFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuler(value: Ruler2): Self = this.set("Ruler", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextRange(value: TextRange2): Self = this.set("TextRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreeD(value: ThreeDFormat): Self = this.set("ThreeD", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAnchor(value: MsoVerticalAnchor): Self = this.set("VerticalAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarpFormat(value: MsoWarpFormat): Self = this.set("WarpFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordArtformat(value: MsoPresetTextEffect): Self = this.set("WordArtformat", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: MsoTriState): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

