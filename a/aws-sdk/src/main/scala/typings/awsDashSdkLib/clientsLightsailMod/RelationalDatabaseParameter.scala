package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseParameter extends js.Object {
  /**
    * Specifies the valid range of values for the parameter.
    */
  var allowedValues: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
    */
  var applyMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the engine-specific parameter type.
    */
  var applyType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the valid data type for the parameter.
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provides a description of the parameter.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean value indicating whether the parameter can be modified.
    */
  var isModifiable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the name of the parameter.
    */
  var parameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the value of the parameter.
    */
  var parameterValue: js.UndefOr[java.lang.String] = js.undefined
}

object RelationalDatabaseParameter {
  @scala.inline
  def apply(
    allowedValues: java.lang.String = null,
    applyMethod: java.lang.String = null,
    applyType: java.lang.String = null,
    dataType: java.lang.String = null,
    description: java.lang.String = null,
    isModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    parameterName: java.lang.String = null,
    parameterValue: java.lang.String = null
  ): RelationalDatabaseParameter = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues)
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod)
    if (applyType != null) __obj.updateDynamic("applyType")(applyType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isModifiable)) __obj.updateDynamic("isModifiable")(isModifiable)
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    if (parameterValue != null) __obj.updateDynamic("parameterValue")(parameterValue)
    __obj.asInstanceOf[RelationalDatabaseParameter]
  }
}

