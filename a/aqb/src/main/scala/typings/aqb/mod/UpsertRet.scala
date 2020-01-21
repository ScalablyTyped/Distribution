package typings.aqb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertRet extends js.Object {
  def insert(insertExpr: js.Any): UpsertRetInsertRet
}

object UpsertRet {
  @scala.inline
  def apply(insert: js.Any => UpsertRetInsertRet): UpsertRet = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[UpsertRet]
  }
}

