package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLChildNodeSuggestions extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): XMLChildNodeSuggestion = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.XMLChildNodeSuggestions_typekey")
  var WordDotXMLChildNodeSuggestions_typekey: XMLChildNodeSuggestions = js.native
}
object XMLChildNodeSuggestions {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => XMLChildNodeSuggestion,
    Parent: js.Any,
    WordDotXMLChildNodeSuggestions_typekey: XMLChildNodeSuggestions
  ): XMLChildNodeSuggestions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.XMLChildNodeSuggestions_typekey")(WordDotXMLChildNodeSuggestions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLChildNodeSuggestions]
  }
  
  @scala.inline
  implicit class XMLChildNodeSuggestionsMutableBuilder[Self <: XMLChildNodeSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => XMLChildNodeSuggestion): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotXMLChildNodeSuggestions_typekey(value: XMLChildNodeSuggestions): Self = StObject.set(x, "Word.XMLChildNodeSuggestions_typekey", value.asInstanceOf[js.Any])
  }
}
