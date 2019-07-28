package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProjectRequest extends js.Object {
  /**
    * The project's ARN.
    */
  var arn: AmazonResourceName
}

object GetProjectRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetProjectRequest]
  }
}

