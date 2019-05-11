package typings
package antdLib.esTreeDashSelectInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeDataSimpleMode extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var pId: js.UndefOr[java.lang.String] = js.undefined
  var rootPId: js.UndefOr[java.lang.String] = js.undefined
}

object TreeDataSimpleMode {
  @scala.inline
  def apply(id: java.lang.String = null, pId: java.lang.String = null, rootPId: java.lang.String = null): TreeDataSimpleMode = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (pId != null) __obj.updateDynamic("pId")(pId)
    if (rootPId != null) __obj.updateDynamic("rootPId")(rootPId)
    __obj.asInstanceOf[TreeDataSimpleMode]
  }
}

