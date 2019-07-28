package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * To help organize your resources, you can assign your own metadata to the resources you create. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsBackupMod.Tags] = js.undefined
}

object ListTagsOutput {
  @scala.inline
  def apply(NextToken: String = null, Tags: Tags = null): ListTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsOutput]
  }
}

