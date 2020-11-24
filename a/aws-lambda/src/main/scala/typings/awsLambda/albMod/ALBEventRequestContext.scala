package typings.awsLambda.albMod

import typings.awsLambda.anon.TargetGroupArn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALBEventRequestContext extends js.Object {
  
  var elb: TargetGroupArn = js.native
}
object ALBEventRequestContext {
  
  @scala.inline
  def apply(elb: TargetGroupArn): ALBEventRequestContext = {
    val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBEventRequestContext]
  }
  
  @scala.inline
  implicit class ALBEventRequestContextOps[Self <: ALBEventRequestContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElb(value: TargetGroupArn): Self = this.set("elb", value.asInstanceOf[js.Any])
  }
}
