package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomProperties extends StObject {
  
  def Add(Name: String, Value: String): CustomProperty
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): CustomProperty
  
  val Parent: Any
  
  /* private */ @JSName("Word.CustomProperties_typekey")
  var WordDotCustomProperties_typekey: CustomProperties
}
object CustomProperties {
  
  inline def apply(
    Add: (String, String) => CustomProperty,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => CustomProperty,
    Parent: Any,
    WordDotCustomProperties_typekey: CustomProperties
  ): CustomProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomProperties_typekey")(WordDotCustomProperties_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperties]
  }
  
  extension [Self <: CustomProperties](x: Self) {
    
    inline def setAdd(value: (String, String) => CustomProperty): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => CustomProperty): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotCustomProperties_typekey(value: CustomProperties): Self = StObject.set(x, "Word.CustomProperties_typekey", value.asInstanceOf[js.Any])
  }
}
