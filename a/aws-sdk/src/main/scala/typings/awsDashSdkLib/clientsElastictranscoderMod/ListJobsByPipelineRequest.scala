package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsByPipelineRequest extends js.Object {
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[Ascending] = js.undefined
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.undefined
  /**
    * The ID of the pipeline for which you want to get job information.
    */
  var PipelineId: Id
}

object ListJobsByPipelineRequest {
  @scala.inline
  def apply(PipelineId: Id, Ascending: Ascending = null, PageToken: Id = null): ListJobsByPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId)
    if (Ascending != null) __obj.updateDynamic("Ascending")(Ascending)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[ListJobsByPipelineRequest]
  }
}

