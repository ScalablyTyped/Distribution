package typings.agDashGrid.distLibInterfacesIColumnVOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnVO extends js.Object {
  var aggFunc: String
  var displayName: String
  var field: String
  var id: String
}

object ColumnVO {
  @scala.inline
  def apply(aggFunc: String, displayName: String, field: String, id: String): ColumnVO = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc, displayName = displayName, field = field, id = id)
  
    __obj.asInstanceOf[ColumnVO]
  }
}

