package typings
package antdLib.libTableCreateStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def getState(): js.Any
  def setState(partial: js.Object): scala.Unit
  def subscribe(listener: js.Function0[scala.Unit]): js.Function0[scala.Unit]
}

object Store {
  @scala.inline
  def apply(
    getState: js.Function0[js.Any],
    setState: js.Function1[js.Object, scala.Unit],
    subscribe: js.Function1[js.Function0[scala.Unit], js.Function0[scala.Unit]]
  ): Store = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("setState")(setState)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[Store]
  }
}

