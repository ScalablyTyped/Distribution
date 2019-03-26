package typings
package agDashGridLib.distLibInterfacesIColumnVOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnVO extends js.Object {
  var aggFunc: java.lang.String
  var displayName: java.lang.String
  var field: java.lang.String
  var id: java.lang.String
}

object ColumnVO {
  @scala.inline
  def apply(
    aggFunc: java.lang.String,
    displayName: java.lang.String,
    field: java.lang.String,
    id: java.lang.String
  ): ColumnVO = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc, displayName = displayName, field = field, id = id)
  
    __obj.asInstanceOf[ColumnVO]
  }
}

