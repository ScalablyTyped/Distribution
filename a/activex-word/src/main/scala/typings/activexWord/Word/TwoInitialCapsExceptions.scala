package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwoInitialCapsExceptions extends StObject {
  
  def Add(Name: String): TwoInitialCapsException
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): TwoInitialCapsException
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.TwoInitialCapsExceptions_typekey")
  var WordDotTwoInitialCapsExceptions_typekey: TwoInitialCapsExceptions
}
object TwoInitialCapsExceptions {
  
  inline def apply(
    Add: String => TwoInitialCapsException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => TwoInitialCapsException,
    Parent: js.Any,
    WordDotTwoInitialCapsExceptions_typekey: TwoInitialCapsExceptions
  ): TwoInitialCapsExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TwoInitialCapsExceptions_typekey")(WordDotTwoInitialCapsExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoInitialCapsExceptions]
  }
  
  extension [Self <: TwoInitialCapsExceptions](x: Self) {
    
    inline def setAdd(value: String => TwoInitialCapsException): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => TwoInitialCapsException): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTwoInitialCapsExceptions_typekey(value: TwoInitialCapsExceptions): Self = StObject.set(x, "Word.TwoInitialCapsExceptions_typekey", value.asInstanceOf[js.Any])
  }
}
