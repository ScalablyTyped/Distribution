package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the container.
    */
  var Resource: ContainerARN
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(Resource: ContainerARN): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(Resource = Resource)
  
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

