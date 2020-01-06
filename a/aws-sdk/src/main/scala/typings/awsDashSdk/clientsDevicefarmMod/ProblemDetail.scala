package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProblemDetail extends js.Object {
  /**
    * The problem detail's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The problem detail's name.
    */
  var name: js.UndefOr[Name] = js.native
}

object ProblemDetail {
  @scala.inline
  def apply(arn: AmazonResourceName = null, name: Name = null): ProblemDetail = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProblemDetail]
  }
}

