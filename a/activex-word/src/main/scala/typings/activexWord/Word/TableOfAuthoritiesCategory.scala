package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOfAuthoritiesCategory extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Index: Double
  
  var Name: String
  
  val Parent: Any
  
  /* private */ @JSName("Word.TableOfAuthoritiesCategory_typekey")
  var WordDotTableOfAuthoritiesCategory_typekey: TableOfAuthoritiesCategory
}
object TableOfAuthoritiesCategory {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: Any,
    WordDotTableOfAuthoritiesCategory_typekey: TableOfAuthoritiesCategory
  ): TableOfAuthoritiesCategory = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfAuthoritiesCategory_typekey")(WordDotTableOfAuthoritiesCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfAuthoritiesCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableOfAuthoritiesCategory] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTableOfAuthoritiesCategory_typekey(value: TableOfAuthoritiesCategory): Self = StObject.set(x, "Word.TableOfAuthoritiesCategory_typekey", value.asInstanceOf[js.Any])
  }
}
