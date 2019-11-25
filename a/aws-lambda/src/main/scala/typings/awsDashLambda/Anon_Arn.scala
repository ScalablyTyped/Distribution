package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arn extends js.Object {
  var arn: String
  var name: String
  var ownerIdentity: Anon_PrincipalId
}

object Anon_Arn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: Anon_PrincipalId): Anon_Arn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arn]
  }
}

