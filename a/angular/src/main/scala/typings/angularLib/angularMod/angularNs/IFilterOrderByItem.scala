package typings
package angularLib.angularMod.angularNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IFilterOrderByItem]
  }
}

