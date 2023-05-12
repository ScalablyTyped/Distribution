package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAwsLogSourceResponse extends StObject {
  
  /**
    * Deletion of the Amazon Web Services sources failed as the account is not a part of the organization.
    */
  var failed: js.UndefOr[AccountList] = js.undefined
  
  /**
    * Deletion of the Amazon Web Services sources is in progress.
    */
  var processing: js.UndefOr[AccountList] = js.undefined
}
object DeleteAwsLogSourceResponse {
  
  inline def apply(): DeleteAwsLogSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAwsLogSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAwsLogSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: AccountList): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setFailedVarargs(value: String*): Self = StObject.set(x, "failed", js.Array(value*))
    
    inline def setProcessing(value: AccountList): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setProcessingVarargs(value: String*): Self = StObject.set(x, "processing", js.Array(value*))
  }
}
