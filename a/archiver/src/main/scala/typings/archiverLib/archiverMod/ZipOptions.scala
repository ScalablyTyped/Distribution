package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipOptions extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var forceLocalTime: js.UndefOr[scala.Boolean] = js.undefined
  var forceZip64: js.UndefOr[scala.Boolean] = js.undefined
  var store: js.UndefOr[scala.Boolean] = js.undefined
  var zlib: js.UndefOr[nodeLib.zlibMod.ZlibOptions] = js.undefined
}

object ZipOptions {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    forceLocalTime: js.UndefOr[scala.Boolean] = js.undefined,
    forceZip64: js.UndefOr[scala.Boolean] = js.undefined,
    store: js.UndefOr[scala.Boolean] = js.undefined,
    zlib: nodeLib.zlibMod.ZlibOptions = null
  ): ZipOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(forceLocalTime)) __obj.updateDynamic("forceLocalTime")(forceLocalTime)
    if (!js.isUndefined(forceZip64)) __obj.updateDynamic("forceZip64")(forceZip64)
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store)
    if (zlib != null) __obj.updateDynamic("zlib")(zlib)
    __obj.asInstanceOf[ZipOptions]
  }
}

