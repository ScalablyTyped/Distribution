package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Principal extends js.Object {
  var Principal: awsDashLambdaLib.awsDashLambdaMod.PrincipalValue
}

object Anon_Principal {
  @scala.inline
  def apply(Principal: awsDashLambdaLib.awsDashLambdaMod.PrincipalValue): Anon_Principal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Principal]
  }
}

