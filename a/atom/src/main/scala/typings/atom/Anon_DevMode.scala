package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DevMode extends js.Object {
  var devMode: js.UndefOr[Boolean] = js.undefined
  var newWindow: js.UndefOr[Boolean] = js.undefined
  var pathsToOpen: js.Array[String]
  var safeMode: js.UndefOr[Boolean] = js.undefined
}

object Anon_DevMode {
  @scala.inline
  def apply(
    pathsToOpen: js.Array[String],
    devMode: js.UndefOr[Boolean] = js.undefined,
    newWindow: js.UndefOr[Boolean] = js.undefined,
    safeMode: js.UndefOr[Boolean] = js.undefined
  ): Anon_DevMode = {
    val __obj = js.Dynamic.literal(pathsToOpen = pathsToOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(devMode)) __obj.updateDynamic("devMode")(devMode.asInstanceOf[js.Any])
    if (!js.isUndefined(newWindow)) __obj.updateDynamic("newWindow")(newWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(safeMode)) __obj.updateDynamic("safeMode")(safeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DevMode]
  }
}

