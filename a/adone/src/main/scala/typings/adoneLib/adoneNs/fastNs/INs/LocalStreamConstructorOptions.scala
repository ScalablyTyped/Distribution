package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStreamConstructorOptions extends js.Object {
  /**
    * Read files as buffers. Default: true
    */
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Current working directory for files. Default: process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to read files. Default: true
    */
  var read: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Read files as streams
    */
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object LocalStreamConstructorOptions {
  @scala.inline
  def apply(
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    read: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined
  ): LocalStreamConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[LocalStreamConstructorOptions]
  }
}

