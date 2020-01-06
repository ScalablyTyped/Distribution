package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopImageBuilderRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
}

object StopImageBuilderRequest {
  @scala.inline
  def apply(Name: String): StopImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopImageBuilderRequest]
  }
}

