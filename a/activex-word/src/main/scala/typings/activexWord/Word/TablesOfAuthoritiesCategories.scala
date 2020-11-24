package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesOfAuthoritiesCategories extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): TableOfAuthoritiesCategory = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.TablesOfAuthoritiesCategories_typekey")
  var WordDotTablesOfAuthoritiesCategories_typekey: TablesOfAuthoritiesCategories = js.native
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
  implicit class TablesOfAuthoritiesCategoriesOps[Self <: TablesOfAuthoritiesCategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => TableOfAuthoritiesCategory): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTablesOfAuthoritiesCategories_typekey(value: TablesOfAuthoritiesCategories): Self = this.set("Word.TablesOfAuthoritiesCategories_typekey", value.asInstanceOf[js.Any])
  }
}
