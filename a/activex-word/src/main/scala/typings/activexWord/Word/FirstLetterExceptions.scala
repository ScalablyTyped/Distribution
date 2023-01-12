package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstLetterExceptions extends StObject {
  
  def Add(Name: String): FirstLetterException
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): FirstLetterException
  
  val Parent: Any
  
  /* private */ @JSName("Word.FirstLetterExceptions_typekey")
  var WordDotFirstLetterExceptions_typekey: FirstLetterExceptions
}
object FirstLetterExceptions {
  
  inline def apply(
    Add: String => FirstLetterException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => FirstLetterException,
    Parent: Any,
    WordDotFirstLetterExceptions_typekey: FirstLetterExceptions
  ): FirstLetterExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FirstLetterExceptions_typekey")(WordDotFirstLetterExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstLetterExceptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstLetterExceptions] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: String => FirstLetterException): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => FirstLetterException): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotFirstLetterExceptions_typekey(value: FirstLetterExceptions): Self = StObject.set(x, "Word.FirstLetterExceptions_typekey", value.asInstanceOf[js.Any])
  }
}
