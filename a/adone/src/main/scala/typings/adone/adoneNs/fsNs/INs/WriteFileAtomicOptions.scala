package typings.adone.adoneNs.fsNs.INs

import typings.adone.Anon_Gid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileAtomicOptions extends js.Object {
  var chown: js.UndefOr[Anon_Gid] = js.undefined
  var encoding: js.UndefOr[String | Null] = js.undefined
  var fsync: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object WriteFileAtomicOptions {
  @scala.inline
  def apply(
    chown: Anon_Gid = null,
    encoding: String = null,
    fsync: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null
  ): WriteFileAtomicOptions = {
    val __obj = js.Dynamic.literal()
    if (chown != null) __obj.updateDynamic("chown")(chown)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileAtomicOptions]
  }
}

