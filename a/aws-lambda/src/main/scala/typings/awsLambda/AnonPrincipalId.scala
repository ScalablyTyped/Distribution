package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrincipalId extends js.Object {
  var principalId: String
}

object AnonPrincipalId {
  @scala.inline
  def apply(principalId: String): AnonPrincipalId = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrincipalId]
  }
}

