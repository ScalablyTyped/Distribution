package typings
package apostropheLib.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apostrophe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val adminBar: apostropheLib.Anon_CallbackLink = js.native
  val contextPiece: apostropheLib.Anon_IdSlug = js.native
  val docs: apostropheLib.Anon_CallbackGetManager = js.native
  val modalSupport: apostropheLib.Anon_All = js.native
  val modules: js.Object = js.native
  val moogBundle: apostropheLib.Anon_Directory = js.native
  val pages: apostropheLib.Anon_Page = js.native
  val schemas: apostropheLib.Anon_CallbackConvert = js.native
  val ui: apostropheLib.Anon_Callback = js.native
  val utils: apostropheLib.Anon_CamelName = js.native
  val versions: apostropheLib.Anon_AfterRevert = js.native
  def apply(
    options: apostropheLib.apostropheMod.apostropheNs.AposConstructor[js.Object, js.Object],
    args: js.Any*
  ): js.Any = js.native
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
  def notify(message: java.lang.String, options: apostropheLib.apostropheMod.apostropheNs.AposObject): js.Any = js.native
  def notify(message: js.Object, options: apostropheLib.apostropheMod.apostropheNs.AposObject): js.Any = js.native
  def off(eventName: java.lang.String): js.Any = js.native
  def off(eventName: java.lang.String, fn: js.Function0[_]): js.Any = js.native
  def on(eventName: java.lang.String): js.Any = js.native
  def on(eventName: java.lang.String, fn: js.Function0[_]): js.Any = js.native
}

