package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEntitiesResponse extends js.Object {
  /**
    * An array of descriptions for each entity returned in the search result.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.undefined
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object SearchEntitiesResponse {
  @scala.inline
  def apply(descriptions: EntityDescriptions = null, nextToken: NextToken = null): SearchEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (descriptions != null) __obj.updateDynamic("descriptions")(descriptions)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[SearchEntitiesResponse]
  }
}

