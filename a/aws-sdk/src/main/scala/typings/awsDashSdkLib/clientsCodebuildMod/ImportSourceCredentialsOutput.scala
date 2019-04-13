package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSourceCredentialsOutput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
}

object ImportSourceCredentialsOutput {
  @scala.inline
  def apply(arn: NonEmptyString = null): ImportSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    __obj.asInstanceOf[ImportSourceCredentialsOutput]
  }
}

