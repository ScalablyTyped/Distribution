package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var resourceArn: ResourceArn
  /**
    * The tags you want to modify or add to the resource.
    */
  var tags: TagList
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

