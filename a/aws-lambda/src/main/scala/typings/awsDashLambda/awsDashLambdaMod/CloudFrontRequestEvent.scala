package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_CfAnonRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[Anon_CfAnonRequest]
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[Anon_CfAnonRequest]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
}

