package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFrame extends js.Object {
  
  val Application: js.Any = js.native
  
  var AutoSize: PpAutoSize = js.native
  
  val Creator: Double = js.native
  
  def DeleteText(): Unit = js.native
  
  val HasText: MsoTriState = js.native
  
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  
  var MarginBottom: Double = js.native
  
  var MarginLeft: Double = js.native
  
  var MarginRight: Double = js.native
  
  var MarginTop: Double = js.native
  
  var Orientation: MsoTextOrientation = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame = js.native
  
  val Ruler: typings.activexPowerpoint.PowerPoint.Ruler = js.native
  
  val TextRange: typings.activexPowerpoint.PowerPoint.TextRange = js.native
  
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  var WordWrap: MsoTriState = js.native
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: PpAutoSize): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    
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
    def setOrientation(value: MsoTextOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextFrame_typekey(value: TextFrame): Self = this.set("PowerPoint.TextFrame_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: Ruler): Self = this.set("Ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange(value: TextRange): Self = this.set("TextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAnchor(value: MsoVerticalAnchor): Self = this.set("VerticalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: MsoTriState): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
}
