package typings.awsLambda.cloudfrontRequestMod

import typings.awsLambda.anon.Cf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[Cf]
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[Cf]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
}

