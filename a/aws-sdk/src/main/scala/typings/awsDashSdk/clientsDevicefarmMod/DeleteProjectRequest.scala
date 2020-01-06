package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm project to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteProjectRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

