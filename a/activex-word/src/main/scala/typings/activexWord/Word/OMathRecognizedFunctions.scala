package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathRecognizedFunctions extends StObject {
  
  def Add(Name: String): OMathRecognizedFunction
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): OMathRecognizedFunction
  
  val Parent: js.Any
  
  @JSName("Word.OMathRecognizedFunctions_typekey")
  var WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
}
object OMathRecognizedFunctions {
  
  @scala.inline
  def apply(
    Add: String => OMathRecognizedFunction,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathRecognizedFunction,
    Parent: js.Any,
    WordDotOMathRecognizedFunctions_typekey: OMathRecognizedFunctions
  ): OMathRecognizedFunctions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRecognizedFunctions_typekey")(WordDotOMathRecognizedFunctions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRecognizedFunctions]
  }
  
  @scala.inline
  implicit class OMathRecognizedFunctionsMutableBuilder[Self <: OMathRecognizedFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => OMathRecognizedFunction): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => OMathRecognizedFunction): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathRecognizedFunctions_typekey(value: OMathRecognizedFunctions): Self = StObject.set(x, "Word.OMathRecognizedFunctions_typekey", value.asInstanceOf[js.Any])
  }
}
