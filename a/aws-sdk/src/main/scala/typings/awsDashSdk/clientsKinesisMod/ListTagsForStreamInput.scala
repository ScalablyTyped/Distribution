package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForStreamInput extends js.Object {
  /**
    * The key to use as the starting point for the list of tags. If this parameter is set, ListTagsForStream gets all tags that occur after ExclusiveStartTagKey. 
    */
  var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined
  /**
    * The number of tags to return. If this number is less than the total number of tags associated with the stream, HasMoreTags is set to true. To list additional tags, set ExclusiveStartTagKey to the last key in the response.
    */
  var Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object ListTagsForStreamInput {
  @scala.inline
  def apply(
    StreamName: StreamName,
    ExclusiveStartTagKey: TagKey = null,
    Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined
  ): ListTagsForStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName)
    if (ExclusiveStartTagKey != null) __obj.updateDynamic("ExclusiveStartTagKey")(ExclusiveStartTagKey)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[ListTagsForStreamInput]
  }
}

