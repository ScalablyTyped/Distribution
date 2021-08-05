package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var ArtStyle: WdPageBorderArt
  
  var ArtWidth: Double
  
  var Color: WdColor
  
  var ColorIndex: WdColorIndex
  
  val Creator: Double
  
  val Inside: Boolean
  
  var LineStyle: WdLineStyle
  
  var LineWidth: WdLineWidth
  
  val Parent: js.Any
  
  var Visible: Boolean
  
  /* private */ @JSName("Word.Border_typekey")
  var WordDotBorder_typekey: Border
}
object Border {
  
  inline def apply(
    Application: Application,
    ArtStyle: WdPageBorderArt,
    ArtWidth: Double,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    Creator: Double,
    Inside: Boolean,
    LineStyle: WdLineStyle,
    LineWidth: WdLineWidth,
    Parent: js.Any,
    Visible: Boolean,
    WordDotBorder_typekey: Border
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ArtStyle = ArtStyle.asInstanceOf[js.Any], ArtWidth = ArtWidth.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Inside = Inside.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Border_typekey")(WordDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setArtStyle(value: WdPageBorderArt): Self = StObject.set(x, "ArtStyle", value.asInstanceOf[js.Any])
    
    inline def setArtWidth(value: Double): Self = StObject.set(x, "ArtWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: WdColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: WdColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setInside(value: Boolean): Self = StObject.set(x, "Inside", value.asInstanceOf[js.Any])
    
    inline def setLineStyle(value: WdLineStyle): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: WdLineWidth): Self = StObject.set(x, "LineWidth", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWordDotBorder_typekey(value: Border): Self = StObject.set(x, "Word.Border_typekey", value.asInstanceOf[js.Any])
  }
}
