package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sentences extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  val First: Range
  
  def Item(Index: Double): Range
  
  val Last: Range
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.Sentences_typekey")
  var WordDotSentences_typekey: Sentences
}
object Sentences {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    First: Range,
    Item: Double => Range,
    Last: Range,
    Parent: js.Any,
    WordDotSentences_typekey: Sentences
  ): Sentences = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Last = Last.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Sentences_typekey")(WordDotSentences_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentences]
  }
  
  extension [Self <: Sentences](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Range): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLast(value: Range): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotSentences_typekey(value: Sentences): Self = StObject.set(x, "Word.Sentences_typekey", value.asInstanceOf[js.Any])
  }
}
