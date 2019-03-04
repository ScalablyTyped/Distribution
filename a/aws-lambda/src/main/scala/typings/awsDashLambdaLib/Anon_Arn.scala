package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arn extends js.Object {
  var arn: java.lang.String
  var name: java.lang.String
  var ownerIdentity: Anon_PrincipalId
}

object Anon_Arn {
  @scala.inline
  def apply(arn: java.lang.String, name: java.lang.String, ownerIdentity: Anon_PrincipalId): Anon_Arn = {
    val __obj = js.Dynamic.literal(arn = arn, name = name, ownerIdentity = ownerIdentity)
  
    __obj.asInstanceOf[Anon_Arn]
  }
}

