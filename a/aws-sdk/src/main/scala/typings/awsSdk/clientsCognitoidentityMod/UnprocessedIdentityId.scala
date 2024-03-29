package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedIdentityId extends StObject {
  
  /**
    * The error code indicating the type of error that occurred.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.ErrorCode] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
}
object UnprocessedIdentityId {
  
  inline def apply(): UnprocessedIdentityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedIdentityId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedIdentityId] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
