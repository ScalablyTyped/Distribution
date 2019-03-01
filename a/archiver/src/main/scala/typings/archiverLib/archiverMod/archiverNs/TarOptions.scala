package typings
package archiverLib.archiverMod.archiverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TarOptions extends js.Object {
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var gzipOptions: js.UndefOr[nodeLib.zlibMod.ZlibOptions] = js.undefined
}

object TarOptions {
  @scala.inline
  def apply(gzip: js.UndefOr[scala.Boolean] = js.undefined, gzipOptions: nodeLib.zlibMod.ZlibOptions = null): TarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (gzipOptions != null) __obj.updateDynamic("gzipOptions")(gzipOptions)
    __obj.asInstanceOf[TarOptions]
  }
}

