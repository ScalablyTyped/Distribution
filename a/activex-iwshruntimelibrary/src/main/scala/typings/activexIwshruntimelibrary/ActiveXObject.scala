package typings.activexIwshruntimelibrary

import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshEnvironment
import typings.activexIwshruntimelibrary.activexIwshruntimelibraryStrings.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item(obj: WshEnvironment, propertyName: Item, parameterTypes: js.Array[String], newValue: String): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(set: (WshEnvironment, Item, js.Array[String], String) => Unit): ActiveXObject = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
}

