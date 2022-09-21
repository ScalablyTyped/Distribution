package typings.activexScripting

import typings.activexScripting.Scripting.Dictionary
import typings.activexScripting.activexScriptingStrings.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  @JSName("set")
  def set_Item[TKey, TValue](
    obj: Dictionary[TKey, TValue],
    propertyName: Item,
    parameterTypes: js.Array[TKey],
    newValue: TValue
  ): Unit
}
object ActiveXObject {
  
  inline def apply(set: (Dictionary[Any, Any], Item, js.Array[Any], Any) => Unit): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setSet(value: (Dictionary[Any, Any], Item, js.Array[Any], Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
  }
}
