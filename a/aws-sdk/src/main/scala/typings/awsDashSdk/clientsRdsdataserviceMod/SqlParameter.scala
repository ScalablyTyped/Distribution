package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlParameter extends js.Object {
  /**
    * The name of the parameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[Field] = js.undefined
}

object SqlParameter {
  @scala.inline
  def apply(name: ParameterName = null, value: Field = null): SqlParameter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SqlParameter]
  }
}

