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
  
  @scala.inline
  def apply(set: (Dictionary[js.Any, js.Any], Item, js.Array[js.Any], js.Any) => Unit): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  @scala.inline
  implicit class ActiveXObjectMutableBuilder[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSet(value: (Dictionary[js.Any, js.Any], Item, js.Array[js.Any], js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
  }
}
