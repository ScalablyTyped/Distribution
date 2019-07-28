package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  /**
    * The keys of the tags to remove.
    */
  var tagKeys: stringList
}

object RemoveTagsInput {
  @scala.inline
  def apply(pipelineId: id, tagKeys: stringList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId, tagKeys = tagKeys)
  
    __obj.asInstanceOf[RemoveTagsInput]
  }
}

