package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCrlRequest extends StObject {
  
  /**
    * The x509 v3 specified certificate revocation list
    */
  var crlData: ImportCrlRequestCrlDataBlob
  
  /**
    * Specifies whether the certificate revocation list (CRL) is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the certificate revocation list (CRL).
    */
  var name: ResourceName
  
  /**
    * A list of tags to attach to the certificate revocation list (CRL).
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
    */
  var trustAnchorArn: TrustAnchorArn
}
object ImportCrlRequest {
  
  inline def apply(crlData: ImportCrlRequestCrlDataBlob, name: ResourceName, trustAnchorArn: TrustAnchorArn): ImportCrlRequest = {
    val __obj = js.Dynamic.literal(crlData = crlData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trustAnchorArn = trustAnchorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCrlRequest]
  }
  
  extension [Self <: ImportCrlRequest](x: Self) {
    
    inline def setCrlData(value: ImportCrlRequestCrlDataBlob): Self = StObject.set(x, "crlData", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTrustAnchorArn(value: TrustAnchorArn): Self = StObject.set(x, "trustAnchorArn", value.asInstanceOf[js.Any])
  }
}
