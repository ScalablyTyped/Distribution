package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterOrderByItem extends js.Object {
  var index: js.Any
  var `type`: String
  var value: js.Any
}

object IFilterOrderByItem {
  @scala.inline
  def apply(index: js.Any, `type`: String, value: js.Any): IFilterOrderByItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterOrderByItem]
  }
}

