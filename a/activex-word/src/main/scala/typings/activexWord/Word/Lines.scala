package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lines extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Line
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.Lines_typekey")
  var WordDotLines_typekey: Lines
}
object Lines {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Line,
    Parent: js.Any,
    WordDotLines_typekey: Lines
  ): Lines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Lines_typekey")(WordDotLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
  
  extension [Self <: Lines](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Line): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotLines_typekey(value: Lines): Self = StObject.set(x, "Word.Lines_typekey", value.asInstanceOf[js.Any])
  }
}
