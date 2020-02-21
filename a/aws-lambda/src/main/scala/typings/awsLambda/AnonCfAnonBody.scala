package typings.awsLambda

import typings.awsLambda.cloudfrontMod.CloudFrontEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCfAnonBody extends js.Object {
  var cf: CloudFrontEvent with AnonBody
}

object AnonCfAnonBody {
  @scala.inline
  def apply(cf: CloudFrontEvent with AnonBody): AnonCfAnonBody = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCfAnonBody]
  }
}

