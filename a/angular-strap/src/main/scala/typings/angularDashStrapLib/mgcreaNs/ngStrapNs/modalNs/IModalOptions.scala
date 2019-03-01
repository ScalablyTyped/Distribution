package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.modalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var backdropAnimation: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var contentTemplate: js.UndefOr[java.lang.String] = js.undefined
  var controller: js.UndefOr[js.Any] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var locals: js.UndefOr[js.Any] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* modal */ IModal, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* modal */ IModal, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* modal */ IModal, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* modal */ IModal, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var prefixEvent: js.UndefOr[java.lang.String] = js.undefined
  var resolve: js.UndefOr[js.Any] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IModalOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    backdrop: scala.Boolean | java.lang.String = null,
    backdropAnimation: java.lang.String = null,
    container: java.lang.String | scala.Boolean = null,
    content: java.lang.String = null,
    contentTemplate: java.lang.String = null,
    controller: js.Any = null,
    controllerAs: java.lang.String = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    locals: js.Any = null,
    onBeforeHide: js.Function1[/* modal */ IModal, scala.Unit] = null,
    onBeforeShow: js.Function1[/* modal */ IModal, scala.Unit] = null,
    onHide: js.Function1[/* modal */ IModal, scala.Unit] = null,
    onShow: js.Function1[/* modal */ IModal, scala.Unit] = null,
    placement: java.lang.String = null,
    prefixEvent: java.lang.String = null,
    resolve: js.Any = null,
    scope: angularLib.angularMod.angularNs.IScope = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    title: java.lang.String = null
  ): IModalOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropAnimation != null) __obj.updateDynamic("backdropAnimation")(backdropAnimation)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(onBeforeHide)
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(onBeforeShow)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixEvent != null) __obj.updateDynamic("prefixEvent")(prefixEvent)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IModalOptions]
  }
}

