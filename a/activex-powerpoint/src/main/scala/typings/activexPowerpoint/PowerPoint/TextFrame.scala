package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFrame extends StObject {
  
  val Application: js.Any
  
  var AutoSize: PpAutoSize
  
  val Creator: Double
  
  def DeleteText(): Unit
  
  val HasText: MsoTriState
  
  var HorizontalAnchor: MsoHorizontalAnchor
  
  var MarginBottom: Double
  
  var MarginLeft: Double
  
  var MarginRight: Double
  
  var MarginTop: Double
  
  var Orientation: MsoTextOrientation
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame
  
  val Ruler: typings.activexPowerpoint.PowerPoint.Ruler
  
  val TextRange: typings.activexPowerpoint.PowerPoint.TextRange
  
  var VerticalAnchor: MsoVerticalAnchor
  
  var WordWrap: MsoTriState
}
object TextFrame {
  
  inline def apply(
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
  
  extension [Self <: TextFrame](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoSize(value: PpAutoSize): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDeleteText(value: () => Unit): Self = StObject.set(x, "DeleteText", js.Any.fromFunction0(value))
    
    inline def setHasText(value: MsoTriState): Self = StObject.set(x, "HasText", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAnchor(value: MsoHorizontalAnchor): Self = StObject.set(x, "HorizontalAnchor", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "MarginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "MarginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "MarginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "MarginTop", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: MsoTextOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTextFrame_typekey(value: TextFrame): Self = StObject.set(x, "PowerPoint.TextFrame_typekey", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: Ruler): Self = StObject.set(x, "Ruler", value.asInstanceOf[js.Any])
    
    inline def setTextRange(value: TextRange): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    inline def setVerticalAnchor(value: MsoVerticalAnchor): Self = StObject.set(x, "VerticalAnchor", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: MsoTriState): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
