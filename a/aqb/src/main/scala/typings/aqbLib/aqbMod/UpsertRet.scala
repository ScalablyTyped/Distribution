package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertRet extends js.Object {
  def insert(insertExpr: js.Any): UpsertRetInsertRet
}

object UpsertRet {
  @scala.inline
  def apply(insert: js.Function1[js.Any, UpsertRetInsertRet]): UpsertRet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(insert)
    __obj.asInstanceOf[UpsertRet]
  }
}

