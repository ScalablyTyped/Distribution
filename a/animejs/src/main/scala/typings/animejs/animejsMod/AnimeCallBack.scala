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
    begin: AnimeCallbackFunction = null,
    change: AnimeCallbackFunction = null,
    changeBegin: AnimeCallbackFunction = null,
    changeComplete: AnimeCallbackFunction = null,
    complete: AnimeCallbackFunction = null,
    loopBegin: AnimeCallbackFunction = null,
    loopComplete: AnimeCallbackFunction = null,
    update: AnimeCallbackFunction = null
  ): AnimeCallBack = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (change != null) __obj.updateDynamic("change")(change)
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(changeBegin)
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(changeComplete)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(loopBegin)
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(loopComplete)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeCallBack]
  }
}

