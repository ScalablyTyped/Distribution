package typings.angularDashToastr.angularDashToastrMod.angularMod.toastr

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
    maxOpened: Int | Double = null,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    positionClass: String = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    preventOpenDuplicates: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): IToastContainerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (maxOpened != null) __obj.updateDynamic("maxOpened")(maxOpened.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop)
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass)
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates)
    if (!js.isUndefined(preventOpenDuplicates)) __obj.updateDynamic("preventOpenDuplicates")(preventOpenDuplicates)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IToastContainerConfig]
  }
}

