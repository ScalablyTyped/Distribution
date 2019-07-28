package typings.archiver.archiverMod

import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TarOptions extends js.Object {
  var gzip: js.UndefOr[Boolean] = js.undefined
  var gzipOptions: js.UndefOr[ZlibOptions] = js.undefined
}

object TarOptions {
  @scala.inline
  def apply(gzip: js.UndefOr[Boolean] = js.undefined, gzipOptions: ZlibOptions = null): TarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (gzipOptions != null) __obj.updateDynamic("gzipOptions")(gzipOptions)
    __obj.asInstanceOf[TarOptions]
  }
}

