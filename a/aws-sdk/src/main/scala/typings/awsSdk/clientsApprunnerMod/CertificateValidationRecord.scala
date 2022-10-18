package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateValidationRecord extends StObject {
  
  /**
    * The certificate CNAME record name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the certificate CNAME record validation. It should change to SUCCESS after App Runner completes validation with your DNS.
    */
  var Status: js.UndefOr[CertificateValidationRecordStatus] = js.undefined
  
  /**
    * The record type, always CNAME.
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * The certificate CNAME record value.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object CertificateValidationRecord {
  
  inline def apply(): CertificateValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateValidationRecord]
  }
  
  extension [Self <: CertificateValidationRecord](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: CertificateValidationRecordStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
