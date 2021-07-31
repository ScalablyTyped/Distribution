package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablesOfAuthoritiesCategories extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): TableOfAuthoritiesCategory
  
  val Parent: js.Any
  
  @JSName("Word.TablesOfAuthoritiesCategories_typekey")
  var WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories
}
object TablesOfAuthoritiesCategories {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => TableOfAuthoritiesCategory,
    Parent: js.Any,
    WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories
  ): TablesOfAuthoritiesCategories = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TablesOfAuthoritiesCategories_typekey")(WordDotTablesOfAuthoritiesCategories_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesOfAuthoritiesCategories]
  }
  
  @scala.inline
  implicit class TablesOfAuthoritiesCategoriesMutableBuilder[Self <: TablesOfAuthoritiesCategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => TableOfAuthoritiesCategory): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTablesOfAuthoritiesCategories_typekey(value: TablesOfAuthoritiesCategories): Self = StObject.set(x, "Word.TablesOfAuthoritiesCategories_typekey", value.asInstanceOf[js.Any])
  }
}
