package typings.adone.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends LocalStreamConstructorOptions {
  /**
    * Used for relative pathing of files. Typically where a glob starts.
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * Whether to match dotted files (hidden). Default: true
    */
  var dot: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    base: String = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    read: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[MapOptions]
  }
}

