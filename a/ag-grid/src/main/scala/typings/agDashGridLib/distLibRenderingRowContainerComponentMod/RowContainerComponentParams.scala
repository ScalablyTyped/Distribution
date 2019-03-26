package typings
package agDashGridLib.distLibRenderingRowContainerComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowContainerComponentParams extends js.Object {
  var eContainer: stdLib.HTMLElement
  var eViewport: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var hideWhenNoChildren: js.UndefOr[scala.Boolean] = js.undefined
}

object RowContainerComponentParams {
  @scala.inline
  def apply(
    eContainer: stdLib.HTMLElement,
    eViewport: stdLib.HTMLElement = null,
    hideWhenNoChildren: js.UndefOr[scala.Boolean] = js.undefined
  ): RowContainerComponentParams = {
    val __obj = js.Dynamic.literal(eContainer = eContainer)
    if (eViewport != null) __obj.updateDynamic("eViewport")(eViewport)
    if (!js.isUndefined(hideWhenNoChildren)) __obj.updateDynamic("hideWhenNoChildren")(hideWhenNoChildren)
    __obj.asInstanceOf[RowContainerComponentParams]
  }
}

