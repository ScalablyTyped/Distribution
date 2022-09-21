package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLChildNodeSuggestions extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): XMLChildNodeSuggestion
  
  val Parent: Any
  
  /* private */ @JSName("Word.XMLChildNodeSuggestions_typekey")
  var WordDotXMLChildNodeSuggestions_typekey: XMLChildNodeSuggestions
}
object XMLChildNodeSuggestions {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => XMLChildNodeSuggestion,
    Parent: Any,
    WordDotXMLChildNodeSuggestions_typekey: XMLChildNodeSuggestions
  ): XMLChildNodeSuggestions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.XMLChildNodeSuggestions_typekey")(WordDotXMLChildNodeSuggestions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLChildNodeSuggestions]
  }
  
  extension [Self <: XMLChildNodeSuggestions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => XMLChildNodeSuggestion): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotXMLChildNodeSuggestions_typekey(value: XMLChildNodeSuggestions): Self = StObject.set(x, "Word.XMLChildNodeSuggestions_typekey", value.asInstanceOf[js.Any])
  }
}
