package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListTagsForResource
    request. When the results of a ListTagsForResource request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The tags for the resource.
    */
  var tags: TagList
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(tags: TagList, nextToken: String = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal(tags = tags)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

