package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Categories extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Category
  
  val Parent: Any
  
  /* private */ @JSName("Word.Categories_typekey")
  var WordDotCategories_typekey: Categories
}
object Categories {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => Category,
    Parent: Any,
    WordDotCategories_typekey: Categories
  ): Categories = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Categories_typekey")(WordDotCategories_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Category): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotCategories_typekey(value: Categories): Self = StObject.set(x, "Word.Categories_typekey", value.asInstanceOf[js.Any])
  }
}
