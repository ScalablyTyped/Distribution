package typings.awsLambda

import typings.awsLambda.cloudfrontMod.CloudFrontEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCf extends js.Object {
  var cf: CloudFrontEvent with AnonRequest
}

object AnonCf {
  @scala.inline
  def apply(cf: CloudFrontEvent with AnonRequest): AnonCf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCf]
  }
}

