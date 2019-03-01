package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.alertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlertOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var controller: js.UndefOr[js.Any] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  var dismissable: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* alert */ IAlert, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* alert */ IAlert, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* alert */ IAlert, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* alert */ IAlert, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IAlertOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    container: java.lang.String | scala.Boolean = null,
    content: java.lang.String = null,
    controller: js.Any = null,
    controllerAs: java.lang.String = null,
    dismissable: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Double | scala.Boolean = null,
    onBeforeHide: js.Function1[/* alert */ IAlert, scala.Unit] = null,
    onBeforeShow: js.Function1[/* alert */ IAlert, scala.Unit] = null,
    onHide: js.Function1[/* alert */ IAlert, scala.Unit] = null,
    onShow: js.Function1[/* alert */ IAlert, scala.Unit] = null,
    placement: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): IAlertOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(onBeforeHide)
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(onBeforeShow)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAlertOptions]
  }
}

