package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColId extends js.Object {
  var colId: String
  var sort: String
}

object AnonColId {
  @scala.inline
  def apply(colId: String, sort: String): AnonColId = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColId]
  }
}

