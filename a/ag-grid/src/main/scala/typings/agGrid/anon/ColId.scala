package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColId extends js.Object {
  var colId: String
  var sort: String
}

object ColId {
  @scala.inline
  def apply(colId: String, sort: String): ColId = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColId]
  }
}

