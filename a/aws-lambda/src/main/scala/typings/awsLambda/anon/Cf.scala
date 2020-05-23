package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cf extends js.Object {
  var cf: CloudFrontEventrequestClo
}

object Cf {
  @scala.inline
  def apply(cf: CloudFrontEventrequestClo): Cf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cf]
  }
}

