package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadingStyles extends StObject {
  
  def Add(Style: Any, Level: Double): HeadingStyle
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): HeadingStyle
  
  val Parent: Any
  
  /* private */ @JSName("Word.HeadingStyles_typekey")
  var WordDotHeadingStyles_typekey: HeadingStyles
}
object HeadingStyles {
  
  inline def apply(
    Add: (Any, Double) => HeadingStyle,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => HeadingStyle,
    Parent: Any,
    WordDotHeadingStyles_typekey: HeadingStyles
  ): HeadingStyles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyles_typekey")(WordDotHeadingStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadingStyles] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Any, Double) => HeadingStyle): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => HeadingStyle): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotHeadingStyles_typekey(value: HeadingStyles): Self = StObject.set(x, "Word.HeadingStyles_typekey", value.asInstanceOf[js.Any])
  }
}
