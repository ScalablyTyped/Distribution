package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFrame2 extends StObject {
  
  val Application: js.Any = js.native
  
  var AutoSize: MsoAutoSize = js.native
  
  val Column: TextColumn2 = js.native
  
  val Creator: Double = js.native
  
  def DeleteText(): Unit = js.native
  
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
  implicit class TextFrame2MutableBuilder[Self <: TextFrame2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: MsoAutoSize): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: TextColumn2): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteText(value: () => Unit): Self = StObject.set(x, "DeleteText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasText(value: MsoTriState): Self = StObject.set(x, "HasText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAnchor(value: MsoHorizontalAnchor): Self = StObject.set(x, "HorizontalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "MarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "MarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "MarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "MarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoTextRotation(value: MsoTriState): Self = StObject.set(x, "NoTextRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotTextFrame2_typekey(value: TextFrame2): Self = StObject.set(x, "Office.TextFrame2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: MsoTextOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFormat(value: MsoPathFormat): Self = StObject.set(x, "PathFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: Ruler2): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange(value: TextRange2): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeD(value: ThreeDFormat): Self = StObject.set(x, "ThreeD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAnchor(value: MsoVerticalAnchor): Self = StObject.set(x, "VerticalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarpFormat(value: MsoWarpFormat): Self = StObject.set(x, "WarpFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordArtformat(value: MsoPresetTextEffect): Self = StObject.set(x, "WordArtformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: MsoTriState): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
