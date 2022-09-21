package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lists extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): List
  
  val Parent: Any
  
  /* private */ @JSName("Word.Lists_typekey")
  var WordDotLists_typekey: Lists
}
object Lists {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => List,
    Parent: Any,
    WordDotLists_typekey: Lists
  ): Lists = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Lists_typekey")(WordDotLists_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lists]
  }
  
  extension [Self <: Lists](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => List): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotLists_typekey(value: Lists): Self = StObject.set(x, "Word.Lists_typekey", value.asInstanceOf[js.Any])
  }
}
