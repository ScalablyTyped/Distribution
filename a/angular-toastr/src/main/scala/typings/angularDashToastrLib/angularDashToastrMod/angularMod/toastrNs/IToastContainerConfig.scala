package typings
package angularDashToastrLib.angularDashToastrMod.angularMod.toastrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastContainerConfig extends js.Object {
  var autoDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var maxOpened: js.UndefOr[scala.Double] = js.undefined
  var newestOnTop: js.UndefOr[scala.Boolean] = js.undefined
  var positionClass: js.UndefOr[java.lang.String] = js.undefined
  var preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  var preventOpenDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object IToastContainerConfig {
  @scala.inline
  def apply(
    autoDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    containerId: java.lang.String = null,
    maxOpened: scala.Int | scala.Double = null,
    newestOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    positionClass: java.lang.String = null,
    preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    preventOpenDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null
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

