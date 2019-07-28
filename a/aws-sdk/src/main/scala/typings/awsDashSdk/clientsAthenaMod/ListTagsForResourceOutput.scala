package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The list of tags associated with this workgroup.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(NextToken: Token = null, Tags: TagList = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

