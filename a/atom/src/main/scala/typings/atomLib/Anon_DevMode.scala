package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DevMode extends js.Object {
  var devMode: js.UndefOr[scala.Boolean] = js.undefined
  var newWindow: js.UndefOr[scala.Boolean] = js.undefined
  var pathsToOpen: js.Array[java.lang.String]
  var safeMode: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DevMode {
  @scala.inline
  def apply(
    pathsToOpen: js.Array[java.lang.String],
    devMode: js.UndefOr[scala.Boolean] = js.undefined,
    newWindow: js.UndefOr[scala.Boolean] = js.undefined,
    safeMode: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DevMode = {
    val __obj = js.Dynamic.literal(pathsToOpen = pathsToOpen)
    if (!js.isUndefined(devMode)) __obj.updateDynamic("devMode")(devMode)
    if (!js.isUndefined(newWindow)) __obj.updateDynamic("newWindow")(newWindow)
    if (!js.isUndefined(safeMode)) __obj.updateDynamic("safeMode")(safeMode)
    __obj.asInstanceOf[Anon_DevMode]
  }
}

