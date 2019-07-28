package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to add or update tags.
    */
  var resourceArn: ResourceArn
  /**
    * The key-value pair to use when tagging this repository.
    */
  var tags: TagsMap
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagsMap): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

