package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterOrderByItem extends js.Object {
  var index: js.Any
  var `type`: java.lang.String
  var value: js.Any
}

object IFilterOrderByItem {
  @scala.inline
  def apply(index: js.Any, `type`: java.lang.String, value: js.Any): IFilterOrderByItem = {
    val __obj = js.Dynamic.literal(index = index, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFilterOrderByItem]
  }
}

