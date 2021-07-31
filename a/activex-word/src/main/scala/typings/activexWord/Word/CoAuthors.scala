package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoAuthors extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): CoAuthor
  
  val Parent: js.Any
  
  @JSName("Word.CoAuthors_typekey")
  var WordDotCoAuthors_typekey: CoAuthors
}
object CoAuthors {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => CoAuthor,
    Parent: js.Any,
    WordDotCoAuthors_typekey: CoAuthors
  ): CoAuthors = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthors_typekey")(WordDotCoAuthors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthors]
  }
  
  @scala.inline
  implicit class CoAuthorsMutableBuilder[Self <: CoAuthors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => CoAuthor): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCoAuthors_typekey(value: CoAuthors): Self = StObject.set(x, "Word.CoAuthors_typekey", value.asInstanceOf[js.Any])
  }
}
