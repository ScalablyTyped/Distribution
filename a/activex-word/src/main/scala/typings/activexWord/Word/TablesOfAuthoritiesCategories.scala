package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablesOfAuthoritiesCategories extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): TableOfAuthoritiesCategory
  
  val Parent: Any
  
  /* private */ @JSName("Word.TablesOfAuthoritiesCategories_typekey")
  var WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories
}
object TablesOfAuthoritiesCategories {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => TableOfAuthoritiesCategory,
    Parent: Any,
    WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories
  ): TablesOfAuthoritiesCategories = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TablesOfAuthoritiesCategories_typekey")(WordDotTablesOfAuthoritiesCategories_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesOfAuthoritiesCategories]
  }
  
  extension [Self <: TablesOfAuthoritiesCategories](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => TableOfAuthoritiesCategory): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTablesOfAuthoritiesCategories_typekey(value: TablesOfAuthoritiesCategories): Self = StObject.set(x, "Word.TablesOfAuthoritiesCategories_typekey", value.asInstanceOf[js.Any])
  }
}
