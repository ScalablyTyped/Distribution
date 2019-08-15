package typings.animejs.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeInstanceParams extends AnimeCallBack {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[DirectionOptions | String] = js.undefined
  var loop: js.UndefOr[Double | Boolean] = js.undefined
}

object AnimeInstanceParams {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    begin: AnimeCallbackFunction = null,
    change: AnimeCallbackFunction = null,
    changeBegin: AnimeCallbackFunction = null,
    changeComplete: AnimeCallbackFunction = null,
    complete: AnimeCallbackFunction = null,
    direction: DirectionOptions | String = null,
    loop: Double | Boolean = null,
    loopBegin: AnimeCallbackFunction = null,
    loopComplete: AnimeCallbackFunction = null,
    update: AnimeCallbackFunction = null
  ): AnimeInstanceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (change != null) __obj.updateDynamic("change")(change)
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(changeBegin)
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(changeComplete)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(loopBegin)
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(loopComplete)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeInstanceParams]
  }
}

