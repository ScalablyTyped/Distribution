package typings.awsLambda.cloudfrontResponseMod

import typings.awsLambda.AnonCfCloudFrontEventreadonlyre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[AnonCfCloudFrontEventreadonlyre]
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[AnonCfCloudFrontEventreadonlyre]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
}

