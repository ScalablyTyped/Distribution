package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_CfAnonRequestCloudFrontRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[Anon_CfAnonRequestCloudFrontRequest]
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[Anon_CfAnonRequestCloudFrontRequest]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
}

