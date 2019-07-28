package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSourceCredentialsOutput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
}

object DeleteSourceCredentialsOutput {
  @scala.inline
  def apply(arn: NonEmptyString = null): DeleteSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    __obj.asInstanceOf[DeleteSourceCredentialsOutput]
  }
}

