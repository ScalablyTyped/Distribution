package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.asideNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsideOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var contentTemplate: js.UndefOr[java.lang.String] = js.undefined
  var controller: js.UndefOr[js.Any] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* aside */ IAside, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* aside */ IAside, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* aside */ IAside, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* aside */ IAside, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IAsideOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    backdrop: scala.Boolean | java.lang.String = null,
    container: java.lang.String | scala.Boolean = null,
    content: java.lang.String = null,
    contentTemplate: java.lang.String = null,
    controller: js.Any = null,
    controllerAs: java.lang.String = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    onBeforeHide: /* aside */ IAside => scala.Unit = null,
    onBeforeShow: /* aside */ IAside => scala.Unit = null,
    onHide: /* aside */ IAside => scala.Unit = null,
    onShow: /* aside */ IAside => scala.Unit = null,
    placement: java.lang.String = null,
    scope: angularLib.angularMod.angularNs.IScope = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    title: java.lang.String = null
  ): IAsideOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IAsideOptions]
  }
}

