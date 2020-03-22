package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCf extends js.Object {
  var cf: CloudFrontEventrequestClo
}

object AnonCf {
  @scala.inline
  def apply(cf: CloudFrontEventrequestClo): AnonCf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCf]
  }
}

