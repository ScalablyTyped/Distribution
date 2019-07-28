package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterNameValue extends js.Object {
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.undefined
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.undefined
}

object ParameterNameValue {
  @scala.inline
  def apply(ParameterName: String = null, ParameterValue: String = null): ParameterNameValue = {
    val __obj = js.Dynamic.literal()
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName)
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue)
    __obj.asInstanceOf[ParameterNameValue]
  }
}

