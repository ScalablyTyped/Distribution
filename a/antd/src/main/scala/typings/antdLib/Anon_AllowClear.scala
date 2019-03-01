package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClear extends js.Object {
  var allowClear: scala.Boolean
  var disabled: scala.Boolean
  var options: js.Array[scala.Nothing]
  var placeholder: java.lang.String
  var popupPlacement: java.lang.String
  var transitionName: java.lang.String
}

object Anon_AllowClear {
  @scala.inline
  def apply(
    allowClear: scala.Boolean,
    disabled: scala.Boolean,
    options: js.Array[scala.Nothing],
    placeholder: java.lang.String,
    popupPlacement: java.lang.String,
    transitionName: java.lang.String
  ): Anon_AllowClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowClear")(allowClear)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("popupPlacement")(popupPlacement)
    __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[Anon_AllowClear]
  }
}

