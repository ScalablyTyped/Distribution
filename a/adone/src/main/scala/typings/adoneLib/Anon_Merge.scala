package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Merge extends js.Object {
  var merge: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var transformer: js.UndefOr[Anon_Obj] = js.undefined
}

object Anon_Merge {
  @scala.inline
  def apply(
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    transformer: Anon_Obj = null
  ): Anon_Merge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (path != null) __obj.updateDynamic("path")(path)
    if (transformer != null) __obj.updateDynamic("transformer")(transformer)
    __obj.asInstanceOf[Anon_Merge]
  }
}

