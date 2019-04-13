package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToStreamInput extends js.Object {
  /**
    * The name of the stream.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
  /**
    * A set of up to 10 key-value pairs to use to create the tags.
    */
  var Tags: TagMap
}

object AddTagsToStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, Tags: TagMap): AddTagsToStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsToStreamInput]
  }
}

