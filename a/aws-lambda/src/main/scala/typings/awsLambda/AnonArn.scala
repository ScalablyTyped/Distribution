package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArn extends js.Object {
  var arn: String
  var name: String
  var ownerIdentity: AnonPrincipalId
}

object AnonArn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: AnonPrincipalId): AnonArn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArn]
  }
}

