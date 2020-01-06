package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDescription extends js.Object {
  /**
    * Description of the pipeline.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
    */
  var fields: fieldList = js.native
  /**
    * The name of the pipeline.
    */
  var name: id = js.native
  /**
    * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var pipelineId: id = js.native
  /**
    * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var tags: js.UndefOr[tagList] = js.native
}

object PipelineDescription {
  @scala.inline
  def apply(fields: fieldList, name: id, pipelineId: id, description: String = null, tags: tagList = null): PipelineDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDescription]
  }
}

