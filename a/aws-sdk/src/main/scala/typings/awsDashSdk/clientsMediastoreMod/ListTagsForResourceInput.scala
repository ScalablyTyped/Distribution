package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the container.
    */
  var Resource: ContainerARN = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(Resource: ContainerARN): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

