package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineDescription extends js.Object {
  /**
    * Description of the pipeline.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
    */
  var fields: fieldList
  /**
    * The name of the pipeline.
    */
  var name: id
  /**
    * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var pipelineId: id
  /**
    * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var tags: js.UndefOr[tagList] = js.undefined
}

object PipelineDescription {
  @scala.inline
  def apply(
    fields: fieldList,
    name: id,
    pipelineId: id,
    description: java.lang.String = null,
    tags: tagList = null
  ): PipelineDescription = {
    val __obj = js.Dynamic.literal(fields = fields, name = name, pipelineId = pipelineId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[PipelineDescription]
  }
}

