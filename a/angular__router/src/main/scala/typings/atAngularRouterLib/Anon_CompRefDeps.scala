package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompRefDeps extends js.Object {
  var deps: js.UndefOr[scala.Nothing] = js.undefined
  var multi: scala.Boolean
  var provide: atAngularCoreLib.atAngularCoreMod.InjectionToken[
    js.Array[
      js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[_], scala.Unit]
    ]
  ]
  var useExisting: atAngularCoreLib.atAngularCoreMod.InjectionToken[
    js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[_], scala.Unit]
  ]
  var useFactory: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_CompRefDeps {
  @scala.inline
  def apply(
    multi: scala.Boolean,
    provide: atAngularCoreLib.atAngularCoreMod.InjectionToken[
      js.Array[
        js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[_], scala.Unit]
      ]
    ],
    useExisting: atAngularCoreLib.atAngularCoreMod.InjectionToken[
      js.Function1[/* compRef */ atAngularCoreLib.atAngularCoreMod.ComponentRef[_], scala.Unit]
    ],
    deps: js.UndefOr[scala.Nothing] = js.undefined,
    useFactory: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_CompRefDeps = {
    val __obj = js.Dynamic.literal(multi = multi, provide = provide, useExisting = useExisting)
    if (!js.isUndefined(deps)) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(useFactory)) __obj.updateDynamic("useFactory")(useFactory)
    __obj.asInstanceOf[Anon_CompRefDeps]
  }
}

