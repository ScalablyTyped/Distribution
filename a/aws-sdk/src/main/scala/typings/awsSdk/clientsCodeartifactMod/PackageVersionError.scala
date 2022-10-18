package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionError extends StObject {
  
  /**
    *  The error code associated with the error. Valid error codes are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var errorCode: js.UndefOr[PackageVersionErrorCode] = js.undefined
  
  /**
    *  The error message associated with the error. 
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object PackageVersionError {
  
  inline def apply(): PackageVersionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionError]
  }
  
  extension [Self <: PackageVersionError](x: Self) {
    
    inline def setErrorCode(value: PackageVersionErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
