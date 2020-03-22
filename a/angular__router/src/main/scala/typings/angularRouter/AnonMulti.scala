package typings.angularRouter

import org.scalablytyped.runtime.Instantiable1
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Injector
import typings.angularRouter.mod.ɵangularPackagesRouterRouterH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMulti extends js.Object {
  var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]] = js.native
  var multi: js.UndefOr[scala.Nothing] = js.native
  var provide: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
  var useExisting: js.UndefOr[scala.Nothing] = js.native
  @JSName("useFactory")
  var useFactory_Original: js.Function1[
    /* r */ ɵangularPackagesRouterRouterH, 
    js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit]
  ] = js.native
  def useFactory(r: ɵangularPackagesRouterRouterH): js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit] = js.native
}

