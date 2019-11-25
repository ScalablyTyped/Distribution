package typings.agDashGrid.distLibRenderingRowContainerComponentMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowContainerComponentParams extends js.Object {
  var eContainer: HTMLElement
  var eViewport: js.UndefOr[HTMLElement] = js.undefined
  var hideWhenNoChildren: js.UndefOr[Boolean] = js.undefined
}

object RowContainerComponentParams {
  @scala.inline
  def apply(
    eContainer: HTMLElement,
    eViewport: HTMLElement = null,
    hideWhenNoChildren: js.UndefOr[Boolean] = js.undefined
  ): RowContainerComponentParams = {
    val __obj = js.Dynamic.literal(eContainer = eContainer.asInstanceOf[js.Any])
    if (eViewport != null) __obj.updateDynamic("eViewport")(eViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(hideWhenNoChildren)) __obj.updateDynamic("hideWhenNoChildren")(hideWhenNoChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContainerComponentParams]
  }
}

