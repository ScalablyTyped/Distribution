package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfileTarget extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileTargetArn
}

object SecurityProfileTarget {
  @scala.inline
  def apply(arn: SecurityProfileTargetArn): SecurityProfileTarget = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[SecurityProfileTarget]
  }
}

