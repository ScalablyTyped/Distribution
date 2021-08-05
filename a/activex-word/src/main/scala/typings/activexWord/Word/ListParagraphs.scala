package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListParagraphs extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Paragraph
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.ListParagraphs_typekey")
  var WordDotListParagraphs_typekey: ListParagraphs
}
object ListParagraphs {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Paragraph,
    Parent: js.Any,
    WordDotListParagraphs_typekey: ListParagraphs
  ): ListParagraphs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListParagraphs_typekey")(WordDotListParagraphs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParagraphs]
  }
  
  extension [Self <: ListParagraphs](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Paragraph): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotListParagraphs_typekey(value: ListParagraphs): Self = StObject.set(x, "Word.ListParagraphs_typekey", value.asInstanceOf[js.Any])
  }
}
