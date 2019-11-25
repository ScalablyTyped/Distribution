package typings.angularDashStrap.mgcrea.ngStrap.alert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlertOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var controller: js.UndefOr[js.Any] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
  var dismissable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double | Boolean] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IAlertOptions {
  @scala.inline
  def apply(
    animation: String = null,
    container: String | Boolean = null,
    content: String = null,
    controller: js.Any = null,
    controllerAs: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    duration: Double | Boolean = null,
    onBeforeHide: /* alert */ IAlert => Unit = null,
    onBeforeShow: /* alert */ IAlert => Unit = null,
    onHide: /* alert */ IAlert => Unit = null,
    onShow: /* alert */ IAlert => Unit = null,
    placement: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateUrl: String = null,
    title: String = null,
    `type`: String = null
  ): IAlertOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertOptions]
  }
}

