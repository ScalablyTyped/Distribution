package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  def decorator(): js.Any = js.native
  def decorator(name: java.lang.String): js.Any = js.native
  def decorator(
    name: java.lang.String,
    decorator: js.Function2[/* state */ IState, /* parent */ angularLib.angularMod.Global.Function, _]
  ): js.Any = js.native
  def state(config: IState): IStateProvider = js.native
  def state(name: java.lang.String, config: IState): IStateProvider = js.native
}

