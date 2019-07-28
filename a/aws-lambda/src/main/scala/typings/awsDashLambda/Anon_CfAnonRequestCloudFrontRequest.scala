package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CloudFrontEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CfAnonRequestCloudFrontRequest extends js.Object {
  var cf: CloudFrontEvent with Anon_RequestCloudFrontRequest
}

object Anon_CfAnonRequestCloudFrontRequest {
  @scala.inline
  def apply(cf: CloudFrontEvent with Anon_RequestCloudFrontRequest): Anon_CfAnonRequestCloudFrontRequest = {
    val __obj = js.Dynamic.literal(cf = cf)
  
    __obj.asInstanceOf[Anon_CfAnonRequestCloudFrontRequest]
  }
}

