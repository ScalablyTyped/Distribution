package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateChannelMembershipError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The AppInstanceUserArn of the member that the service couldn't add.
    */
  var MemberArn: js.UndefOr[ChimeArn] = js.undefined
}
object BatchCreateChannelMembershipError {
  
  inline def apply(): BatchCreateChannelMembershipError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateChannelMembershipError]
  }
  
  extension [Self <: BatchCreateChannelMembershipError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
    
    inline def setMemberArnUndefined: Self = StObject.set(x, "MemberArn", js.undefined)
  }
}
