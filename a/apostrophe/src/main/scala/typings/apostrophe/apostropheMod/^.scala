package typings.apostrophe.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val modules: js.Object = js.native
  def apply(options: AposConstructor[js.Object, js.Object], args: js.Any*): js.Any = js.native
  def change(arg: String): js.Any = js.native
  def change(arg: js.Object): js.Any = js.native
  def create(`type`: String, options: js.Any): js.Any = js.native
  def create(`type`: String, options: js.Any, callback: js.Function0[_]): js.Any = js.native
  def define(`type`: String, definition: js.Any): js.Any = js.native
  def define(`type`: String, definition: js.Any, extending: js.Any): js.Any = js.native
  def define(`type`: js.Array[String], definition: js.Any): js.Any = js.native
  def define(`type`: js.Array[String], definition: js.Any, extending: js.Any): js.Any = js.native
  def emit(name: String): js.Any = js.native
  def emit(name: String, arg: js.Any): js.Any = js.native
  def notify(message: String, options: AposObject): js.Any = js.native
  def notify(message: js.Object, options: AposObject): js.Any = js.native
  def off(eventName: String): js.Any = js.native
  def off(eventName: String, fn: js.Function0[_]): js.Any = js.native
  def on(eventName: String): js.Any = js.native
  def on(eventName: String, fn: js.Function0[_]): js.Any = js.native
}

