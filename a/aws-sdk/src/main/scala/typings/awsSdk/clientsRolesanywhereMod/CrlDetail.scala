package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrlDetail extends StObject {
  
  /**
    * The ISO-8601 timestamp when the certificate revocation list (CRL) was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the certificate revocation list (CRL).
    */
  var crlArn: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the certificate revocation list (CRL) after a read or write operation.
    */
  var crlData: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The unique identifier of the certificate revocation list (CRL).
    */
  var crlId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * Indicates whether the certificate revocation list (CRL) is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the certificate revocation list (CRL).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for. 
    */
  var trustAnchorArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ISO-8601 timestamp when the certificate revocation list (CRL) was last updated. 
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object CrlDetail {
  
  inline def apply(): CrlDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrlDetail]
  }
  
  extension [Self <: CrlDetail](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCrlArn(value: String): Self = StObject.set(x, "crlArn", value.asInstanceOf[js.Any])
    
    inline def setCrlArnUndefined: Self = StObject.set(x, "crlArn", js.undefined)
    
    inline def setCrlData(value: _Blob): Self = StObject.set(x, "crlData", value.asInstanceOf[js.Any])
    
    inline def setCrlDataUndefined: Self = StObject.set(x, "crlData", js.undefined)
    
    inline def setCrlId(value: Uuid): Self = StObject.set(x, "crlId", value.asInstanceOf[js.Any])
    
    inline def setCrlIdUndefined: Self = StObject.set(x, "crlId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTrustAnchorArn(value: String): Self = StObject.set(x, "trustAnchorArn", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorArnUndefined: Self = StObject.set(x, "trustAnchorArn", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
