package typings.antd.motionMod

import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Motion extends js.Object {
  var leavedClassName: js.UndefOr[String] = js.undefined
  var motionAppear: js.UndefOr[Boolean] = js.undefined
  var motionEnter: js.UndefOr[Boolean] = js.undefined
  var motionLeave: js.UndefOr[Boolean] = js.undefined
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined
  var motionName: js.UndefOr[String] = js.undefined
  var onAppearActive: js.UndefOr[MotionFunc] = js.undefined
  var onAppearEnd: js.UndefOr[MotionFunc] = js.undefined
  var onAppearStart: js.UndefOr[MotionFunc] = js.undefined
  var onEnterActive: js.UndefOr[MotionFunc] = js.undefined
  var onEnterEnd: js.UndefOr[MotionFunc] = js.undefined
  var onEnterStart: js.UndefOr[MotionFunc] = js.undefined
  var onLeaveActive: js.UndefOr[MotionFunc] = js.undefined
  var onLeaveEnd: js.UndefOr[MotionFunc] = js.undefined
  var onLeaveStart: js.UndefOr[MotionFunc] = js.undefined
  var removeOnLeave: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Motion {
  @scala.inline
  def apply(
    leavedClassName: String = null,
    motionAppear: js.UndefOr[Boolean] = js.undefined,
    motionEnter: js.UndefOr[Boolean] = js.undefined,
    motionLeave: js.UndefOr[Boolean] = js.undefined,
    motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined,
    motionName: String = null,
    onAppearActive: /* element */ HTMLElement => CSSProperties = null,
    onAppearEnd: /* element */ HTMLElement => CSSProperties = null,
    onAppearStart: /* element */ HTMLElement => CSSProperties = null,
    onEnterActive: /* element */ HTMLElement => CSSProperties = null,
    onEnterEnd: /* element */ HTMLElement => CSSProperties = null,
    onEnterStart: /* element */ HTMLElement => CSSProperties = null,
    onLeaveActive: /* element */ HTMLElement => CSSProperties = null,
    onLeaveEnd: /* element */ HTMLElement => CSSProperties = null,
    onLeaveStart: /* element */ HTMLElement => CSSProperties = null,
    removeOnLeave: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Motion = {
    val __obj = js.Dynamic.literal()
    if (leavedClassName != null) __obj.updateDynamic("leavedClassName")(leavedClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(motionAppear)) __obj.updateDynamic("motionAppear")(motionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(motionEnter)) __obj.updateDynamic("motionEnter")(motionEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(motionLeave)) __obj.updateDynamic("motionLeave")(motionLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(motionLeaveImmediately)) __obj.updateDynamic("motionLeaveImmediately")(motionLeaveImmediately.asInstanceOf[js.Any])
    if (motionName != null) __obj.updateDynamic("motionName")(motionName.asInstanceOf[js.Any])
    if (onAppearActive != null) __obj.updateDynamic("onAppearActive")(js.Any.fromFunction1(onAppearActive))
    if (onAppearEnd != null) __obj.updateDynamic("onAppearEnd")(js.Any.fromFunction1(onAppearEnd))
    if (onAppearStart != null) __obj.updateDynamic("onAppearStart")(js.Any.fromFunction1(onAppearStart))
    if (onEnterActive != null) __obj.updateDynamic("onEnterActive")(js.Any.fromFunction1(onEnterActive))
    if (onEnterEnd != null) __obj.updateDynamic("onEnterEnd")(js.Any.fromFunction1(onEnterEnd))
    if (onEnterStart != null) __obj.updateDynamic("onEnterStart")(js.Any.fromFunction1(onEnterStart))
    if (onLeaveActive != null) __obj.updateDynamic("onLeaveActive")(js.Any.fromFunction1(onLeaveActive))
    if (onLeaveEnd != null) __obj.updateDynamic("onLeaveEnd")(js.Any.fromFunction1(onLeaveEnd))
    if (onLeaveStart != null) __obj.updateDynamic("onLeaveStart")(js.Any.fromFunction1(onLeaveStart))
    if (!js.isUndefined(removeOnLeave)) __obj.updateDynamic("removeOnLeave")(removeOnLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Motion]
  }
}

