package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPipelineDefinitionOutput extends js.Object {
  /**
    * Indicates whether there were validation errors, and the pipeline definition is stored but cannot be activated until you correct the pipeline and call PutPipelineDefinition to commit the corrected pipeline.
    */
  var errored: scala.Boolean
  /**
    * The validation errors that are associated with the objects defined in pipelineObjects.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
  /**
    * The validation warnings that are associated with the objects defined in pipelineObjects.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
}

object PutPipelineDefinitionOutput {
  @scala.inline
  def apply(
    errored: scala.Boolean,
    validationErrors: ValidationErrors = null,
    validationWarnings: ValidationWarnings = null
  ): PutPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored)
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors)
    if (validationWarnings != null) __obj.updateDynamic("validationWarnings")(validationWarnings)
    __obj.asInstanceOf[PutPipelineDefinitionOutput]
  }
}

