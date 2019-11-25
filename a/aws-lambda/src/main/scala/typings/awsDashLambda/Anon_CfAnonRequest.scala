package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CloudFrontEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CfAnonRequest extends js.Object {
  var cf: CloudFrontEvent with Anon_Request
}

object Anon_CfAnonRequest {
  @scala.inline
  def apply(cf: CloudFrontEvent with Anon_Request): Anon_CfAnonRequest = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CfAnonRequest]
  }
}

