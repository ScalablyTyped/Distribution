package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatePipelineDefinitionOutput extends js.Object {
  /**
    * Indicates whether there were validation errors.
    */
  var errored: Boolean = js.native
  /**
    * Any validation errors that were found.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
  /**
    * Any validation warnings that were found.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.native
}

object ValidatePipelineDefinitionOutput {
  @scala.inline
  def apply(
    errored: Boolean,
    validationErrors: ValidationErrors = null,
    validationWarnings: ValidationWarnings = null
  ): ValidatePipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationWarnings != null) __obj.updateDynamic("validationWarnings")(validationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePipelineDefinitionOutput]
  }
}

