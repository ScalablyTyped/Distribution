package typings.awsLambda.cloudfrontResponseMod

import typings.awsLambda.anon.CfCloudFrontEventreadonlyre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[CfCloudFrontEventreadonlyre]
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[CfCloudFrontEventreadonlyre]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
}

