package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsOutput extends js.Object {
  /**
    *  If response is truncated, Amazon SageMaker includes a token in the response. You can use this token in your subsequent request to fetch next set of tokens. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * An array of Tag objects, each with a tag key and a value.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: TagList = null): ListTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsOutput]
  }
}

