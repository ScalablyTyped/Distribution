package typings.awsLambda.cloudfrontRequestMod

import typings.awsLambda.AnonCf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[AnonCf]
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCf]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
}

