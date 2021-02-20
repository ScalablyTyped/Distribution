package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStackAssociationError extends StObject {
  
  /**
    * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.native
  
  /**
    * The error message for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Information about the user and associated stack.
    */
  var UserStackAssociation: js.UndefOr[typings.awsSdk.appstreamMod.UserStackAssociation] = js.native
}
object UserStackAssociationError {
  
  @scala.inline
  def apply(): UserStackAssociationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStackAssociationError]
  }
  
  @scala.inline
  implicit class UserStackAssociationErrorMutableBuilder[Self <: UserStackAssociationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: UserStackAssociationErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setUserStackAssociation(value: UserStackAssociation): Self = StObject.set(x, "UserStackAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStackAssociationUndefined: Self = StObject.set(x, "UserStackAssociation", js.undefined)
  }
}
