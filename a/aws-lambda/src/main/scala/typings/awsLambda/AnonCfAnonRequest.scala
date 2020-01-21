package typings.awsLambda

import typings.awsLambda.mod.CloudFrontEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCfAnonRequest extends js.Object {
  var cf: CloudFrontEvent with AnonRequest
}

object AnonCfAnonRequest {
  @scala.inline
  def apply(cf: CloudFrontEvent with AnonRequest): AnonCfAnonRequest = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCfAnonRequest]
  }
}

