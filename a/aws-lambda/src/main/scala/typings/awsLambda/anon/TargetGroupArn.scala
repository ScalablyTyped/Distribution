package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupArn extends js.Object {
  var targetGroupArn: String
}

object TargetGroupArn {
  @scala.inline
  def apply(targetGroupArn: String): TargetGroupArn = {
    val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupArn]
  }
}

