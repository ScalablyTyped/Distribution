package typings
package apostropheLib.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val modules: js.Object = js.native
  def apply(options: AposConstructor[js.Object, js.Object], args: js.Any*): js.Any = js.native
  def change(arg: java.lang.String): js.Any = js.native
  def change(arg: js.Object): js.Any = js.native
  def create(`type`: java.lang.String, options: js.Any): js.Any = js.native
  def create(`type`: java.lang.String, options: js.Any, callback: js.Function0[_]): js.Any = js.native
  def define(`type`: java.lang.String, definition: js.Any): js.Any = js.native
  def define(`type`: java.lang.String, definition: js.Any, extending: js.Any): js.Any = js.native
  def define(`type`: js.Array[java.lang.String], definition: js.Any): js.Any = js.native
  def define(`type`: js.Array[java.lang.String], definition: js.Any, extending: js.Any): js.Any = js.native
  def emit(name: java.lang.String): js.Any = js.native
  def emit(name: java.lang.String, arg: js.Any): js.Any = js.native
  def notify(message: java.lang.String, options: AposObject): js.Any = js.native
  def notify(message: js.Object, options: AposObject): js.Any = js.native
  def off(eventName: java.lang.String): js.Any = js.native
  def off(eventName: java.lang.String, fn: js.Function0[_]): js.Any = js.native
  def on(eventName: java.lang.String): js.Any = js.native
  def on(eventName: java.lang.String, fn: js.Function0[_]): js.Any = js.native
}

