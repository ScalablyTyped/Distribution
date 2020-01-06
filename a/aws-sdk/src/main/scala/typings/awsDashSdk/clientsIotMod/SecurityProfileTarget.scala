package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileTarget extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileTargetArn = js.native
}

object SecurityProfileTarget {
  @scala.inline
  def apply(arn: SecurityProfileTargetArn): SecurityProfileTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityProfileTarget]
  }
}

