package typings.angularToastr.mod.angularAugmentingMod.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastContainerConfig extends js.Object {
  var autoDismiss: js.UndefOr[Boolean] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var maxOpened: js.UndefOr[Double] = js.undefined
  var newestOnTop: js.UndefOr[Boolean] = js.undefined
  var positionClass: js.UndefOr[String] = js.undefined
  var preventDuplicates: js.UndefOr[Boolean] = js.undefined
  var preventOpenDuplicates: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object IToastContainerConfig {
  @scala.inline
  def apply(
    autoDismiss: js.UndefOr[Boolean] = js.undefined,
    containerId: String = null,
    maxOpened: js.UndefOr[Double] = js.undefined,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    positionClass: String = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    preventOpenDuplicates: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): IToastContainerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss.get.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOpened)) __obj.updateDynamic("maxOpened")(maxOpened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop.get.asInstanceOf[js.Any])
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventOpenDuplicates)) __obj.updateDynamic("preventOpenDuplicates")(preventOpenDuplicates.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastContainerConfig]
  }
}

