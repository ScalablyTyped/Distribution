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
    begin: /* anim */ AnimeInstance => Unit = null,
    change: /* anim */ AnimeInstance => Unit = null,
    changeBegin: /* anim */ AnimeInstance => Unit = null,
    changeComplete: /* anim */ AnimeInstance => Unit = null,
    complete: /* anim */ AnimeInstance => Unit = null,
    direction: DirectionOptions | String = null,
    loop: Double | Boolean = null,
    loopBegin: /* anim */ AnimeInstance => Unit = null,
    loopComplete: /* anim */ AnimeInstance => Unit = null,
    update: /* anim */ AnimeInstance => Unit = null
  ): AnimeInstanceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1(changeBegin))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1(changeComplete))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1(loopBegin))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1(loopComplete))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnimeInstanceParams]
  }
}

