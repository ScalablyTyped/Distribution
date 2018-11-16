package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", JSImport.Namespace)
@js.native
object aureliaDashDependencyDashInjectionModMembers extends js.Object {
  val _emptyParameters: js.Array[js.Any] = js.native
  val resolver: js.Function with aureliaDashDependencyDashInjectionLib.Anon_Decorates = js.native
  def all(keyValue: js.Any): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def autoinject(): js.Any = js.native
  def autoinject(potentialTarget: js.Any): js.Any = js.native
  def factory(keyValue: js.Any): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def getDecoratorDependencies(target: js.Any): js.Any = js.native
  def inject(rest: js.Any*): js.Any = js.native
  def invokeAsFactory(): js.Any = js.native
  def invokeAsFactory(potentialTarget: js.Any): js.Any = js.native
  def invoker(value: Invoker): js.Any = js.native
  def `lazy`(keyValue: js.Any): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def newInstance(): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def newInstance(asKeyOrTarget: js.Any, dynamicDependencies: js.Any*): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def optional(): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def optional(checkParentOrTarget: scala.Boolean): js.Function3[/* target */ js.Any, /* key */ js.Any, /* index */ js.Any, scala.Unit] = js.native
  def parent(target: js.Any, key: js.Any, index: js.Any): scala.Unit = js.native
  def registration(value: Registration): js.Any = js.native
  def singleton(): js.Any = js.native
  def singleton(keyOrRegisterInChild: js.Any): js.Any = js.native
  def singleton(keyOrRegisterInChild: js.Any, registerInChild: scala.Boolean): js.Any = js.native
  def transient(): js.Any = js.native
  def transient(key: js.Any): js.Any = js.native
}

