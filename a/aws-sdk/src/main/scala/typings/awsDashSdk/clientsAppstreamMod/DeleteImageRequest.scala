package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImageRequest extends js.Object {
  /**
    * The name of the image.
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name
}

object DeleteImageRequest {
  @scala.inline
  def apply(Name: Name): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteImageRequest]
  }
}

