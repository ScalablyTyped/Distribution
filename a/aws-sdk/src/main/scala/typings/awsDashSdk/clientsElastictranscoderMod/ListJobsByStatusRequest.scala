package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsByStatusRequest extends js.Object {
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Ascending] = js.native
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
  /**
    * To get information about all of the jobs associated with the current AWS account that have a given status, specify the following status: Submitted, Progressing, Complete, Canceled, or Error.
    */
  var Status: JobStatus = js.native
}

object ListJobsByStatusRequest {
  @scala.inline
  def apply(Status: JobStatus, Ascending: Ascending = null, PageToken: Id = null): ListJobsByStatusRequest = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (Ascending != null) __obj.updateDynamic("Ascending")(Ascending.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByStatusRequest]
  }
}

