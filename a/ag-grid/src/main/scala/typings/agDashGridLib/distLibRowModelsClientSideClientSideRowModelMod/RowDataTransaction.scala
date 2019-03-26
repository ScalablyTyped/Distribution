package typings
package agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDataTransaction extends js.Object {
  var add: js.UndefOr[js.Array[_]] = js.undefined
  var addIndex: js.UndefOr[scala.Double] = js.undefined
  var remove: js.UndefOr[js.Array[_]] = js.undefined
  var update: js.UndefOr[js.Array[_]] = js.undefined
}

object RowDataTransaction {
  @scala.inline
  def apply(
    add: js.Array[_] = null,
    addIndex: scala.Int | scala.Double = null,
    remove: js.Array[_] = null,
    update: js.Array[_] = null
  ): RowDataTransaction = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addIndex != null) __obj.updateDynamic("addIndex")(addIndex.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[RowDataTransaction]
  }
}

