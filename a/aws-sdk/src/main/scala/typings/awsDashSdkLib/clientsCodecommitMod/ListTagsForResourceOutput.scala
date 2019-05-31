package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of tag key and value pairs associated with the specified resource.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, tags: TagsMap = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

