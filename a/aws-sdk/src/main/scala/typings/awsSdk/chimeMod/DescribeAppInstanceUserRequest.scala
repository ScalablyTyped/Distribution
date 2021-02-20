package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the app instance user.
    */
  var AppInstanceUserArn: ChimeArn = js.native
}
object DescribeAppInstanceUserRequest {
  
  @scala.inline
  def apply(AppInstanceUserArn: ChimeArn): DescribeAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceUserRequestMutableBuilder[Self <: DescribeAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
  }
}
