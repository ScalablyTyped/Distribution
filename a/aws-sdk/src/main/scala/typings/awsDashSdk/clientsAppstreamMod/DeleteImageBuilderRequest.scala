package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImageBuilderRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name
}

object DeleteImageBuilderRequest {
  @scala.inline
  def apply(Name: Name): DeleteImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteImageBuilderRequest]
  }
}

