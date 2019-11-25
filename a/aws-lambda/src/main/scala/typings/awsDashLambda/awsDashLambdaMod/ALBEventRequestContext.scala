package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_TargetGroupArn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBEventRequestContext extends js.Object {
  var elb: Anon_TargetGroupArn
}

object ALBEventRequestContext {
  @scala.inline
  def apply(elb: Anon_TargetGroupArn): ALBEventRequestContext = {
    val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ALBEventRequestContext]
  }
}

