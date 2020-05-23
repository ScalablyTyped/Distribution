package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arn extends js.Object {
  var arn: String
  var name: String
  var ownerIdentity: PrincipalId
}

object Arn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: PrincipalId): Arn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arn]
  }
}

