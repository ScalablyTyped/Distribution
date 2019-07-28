package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPipelinesRequest extends js.Object {
  /**
    * To list pipelines in chronological order by the date and time that they were created, enter true. To list pipelines in reverse chronological order, enter false.
    */
  var Ascending: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Ascending] = js.undefined
  /**
    * When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.undefined
}

object ListPipelinesRequest {
  @scala.inline
  def apply(Ascending: Ascending = null, PageToken: Id = null): ListPipelinesRequest = {
    val __obj = js.Dynamic.literal()
    if (Ascending != null) __obj.updateDynamic("Ascending")(Ascending)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[ListPipelinesRequest]
  }
}

