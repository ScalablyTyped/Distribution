package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sentences extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val First: Range = js.native
  
  def Item(Index: Double): Range = js.native
  
  val Last: Range = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Sentences_typekey")
  var WordDotSentences_typekey: Sentences = js.native
}
object Sentences {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SentencesMutableBuilder[Self <: Sentences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Range): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLast(value: Range): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSentences_typekey(value: Sentences): Self = StObject.set(x, "Word.Sentences_typekey", value.asInstanceOf[js.Any])
  }
}
