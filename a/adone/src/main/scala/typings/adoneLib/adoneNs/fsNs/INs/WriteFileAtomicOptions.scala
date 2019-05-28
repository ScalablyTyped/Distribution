package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileAtomicOptions extends js.Object {
  var chown: js.UndefOr[adoneLib.Anon_Gid] = js.undefined
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var fsync: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object WriteFileAtomicOptions {
  @scala.inline
  def apply(
    chown: adoneLib.Anon_Gid = null,
    encoding: java.lang.String = null,
    fsync: js.UndefOr[scala.Boolean] = js.undefined,
    mode: scala.Int | scala.Double = null
  ): WriteFileAtomicOptions = {
    val __obj = js.Dynamic.literal()
    if (chown != null) __obj.updateDynamic("chown")(chown)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileAtomicOptions]
  }
}

