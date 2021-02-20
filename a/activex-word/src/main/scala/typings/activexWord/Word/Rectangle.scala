package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Height: Double = js.native
  
  val Left: Double = js.native
  
  val Lines: typings.activexWord.Word.Lines = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  val RectangleType: WdRectangleType = js.native
  
  val Top: Double = js.native
  
  val Width: Double = js.native
  
  @JSName("Word.Rectangle_typekey")
  var WordDotRectangle_typekey: Rectangle = js.native
}
object Rectangle {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Height: Double,
    Left: Double,
    Lines: Lines,
    Parent: js.Any,
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
  
  @scala.inline
  implicit class RectangleMutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Lines): Self = StObject.set(x, "Lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleType(value: WdRectangleType): Self = StObject.set(x, "RectangleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotRectangle_typekey(value: Rectangle): Self = StObject.set(x, "Word.Rectangle_typekey", value.asInstanceOf[js.Any])
  }
}
