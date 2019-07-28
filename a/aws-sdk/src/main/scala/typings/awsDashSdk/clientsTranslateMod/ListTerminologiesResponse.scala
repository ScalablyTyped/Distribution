package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTerminologiesResponse extends js.Object {
  /**
    *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.NextToken] = js.undefined
  /**
    * The properties list of the custom terminologies returned on the list request.
    */
  var TerminologyPropertiesList: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.TerminologyPropertiesList] = js.undefined
}

object ListTerminologiesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TerminologyPropertiesList: TerminologyPropertiesList = null): ListTerminologiesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TerminologyPropertiesList != null) __obj.updateDynamic("TerminologyPropertiesList")(TerminologyPropertiesList)
    __obj.asInstanceOf[ListTerminologiesResponse]
  }
}

