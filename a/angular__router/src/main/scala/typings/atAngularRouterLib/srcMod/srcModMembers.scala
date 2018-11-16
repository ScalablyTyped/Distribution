package typings
package atAngularRouterLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src", JSImport.Namespace)
@js.native
object srcModMembers extends js.Object {
  val PRIMARY_OUTLET: /* primary */ java.lang.String = js.native
  val ROUTER_CONFIGURATION: atAngularCoreLib.coreMod.InjectionToken[atAngularRouterLib.srcRouterUnderscoreModuleMod.ExtraOptions] = js.native
  val ROUTER_INITIALIZER: atAngularCoreLib.coreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.coreMod.ComponentRef[js.Any], scala.Unit]
  ] = js.native
  val ROUTES: atAngularCoreLib.coreMod.InjectionToken[js.Array[js.Array[atAngularRouterLib.srcConfigMod.Route]]] = js.native
  val VERSION: atAngularCoreLib.coreMod.Version = js.native
  val ɵROUTER_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  def convertToParamMap(params: atAngularRouterLib.srcSharedMod.Params): atAngularRouterLib.srcSharedMod.ParamMap = js.native
  def provideRoutes(routes: atAngularRouterLib.srcConfigMod.Routes): js.Any = js.native
  def ɵflatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
}

