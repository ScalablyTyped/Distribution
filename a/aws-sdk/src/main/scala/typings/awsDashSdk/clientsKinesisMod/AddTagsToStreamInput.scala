package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToStreamInput extends js.Object {
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName = js.native
  /**
    * A set of up to 10 key-value pairs to use to create the tags.
    */
  var Tags: TagMap = js.native
}

object AddTagsToStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, Tags: TagMap): AddTagsToStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsToStreamInput]
  }
}

