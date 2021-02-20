package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Status extends StObject {
  
  var code: js.UndefOr[Double] = js.native
  
  var errorType: js.UndefOr[String] = js.native
  
  var webhookTimedOut: js.UndefOr[Boolean] = js.native
}
object DialogflowV1Status {
  
  @scala.inline
  def apply(): DialogflowV1Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Status]
  }
  
  @scala.inline
  implicit class DialogflowV1StatusMutableBuilder[Self <: DialogflowV1Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    @scala.inline
    def setWebhookTimedOut(value: Boolean): Self = StObject.set(x, "webhookTimedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookTimedOutUndefined: Self = StObject.set(x, "webhookTimedOut", js.undefined)
  }
}
