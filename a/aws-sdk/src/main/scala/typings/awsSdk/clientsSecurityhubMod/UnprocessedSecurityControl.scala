package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedSecurityControl extends StObject {
  
  /**
    *  The error code for the unprocessed security control. 
    */
  var ErrorCode: UnprocessedErrorCode
  
  /**
    *  The reason why the security control was unprocessed. 
    */
  var ErrorReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) for which a response couldn't be returned. 
    */
  var SecurityControlId: NonEmptyString
}
object UnprocessedSecurityControl {
  
  inline def apply(ErrorCode: UnprocessedErrorCode, SecurityControlId: NonEmptyString): UnprocessedSecurityControl = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], SecurityControlId = SecurityControlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedSecurityControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedSecurityControl] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: UnprocessedErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorReason(value: NonEmptyString): Self = StObject.set(x, "ErrorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "ErrorReason", js.undefined)
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
  }
}
