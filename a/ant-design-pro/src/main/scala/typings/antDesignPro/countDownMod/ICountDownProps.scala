package typings.antDesignPro.countDownMod

import typings.react.mod.CSSProperties
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountDownProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: Date | Double
}

object ICountDownProps {
  @scala.inline
  def apply(
    target: Date | Double,
    format: /* time */ Double => Unit = null,
    onEnd: () => Unit = null,
    style: CSSProperties = null
  ): ICountDownProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountDownProps]
  }
}

