package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSSECStatus extends StObject {
  
  /**
    * A string that represents the current hosted zone signing status. Status can have one of the following values:  SIGNING  DNSSEC signing is enabled for the hosted zone.  NOT_SIGNING  DNSSEC signing is not enabled for the hosted zone.  DELETING  DNSSEC signing is in the process of being removed for the hosted zone.  ACTION_NEEDED  There is a problem with signing in the hosted zone that requires you to take action to resolve. For example, the customer managed key might have been deleted, or the permissions for the customer managed key might have been changed.  INTERNAL_FAILURE  There was an error during a request. Before you can continue to work with DNSSEC signing, including with key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the hosted zone.  
    */
  var ServeSignature: js.UndefOr[typings.awsSdk.clientsRoute53Mod.ServeSignature] = js.undefined
  
  /**
    * The status message provided for the following DNSSEC signing status: INTERNAL_FAILURE. The status message includes information about what the problem might be and steps that you can take to correct the issue.
    */
  var StatusMessage: js.UndefOr[SigningKeyStatusMessage] = js.undefined
}
object DNSSECStatus {
  
  inline def apply(): DNSSECStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSSECStatus]
  }
  
  extension [Self <: DNSSECStatus](x: Self) {
    
    inline def setServeSignature(value: ServeSignature): Self = StObject.set(x, "ServeSignature", value.asInstanceOf[js.Any])
    
    inline def setServeSignatureUndefined: Self = StObject.set(x, "ServeSignature", js.undefined)
    
    inline def setStatusMessage(value: SigningKeyStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
