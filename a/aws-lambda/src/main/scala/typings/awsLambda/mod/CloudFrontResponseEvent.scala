package typings.awsLambda.mod

import typings.awsLambda.AnonCf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[AnonCf]
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCf]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
}

