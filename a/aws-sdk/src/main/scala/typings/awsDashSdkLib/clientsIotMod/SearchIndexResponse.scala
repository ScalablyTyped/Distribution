package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIndexResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The thing groups that match the search query.
    */
  var thingGroups: js.UndefOr[ThingGroupDocumentList] = js.undefined
  /**
    * The things that match the search query.
    */
  var things: js.UndefOr[ThingDocumentList] = js.undefined
}

object SearchIndexResponse {
  @scala.inline
  def apply(
    nextToken: NextToken = null,
    thingGroups: ThingGroupDocumentList = null,
    things: ThingDocumentList = null
  ): SearchIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (thingGroups != null) __obj.updateDynamic("thingGroups")(thingGroups)
    if (things != null) __obj.updateDynamic("things")(things)
    __obj.asInstanceOf[SearchIndexResponse]
  }
}

