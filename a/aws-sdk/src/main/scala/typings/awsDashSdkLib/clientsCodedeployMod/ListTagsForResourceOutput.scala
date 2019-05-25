package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list application revisions call to return the next set of application revisions in the list.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    *  A list of tags returned by ListTagsForResource. The tags are associated with the resource identified by the input ResourceArn parameter. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: TagList = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

