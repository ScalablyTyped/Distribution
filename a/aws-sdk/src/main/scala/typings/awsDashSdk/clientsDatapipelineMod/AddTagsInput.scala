package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  /**
    * The tags to add, as key/value pairs.
    */
  var tags: tagList
}

object AddTagsInput {
  @scala.inline
  def apply(pipelineId: id, tags: tagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId, tags = tags)
  
    __obj.asInstanceOf[AddTagsInput]
  }
}

