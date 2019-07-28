package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSourceCredentialsInput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token.
    */
  var arn: NonEmptyString
}

object DeleteSourceCredentialsInput {
  @scala.inline
  def apply(arn: NonEmptyString): DeleteSourceCredentialsInput = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteSourceCredentialsInput]
  }
}

