package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the failed resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * The reason for the failure.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object Failure {
  @scala.inline
  def apply(arn: String = null, reason: String = null): Failure = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Failure]
  }
}

