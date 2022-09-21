package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFrame2 extends StObject {
  
  val Application: Any
  
  var AutoSize: MsoAutoSize
  
  val Column: TextColumn2
  
  val Creator: Double
  
  def DeleteText(): Unit
  
  val HasText: MsoTriState
  
  var HorizontalAnchor: MsoHorizontalAnchor
  
  var MarginBottom: Double
  
  var MarginLeft: Double
  
  var MarginRight: Double
  
  var MarginTop: Double
  
  var NoTextRotation: MsoTriState
  
  /* private */ @JSName("Office.TextFrame2_typekey")
  var OfficeDotTextFrame2_typekey: TextFrame2
  
  var Orientation: MsoTextOrientation
  
  val Parent: Any
  
  var PathFormat: MsoPathFormat
  
  val Ruler: Ruler2
  
  val TextRange: TextRange2
  
  val ThreeD: ThreeDFormat
  
  var VerticalAnchor: MsoVerticalAnchor
  
  var WarpFormat: MsoWarpFormat
  
  var WordArtformat: MsoPresetTextEffect
  
  var WordWrap: MsoTriState
}
object TextFrame2 {
  
  inline def apply(
    Application: Any,
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
    Parent: Any,
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
  
  extension [Self <: TextFrame2](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoSize(value: MsoAutoSize): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: TextColumn2): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDeleteText(value: () => Unit): Self = StObject.set(x, "DeleteText", js.Any.fromFunction0(value))
    
    inline def setHasText(value: MsoTriState): Self = StObject.set(x, "HasText", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAnchor(value: MsoHorizontalAnchor): Self = StObject.set(x, "HorizontalAnchor", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "MarginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "MarginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "MarginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "MarginTop", value.asInstanceOf[js.Any])
    
    inline def setNoTextRotation(value: MsoTriState): Self = StObject.set(x, "NoTextRotation", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotTextFrame2_typekey(value: TextFrame2): Self = StObject.set(x, "Office.TextFrame2_typekey", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: MsoTextOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPathFormat(value: MsoPathFormat): Self = StObject.set(x, "PathFormat", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: Ruler2): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    inline def setTextRange(value: TextRange2): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    inline def setThreeD(value: ThreeDFormat): Self = StObject.set(x, "ThreeD", value.asInstanceOf[js.Any])
    
    inline def setVerticalAnchor(value: MsoVerticalAnchor): Self = StObject.set(x, "VerticalAnchor", value.asInstanceOf[js.Any])
    
    inline def setWarpFormat(value: MsoWarpFormat): Self = StObject.set(x, "WarpFormat", value.asInstanceOf[js.Any])
    
    inline def setWordArtformat(value: MsoPresetTextEffect): Self = StObject.set(x, "WordArtformat", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: MsoTriState): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
