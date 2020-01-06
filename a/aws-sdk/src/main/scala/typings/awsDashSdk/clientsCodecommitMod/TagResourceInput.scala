package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to add or update tags.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The key-value pair to use when tagging this repository.
    */
  var tags: TagsMap = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagsMap): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

