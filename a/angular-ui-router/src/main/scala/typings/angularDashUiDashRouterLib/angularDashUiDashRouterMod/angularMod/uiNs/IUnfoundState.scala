package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnfoundState extends js.Object {
  var options: IStateOptions
  var to: java.lang.String
}

object IUnfoundState {
  @scala.inline
  def apply(options: IStateOptions, to: java.lang.String): IUnfoundState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[IUnfoundState]
  }
}

