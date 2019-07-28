package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm project you wish to delete.
    */
  var arn: AmazonResourceName
}

object DeleteProjectRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

