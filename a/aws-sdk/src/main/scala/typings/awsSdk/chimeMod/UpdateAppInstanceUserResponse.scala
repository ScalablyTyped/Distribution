package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppInstanceUserResponse extends StObject {
  
  /**
    * The ARN of the app instance user.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.native
}
object UpdateAppInstanceUserResponse {
  
  @scala.inline
  def apply(): UpdateAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit class UpdateAppInstanceUserResponseMutableBuilder[Self <: UpdateAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
  }
}
