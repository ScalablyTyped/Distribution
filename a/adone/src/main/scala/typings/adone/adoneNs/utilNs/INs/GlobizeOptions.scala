package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobizeOptions extends js.Object {
  var exts: js.UndefOr[String] = js.undefined
  var recursively: js.UndefOr[Boolean] = js.undefined
}

object GlobizeOptions {
  @scala.inline
  def apply(exts: String = null, recursively: js.UndefOr[Boolean] = js.undefined): GlobizeOptions = {
    val __obj = js.Dynamic.literal()
    if (exts != null) __obj.updateDynamic("exts")(exts)
    if (!js.isUndefined(recursively)) __obj.updateDynamic("recursively")(recursively)
    __obj.asInstanceOf[GlobizeOptions]
  }
}

