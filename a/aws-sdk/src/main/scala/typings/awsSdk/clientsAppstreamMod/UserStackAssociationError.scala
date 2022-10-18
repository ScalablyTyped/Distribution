package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserStackAssociationError extends StObject {
  
  /**
    * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.undefined
  
  /**
    * The error message for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the user and associated stack.
    */
  var UserStackAssociation: js.UndefOr[typings.awsSdk.clientsAppstreamMod.UserStackAssociation] = js.undefined
}
object UserStackAssociationError {
  
  inline def apply(): UserStackAssociationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStackAssociationError]
  }
  
  extension [Self <: UserStackAssociationError](x: Self) {
    
    inline def setErrorCode(value: UserStackAssociationErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setUserStackAssociation(value: UserStackAssociation): Self = StObject.set(x, "UserStackAssociation", value.asInstanceOf[js.Any])
    
    inline def setUserStackAssociationUndefined: Self = StObject.set(x, "UserStackAssociation", js.undefined)
  }
}
