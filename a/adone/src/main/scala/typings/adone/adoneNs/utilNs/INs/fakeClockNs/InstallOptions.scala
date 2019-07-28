package typings.adone.adoneNs.utilNs.INs.fakeClockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOptions extends js.Object {
  var advanceTimeDelta: js.UndefOr[Double] = js.undefined
  var loopLimit: js.UndefOr[Double] = js.undefined
  var now: js.UndefOr[Double] = js.undefined
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Object] = js.undefined
  var toFake: js.UndefOr[js.Array[String]] = js.undefined
}

object InstallOptions {
  @scala.inline
  def apply(
    advanceTimeDelta: Int | Double = null,
    loopLimit: Int | Double = null,
    now: Int | Double = null,
    shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined,
    target: js.Object = null,
    toFake: js.Array[String] = null
  ): InstallOptions = {
    val __obj = js.Dynamic.literal()
    if (advanceTimeDelta != null) __obj.updateDynamic("advanceTimeDelta")(advanceTimeDelta.asInstanceOf[js.Any])
    if (loopLimit != null) __obj.updateDynamic("loopLimit")(loopLimit.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAdvanceTime)) __obj.updateDynamic("shouldAdvanceTime")(shouldAdvanceTime)
    if (target != null) __obj.updateDynamic("target")(target)
    if (toFake != null) __obj.updateDynamic("toFake")(toFake)
    __obj.asInstanceOf[InstallOptions]
  }
}

