package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Merge extends js.Object {
  var merge: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var transformer: js.UndefOr[Anon_Obj] = js.undefined
}

object Anon_Merge {
  @scala.inline
  def apply(merge: js.UndefOr[Boolean] = js.undefined, path: String = null, transformer: Anon_Obj = null): Anon_Merge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (path != null) __obj.updateDynamic("path")(path)
    if (transformer != null) __obj.updateDynamic("transformer")(transformer)
    __obj.asInstanceOf[Anon_Merge]
  }
}

