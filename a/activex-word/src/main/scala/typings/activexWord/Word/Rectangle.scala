package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rectangle extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Height: Double
  
  val Left: Double
  
  val Lines: typings.activexWord.Word.Lines
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  val RectangleType: WdRectangleType
  
  val Top: Double
  
  val Width: Double
  
  /* private */ @JSName("Word.Rectangle_typekey")
  var WordDotRectangle_typekey: Rectangle
}
object Rectangle {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Height: Double,
    Left: Double,
    Lines: Lines,
    Parent: Any,
    Range: Range,
    RectangleType: WdRectangleType,
    Top: Double,
    Width: Double,
    WordDotRectangle_typekey: Rectangle
  ): Rectangle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Lines = Lines.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RectangleType = RectangleType.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Rectangle_typekey")(WordDotRectangle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
  
  extension [Self <: Rectangle](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLines(value: Lines): Self = StObject.set(x, "Lines", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRectangleType(value: WdRectangleType): Self = StObject.set(x, "RectangleType", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotRectangle_typekey(value: Rectangle): Self = StObject.set(x, "Word.Rectangle_typekey", value.asInstanceOf[js.Any])
  }
}
