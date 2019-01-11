package typings
package atAngularRouterLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/public_api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PRIMARY_OUTLET: /* primary */ java.lang.String = js.native
  val ROUTER_CONFIGURATION: atAngularCoreLib.atAngularCoreMod.InjectionToken[atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.atAngularCoreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTES: atAngularCoreLib.atAngularCoreMod.InjectionToken[js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]] = js.native
  val VERSION: atAngularCoreLib.atAngularCoreMod.Version = js.native
  val ɵROUTER_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  def convertToParamMap(params: atAngularRouterLib.srcSharedMod.Params): atAngularRouterLib.srcSharedMod.ParamMap = js.native
  def provideRoutes(routes: atAngularRouterLib.srcConfigMod.Routes): js.Any = js.native
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
}

