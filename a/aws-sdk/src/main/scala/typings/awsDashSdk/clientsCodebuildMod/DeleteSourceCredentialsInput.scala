package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSourceCredentialsInput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token.
    */
  var arn: NonEmptyString = js.native
}

object DeleteSourceCredentialsInput {
  @scala.inline
  def apply(arn: NonEmptyString): DeleteSourceCredentialsInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSourceCredentialsInput]
  }
}

