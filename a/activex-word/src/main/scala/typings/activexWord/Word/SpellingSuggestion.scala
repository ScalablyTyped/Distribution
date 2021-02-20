package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpellingSuggestion extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.SpellingSuggestion_typekey")
  var WordDotSpellingSuggestion_typekey: SpellingSuggestion = js.native
}
object SpellingSuggestion {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    WordDotSpellingSuggestion_typekey: SpellingSuggestion
  ): SpellingSuggestion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SpellingSuggestion_typekey")(WordDotSpellingSuggestion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingSuggestion]
  }
  
  @scala.inline
  implicit class SpellingSuggestionMutableBuilder[Self <: SpellingSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSpellingSuggestion_typekey(value: SpellingSuggestion): Self = StObject.set(x, "Word.SpellingSuggestion_typekey", value.asInstanceOf[js.Any])
  }
}
