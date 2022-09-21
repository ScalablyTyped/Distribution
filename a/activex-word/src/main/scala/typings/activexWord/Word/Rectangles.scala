package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rectangles extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Rectangle
  
  val Parent: Any
  
  /* private */ @JSName("Word.Rectangles_typekey")
  var WordDotRectangles_typekey: Rectangles
}
object Rectangles {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Rectangle,
    Parent: Any,
    WordDotRectangles_typekey: Rectangles
  ): Rectangles = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Rectangles_typekey")(WordDotRectangles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangles]
  }
  
  extension [Self <: Rectangles](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Rectangle): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotRectangles_typekey(value: Rectangles): Self = StObject.set(x, "Word.Rectangles_typekey", value.asInstanceOf[js.Any])
  }
}
