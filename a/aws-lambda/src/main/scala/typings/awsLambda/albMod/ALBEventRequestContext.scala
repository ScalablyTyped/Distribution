package typings.awsLambda.albMod

import typings.awsLambda.AnonTargetGroupArn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBEventRequestContext extends js.Object {
  var elb: AnonTargetGroupArn
}

object ALBEventRequestContext {
  @scala.inline
  def apply(elb: AnonTargetGroupArn): ALBEventRequestContext = {
    val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBEventRequestContext]
  }
}

