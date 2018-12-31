package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamValidation extends js.Object {
  /**
    * Validates that a string value matches one of the allowable enum values.
    */
  var enum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Validates that a value meets the max constraint.
    */
  var max: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Validates that a value meets the min constraint.
    * This is enabled by default when paramValidation is set to true.
    */
  var min: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Validates that a string value matches a regular expression.
    */
  var pattern: js.UndefOr[scala.Boolean] = js.undefined
}

