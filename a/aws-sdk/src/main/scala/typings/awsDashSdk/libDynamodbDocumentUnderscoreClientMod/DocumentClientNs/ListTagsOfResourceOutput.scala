package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsOfResourceOutput extends js.Object {
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsOfResourceOutput {
  @scala.inline
  def apply(NextToken: NextTokenString = null, Tags: TagList = null): ListTagsOfResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsOfResourceOutput]
  }
}

