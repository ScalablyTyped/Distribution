package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALBEventRequestContext extends js.Object {
  var elb: awsDashLambdaLib.Anon_TargetGroupArn
}

object ALBEventRequestContext {
  @scala.inline
  def apply(elb: awsDashLambdaLib.Anon_TargetGroupArn): ALBEventRequestContext = {
    val __obj = js.Dynamic.literal(elb = elb)
  
    __obj.asInstanceOf[ALBEventRequestContext]
  }
}

