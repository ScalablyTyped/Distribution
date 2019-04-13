package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsByStatusRequest extends js.Object {
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[Ascending] = js.undefined
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.undefined
  /**
    * To get information about all of the jobs associated with the current AWS account that have a given status, specify the following status: Submitted, Progressing, Complete, Canceled, or Error.
    */
  var Status: JobStatus
}

object ListJobsByStatusRequest {
  @scala.inline
  def apply(Status: JobStatus, Ascending: Ascending = null, PageToken: Id = null): ListJobsByStatusRequest = {
    val __obj = js.Dynamic.literal(Status = Status)
    if (Ascending != null) __obj.updateDynamic("Ascending")(Ascending)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[ListJobsByStatusRequest]
  }
}

