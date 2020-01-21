package typings.awsLambda.mod

import typings.awsLambda.AnonCfAnonRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[AnonCfAnonRequest]
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCfAnonRequest]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
}

