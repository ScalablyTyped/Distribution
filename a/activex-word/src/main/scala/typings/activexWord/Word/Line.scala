package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Height: Double
  
  val Left: Double
  
  val LineType: WdLineType
  
  val Parent: js.Any
  
  val Range: typings.activexWord.Word.Range
  
  val Rectangles: typings.activexWord.Word.Rectangles
  
  val Top: Double
  
  val Width: Double
  
  /* private */ @JSName("Word.Line_typekey")
  var WordDotLine_typekey: Line
}
object Line {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Height: Double,
    Left: Double,
    LineType: WdLineType,
    Parent: js.Any,
    Range: Range,
    Rectangles: Rectangles,
    Top: Double,
    Width: Double,
    WordDotLine_typekey: Line
  ): Line = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Line_typekey")(WordDotLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  extension [Self <: Line](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLineType(value: WdLineType): Self = StObject.set(x, "LineType", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRectangles(value: Rectangles): Self = StObject.set(x, "Rectangles", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotLine_typekey(value: Line): Self = StObject.set(x, "Word.Line_typekey", value.asInstanceOf[js.Any])
  }
}
