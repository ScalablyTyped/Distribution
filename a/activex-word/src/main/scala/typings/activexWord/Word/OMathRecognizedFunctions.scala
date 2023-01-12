package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathRecognizedFunctions extends StObject {
  
  def Add(Name: String): OMathRecognizedFunction
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): OMathRecognizedFunction
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMathRecognizedFunctions_typekey")
  var WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
}
object OMathRecognizedFunctions {
  
  inline def apply(
    Add: String => OMathRecognizedFunction,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => OMathRecognizedFunction,
    Parent: Any,
    WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
  ): OMathRecognizedFunctions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRecognizedFunctions_typekey")(WordDotOMathRecognizedFunctions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRecognizedFunctions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OMathRecognizedFunctions] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: String => OMathRecognizedFunction): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => OMathRecognizedFunction): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathRecognizedFunctions_typekey(value: OMathRecognizedFunctions): Self = StObject.set(x, "Word.OMathRecognizedFunctions_typekey", value.asInstanceOf[js.Any])
  }
}
