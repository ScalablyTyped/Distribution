package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListParagraphs extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Paragraph = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.ListParagraphs_typekey")
  var WordDotListParagraphs_typekey: ListParagraphs = js.native
}
object ListParagraphs {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ListParagraphsMutableBuilder[Self <: ListParagraphs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Paragraph): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotListParagraphs_typekey(value: ListParagraphs): Self = StObject.set(x, "Word.ListParagraphs_typekey", value.asInstanceOf[js.Any])
  }
}
