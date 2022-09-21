package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLevels extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): ListLevel
  
  val Parent: Any
  
  /* private */ @JSName("Word.ListLevels_typekey")
  var WordDotListLevels_typekey: ListLevels
}
object ListLevels {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => ListLevel,
    Parent: Any,
    WordDotListLevels_typekey: ListLevels
  ): ListLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevels_typekey")(WordDotListLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevels]
  }
  
  extension [Self <: ListLevels](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ListLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotListLevels_typekey(value: ListLevels): Self = StObject.set(x, "Word.ListLevels_typekey", value.asInstanceOf[js.Any])
  }
}
