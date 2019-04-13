package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatePipelineDefinitionOutput extends js.Object {
  /**
    * Indicates whether there were validation errors.
    */
  var errored: scala.Boolean
  /**
    * Any validation errors that were found.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
  /**
    * Any validation warnings that were found.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
}

object ValidatePipelineDefinitionOutput {
  @scala.inline
  def apply(
    errored: scala.Boolean,
    validationErrors: ValidationErrors = null,
    validationWarnings: ValidationWarnings = null
  ): ValidatePipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored)
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors)
    if (validationWarnings != null) __obj.updateDynamic("validationWarnings")(validationWarnings)
    __obj.asInstanceOf[ValidatePipelineDefinitionOutput]
  }
}

