package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCertificatesMessage extends StObject {
  
  /**
    * The new default certificate identifier to override the current one with. To determine the valid values, use the describe-certificates CLI command or the DescribeCertificates API operation.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether to remove the override for the default certificate. If the override is removed, the default certificate is the system default.
    */
  var RemoveCustomerOverride: js.UndefOr[BooleanOptional] = js.undefined
}
object ModifyCertificatesMessage {
  
  inline def apply(): ModifyCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesMessage]
  }
  
  extension [Self <: ModifyCertificatesMessage](x: Self) {
    
    inline def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    inline def setRemoveCustomerOverride(value: BooleanOptional): Self = StObject.set(x, "RemoveCustomerOverride", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomerOverrideUndefined: Self = StObject.set(x, "RemoveCustomerOverride", js.undefined)
  }
}
