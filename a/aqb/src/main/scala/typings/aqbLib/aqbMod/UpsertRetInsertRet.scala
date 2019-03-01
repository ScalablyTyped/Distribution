package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertRetInsertRet extends js.Object {
  var replace: js.Function1[/* updateOrReplaceExpr */ js.Any, UpsertRetInsertRetUpdateRet]
  def update(updateOrReplaceExpr: js.Any): UpsertRetInsertRetUpdateRet
}

object UpsertRetInsertRet {
  @scala.inline
  def apply(
    replace: js.Function1[/* updateOrReplaceExpr */ js.Any, UpsertRetInsertRetUpdateRet],
    update: js.Function1[js.Any, UpsertRetInsertRetUpdateRet]
  ): UpsertRetInsertRet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replace")(replace)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[UpsertRetInsertRet]
  }
}

