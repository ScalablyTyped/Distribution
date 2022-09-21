package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCorrectionsExceptions extends StObject {
  
  def Add(Name: String): OtherCorrectionsException
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): OtherCorrectionsException
  
  val Parent: Any
  
  /* private */ @JSName("Word.OtherCorrectionsExceptions_typekey")
  var WordDotOtherCorrectionsExceptions_typekey: OtherCorrectionsExceptions
}
object OtherCorrectionsExceptions {
  
  inline def apply(
    Add: String => OtherCorrectionsException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => OtherCorrectionsException,
    Parent: Any,
    WordDotOtherCorrectionsExceptions_typekey: OtherCorrectionsExceptions
  ): OtherCorrectionsExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OtherCorrectionsExceptions_typekey")(WordDotOtherCorrectionsExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCorrectionsExceptions]
  }
  
  extension [Self <: OtherCorrectionsExceptions](x: Self) {
    
    inline def setAdd(value: String => OtherCorrectionsException): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => OtherCorrectionsException): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOtherCorrectionsExceptions_typekey(value: OtherCorrectionsExceptions): Self = StObject.set(x, "Word.OtherCorrectionsExceptions_typekey", value.asInstanceOf[js.Any])
  }
}
