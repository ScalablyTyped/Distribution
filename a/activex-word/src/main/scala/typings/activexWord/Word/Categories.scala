package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Categories extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): Category
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.Categories_typekey")
  var WordDotCategories_typekey: Categories
}
object Categories {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Category,
    Parent: js.Any,
    WordDotCategories_typekey: Categories
  ): Categories = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Categories_typekey")(WordDotCategories_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categories]
  }
  
  extension [Self <: Categories](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => Category): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotCategories_typekey(value: Categories): Self = StObject.set(x, "Word.Categories_typekey", value.asInstanceOf[js.Any])
  }
}
