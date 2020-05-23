package typings.awsLambda.albMod

import typings.awsLambda.anon.TargetGroupArn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBEventRequestContext extends js.Object {
  var elb: TargetGroupArn
}

object ALBEventRequestContext {
  @scala.inline
  def apply(elb: TargetGroupArn): ALBEventRequestContext = {
    val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBEventRequestContext]
  }
}

