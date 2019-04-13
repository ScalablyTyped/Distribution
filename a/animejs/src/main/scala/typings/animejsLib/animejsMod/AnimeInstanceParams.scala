package typings
package animejsLib.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeInstanceParams extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var begin: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var complete: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var direction: js.UndefOr[DirectionOptions | java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var run: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
  var update: js.UndefOr[animejsLib.AnimeCallbackFunction] = js.undefined
}

object AnimeInstanceParams {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    begin: animejsLib.AnimeCallbackFunction = null,
    complete: animejsLib.AnimeCallbackFunction = null,
    direction: DirectionOptions | java.lang.String = null,
    loop: scala.Double | scala.Boolean = null,
    run: animejsLib.AnimeCallbackFunction = null,
    update: animejsLib.AnimeCallbackFunction = null
  ): AnimeInstanceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeInstanceParams]
  }
}

