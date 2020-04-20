package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageBuilderRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
}

object DeleteImageBuilderRequest {
  @scala.inline
  def apply(Name: Name): DeleteImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageBuilderRequest]
  }
}

