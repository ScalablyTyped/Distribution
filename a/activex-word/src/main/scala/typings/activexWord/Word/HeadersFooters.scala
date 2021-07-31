package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersFooters extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdHeaderFooterIndex): HeaderFooter
  
  val Parent: js.Any
  
  @JSName("Word.HeadersFooters_typekey")
  var WordDotHeadersFooters_typekey: HeadersFooters
}
object HeadersFooters {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdHeaderFooterIndex => HeaderFooter,
    Parent: js.Any,
    WordDotHeadersFooters_typekey: HeadersFooters
  ): HeadersFooters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadersFooters_typekey")(WordDotHeadersFooters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersFooters]
  }
  
  @scala.inline
  implicit class HeadersFootersMutableBuilder[Self <: HeadersFooters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdHeaderFooterIndex => HeaderFooter): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotHeadersFooters_typekey(value: HeadersFooters): Self = StObject.set(x, "Word.HeadersFooters_typekey", value.asInstanceOf[js.Any])
  }
}
