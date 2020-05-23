package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalId extends js.Object {
  var principalId: String
}

object PrincipalId {
  @scala.inline
  def apply(principalId: String): PrincipalId = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalId]
  }
}

