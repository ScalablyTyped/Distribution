package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOption extends js.Object {
  var group: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ISelectOption {
  @scala.inline
  def apply(name: java.lang.String, group: java.lang.String = null, value: java.lang.String = null): ISelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (group != null) __obj.updateDynamic("group")(group)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ISelectOption]
  }
}

