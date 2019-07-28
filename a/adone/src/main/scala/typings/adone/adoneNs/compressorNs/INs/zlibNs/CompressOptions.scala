package typings.adone.adoneNs.compressorNs.INs.zlibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends CompressStreamOptions {
  /**
    * If true, returns an object with buffer and engine
    */
  var info: js.UndefOr[Boolean] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    info: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null,
    memLevel: Int | Double = null,
    strategy: Int | Double = null,
    windowBits: Int | Double = null
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

