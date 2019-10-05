package typings.animejs.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeCallBack extends js.Object {
  var begin: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var change: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var changeBegin: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var changeComplete: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var complete: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var loopBegin: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var loopComplete: js.UndefOr[AnimeCallbackFunction] = js.undefined
  var update: js.UndefOr[AnimeCallbackFunction] = js.undefined
}

object AnimeCallBack {
  @scala.inline
  def apply(
    begin: /* anim */ AnimeInstance => Unit = null,
    change: /* anim */ AnimeInstance => Unit = null,
    changeBegin: /* anim */ AnimeInstance => Unit = null,
    changeComplete: /* anim */ AnimeInstance => Unit = null,
    complete: /* anim */ AnimeInstance => Unit = null,
    loopBegin: /* anim */ AnimeInstance => Unit = null,
    loopComplete: /* anim */ AnimeInstance => Unit = null,
    update: /* anim */ AnimeInstance => Unit = null
  ): AnimeCallBack = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1(changeBegin))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1(changeComplete))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1(loopBegin))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1(loopComplete))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnimeCallBack]
  }
}

