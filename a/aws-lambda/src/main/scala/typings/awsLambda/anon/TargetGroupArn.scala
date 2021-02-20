package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupArn extends StObject {
  
  var targetGroupArn: String = js.native
}
object TargetGroupArn {
  
  @scala.inline
  def apply(targetGroupArn: String): TargetGroupArn = {
    val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupArn]
  }
  
  @scala.inline
  implicit class TargetGroupArnMutableBuilder[Self <: TargetGroupArn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroupArn(value: String): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
  }
}
