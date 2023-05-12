package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAwsLogSourceResponse extends StObject {
  
  /**
    * Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source failed. The failure occurred as these accounts are not part of an organization.
    */
  var failed: js.UndefOr[AccountList] = js.undefined
  
  /**
    * Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a Security Lake source.
    */
  var processing: js.UndefOr[AccountList] = js.undefined
}
object CreateAwsLogSourceResponse {
  
  inline def apply(): CreateAwsLogSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAwsLogSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAwsLogSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: AccountList): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setFailedVarargs(value: String*): Self = StObject.set(x, "failed", js.Array(value*))
    
    inline def setProcessing(value: AccountList): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setProcessingVarargs(value: String*): Self = StObject.set(x, "processing", js.Array(value*))
  }
}
