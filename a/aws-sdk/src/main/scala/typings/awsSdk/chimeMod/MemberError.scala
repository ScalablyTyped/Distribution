package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.chimeMod.ErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The member ID.
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.undefined
}
object MemberError {
  
  @scala.inline
  def apply(): MemberError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberError]
  }
  
  @scala.inline
  implicit class MemberErrorMutableBuilder[Self <: MemberError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
  }
}
