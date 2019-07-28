package typings.atAngularPlatformDashBrowser

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssProps extends js.Object {
  var cssProps: js.UndefOr[js.Any] = js.undefined
  var domEvents: js.UndefOr[Boolean] = js.undefined
  var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ js.Any, Boolean])] = js.undefined
  var inputClass: js.UndefOr[js.Any] = js.undefined
  var inputTarget: js.UndefOr[EventTarget] = js.undefined
  var preset: js.UndefOr[js.Array[_]] = js.undefined
  var recognizers: js.UndefOr[js.Array[_]] = js.undefined
  var touchAction: js.UndefOr[String] = js.undefined
}

object Anon_CssProps {
  @scala.inline
  def apply(
    cssProps: js.Any = null,
    domEvents: js.UndefOr[Boolean] = js.undefined,
    enable: Boolean | (js.Function1[/* manager */ js.Any, Boolean]) = null,
    inputClass: js.Any = null,
    inputTarget: EventTarget = null,
    preset: js.Array[_] = null,
    recognizers: js.Array[_] = null,
    touchAction: String = null
  ): Anon_CssProps = {
    val __obj = js.Dynamic.literal()
    if (cssProps != null) __obj.updateDynamic("cssProps")(cssProps)
    if (!js.isUndefined(domEvents)) __obj.updateDynamic("domEvents")(domEvents)
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass)
    if (inputTarget != null) __obj.updateDynamic("inputTarget")(inputTarget)
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers)
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction)
    __obj.asInstanceOf[Anon_CssProps]
  }
}

