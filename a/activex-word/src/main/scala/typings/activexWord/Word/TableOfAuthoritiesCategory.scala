package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOfAuthoritiesCategory extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Index: Double = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.TableOfAuthoritiesCategory_typekey")
  var WordDotTableOfAuthoritiesCategory_typekey: TableOfAuthoritiesCategory = js.native
}
object TableOfAuthoritiesCategory {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotTableOfAuthoritiesCategory_typekey: TableOfAuthoritiesCategory
  ): TableOfAuthoritiesCategory = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfAuthoritiesCategory_typekey")(WordDotTableOfAuthoritiesCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfAuthoritiesCategory]
  }
  
  @scala.inline
  implicit class TableOfAuthoritiesCategoryMutableBuilder[Self <: TableOfAuthoritiesCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTableOfAuthoritiesCategory_typekey(value: TableOfAuthoritiesCategory): Self = StObject.set(x, "Word.TableOfAuthoritiesCategory_typekey", value.asInstanceOf[js.Any])
  }
}
