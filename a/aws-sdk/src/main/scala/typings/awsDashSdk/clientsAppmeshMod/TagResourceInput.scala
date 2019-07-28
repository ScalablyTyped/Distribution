package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to add tags to.
    */
  var resourceArn: Arn
  /**
    * The tags to add to the resource. A tag is an array of key-value pairs.
    Tag keys can have a maximum character length of 128 characters, and tag values can have
    a maximum length of 256 characters.
    */
  var tags: TagList
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

