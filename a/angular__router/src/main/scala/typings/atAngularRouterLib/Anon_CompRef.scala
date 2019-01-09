package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompRef extends js.Object {
  var deps: js.Array[
    org.scalablytyped.runtime.Instantiable1[
      /* injector */ atAngularCoreLib.coreMod.Injector, 
      atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer
    ]
  ] = js.native
  var multi: js.UndefOr[scala.Nothing] = js.native
  var provide: atAngularCoreLib.coreMod.InjectionToken[js.Function1[/* compRef */ atAngularCoreLib.coreMod.ComponentRef[_], scala.Unit]] = js.native
  var useExisting: js.UndefOr[scala.Nothing] = js.native
  @JSName("useFactory")
  var useFactory_Original: js.Function1[/* r */ atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer, _] = js.native
  def useFactory(r: atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer): js.Any = js.native
}

