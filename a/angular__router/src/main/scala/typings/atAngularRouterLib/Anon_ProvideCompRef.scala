package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ProvideCompRef extends js.Object {
  var deps: js.Array[
    ScalablyTyped.runtime.Instantiable1[
      /* injector */ atAngularCoreLib.coreMod.Injector, 
      atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer
    ]
  ]
  var multi: js.UndefOr[scala.Nothing] = js.undefined
  var provide: atAngularCoreLib.coreMod.InjectionToken[js.Function1[/* compRef */ atAngularCoreLib.coreMod.ComponentRef[_], scala.Unit]]
  var useExisting: js.UndefOr[scala.Nothing] = js.undefined
  var useFactory: js.Function1[/* r */ atAngularRouterLib.srcRouterUnderscoreModuleMod.RouterInitializer, _]
}

