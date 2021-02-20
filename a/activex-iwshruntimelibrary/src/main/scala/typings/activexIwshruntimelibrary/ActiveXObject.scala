package typings.activexIwshruntimelibrary

import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshEnvironment
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  @JSName("set")
  def set_Item(obj: WshEnvironment, propertyName: Item, parameterTypes: js.Array[String], newValue: String): Unit = js.native
}
object ActiveXObject {
  
  @scala.inline
  def apply(set: (WshEnvironment, Item, js.Array[String], String) => Unit): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  @scala.inline
  implicit class ActiveXObjectMutableBuilder[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSet(value: (WshEnvironment, Item, js.Array[String], String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
  }
}
