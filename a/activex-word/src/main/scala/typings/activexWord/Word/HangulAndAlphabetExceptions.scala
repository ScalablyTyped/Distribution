package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HangulAndAlphabetExceptions extends StObject {
  
  def Add(Name: String): HangulAndAlphabetException
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): HangulAndAlphabetException
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.HangulAndAlphabetExceptions_typekey")
  var WordDotHangulAndAlphabetExceptions_typekey: HangulAndAlphabetExceptions
}
object HangulAndAlphabetExceptions {
  
  inline def apply(
    Add: String => HangulAndAlphabetException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => HangulAndAlphabetException,
    Parent: js.Any,
    WordDotHangulAndAlphabetExceptions_typekey: HangulAndAlphabetExceptions
  ): HangulAndAlphabetExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HangulAndAlphabetExceptions_typekey")(WordDotHangulAndAlphabetExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HangulAndAlphabetExceptions]
  }
  
  extension [Self <: HangulAndAlphabetExceptions](x: Self) {
    
    inline def setAdd(value: String => HangulAndAlphabetException): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => HangulAndAlphabetException): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotHangulAndAlphabetExceptions_typekey(value: HangulAndAlphabetExceptions): Self = StObject.set(x, "Word.HangulAndAlphabetExceptions_typekey", value.asInstanceOf[js.Any])
  }
}
