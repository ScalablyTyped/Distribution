package typings.awsLambda.cloudfrontResponseMod

import typings.awsLambda.AnonCfAnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[AnonCfAnonBody]
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCfAnonBody]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
}

