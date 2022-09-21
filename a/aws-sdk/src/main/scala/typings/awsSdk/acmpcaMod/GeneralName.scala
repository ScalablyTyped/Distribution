package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralName extends StObject {
  
  var DirectoryName: js.UndefOr[ASN1Subject] = js.undefined
  
  /**
    * Represents GeneralName as a DNS name.
    */
  var DnsName: js.UndefOr[String253] = js.undefined
  
  /**
    * Represents GeneralName as an EdiPartyName object.
    */
  var EdiPartyName: js.UndefOr[typings.awsSdk.acmpcaMod.EdiPartyName] = js.undefined
  
  /**
    * Represents GeneralName as an IPv4 or IPv6 address.
    */
  var IpAddress: js.UndefOr[String39] = js.undefined
  
  /**
    * Represents GeneralName using an OtherName object.
    */
  var OtherName: js.UndefOr[typings.awsSdk.acmpcaMod.OtherName] = js.undefined
  
  /**
    *  Represents GeneralName as an object identifier (OID).
    */
  var RegisteredId: js.UndefOr[CustomObjectIdentifier] = js.undefined
  
  /**
    * Represents GeneralName as an RFC 822 email address.
    */
  var Rfc822Name: js.UndefOr[String256] = js.undefined
  
  /**
    * Represents GeneralName as a URI.
    */
  var UniformResourceIdentifier: js.UndefOr[String253] = js.undefined
}
object GeneralName {
  
  inline def apply(): GeneralName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralName]
  }
  
  extension [Self <: GeneralName](x: Self) {
    
    inline def setDirectoryName(value: ASN1Subject): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNameUndefined: Self = StObject.set(x, "DirectoryName", js.undefined)
    
    inline def setDnsName(value: String253): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setEdiPartyName(value: EdiPartyName): Self = StObject.set(x, "EdiPartyName", value.asInstanceOf[js.Any])
    
    inline def setEdiPartyNameUndefined: Self = StObject.set(x, "EdiPartyName", js.undefined)
    
    inline def setIpAddress(value: String39): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setOtherName(value: OtherName): Self = StObject.set(x, "OtherName", value.asInstanceOf[js.Any])
    
    inline def setOtherNameUndefined: Self = StObject.set(x, "OtherName", js.undefined)
    
    inline def setRegisteredId(value: CustomObjectIdentifier): Self = StObject.set(x, "RegisteredId", value.asInstanceOf[js.Any])
    
    inline def setRegisteredIdUndefined: Self = StObject.set(x, "RegisteredId", js.undefined)
    
    inline def setRfc822Name(value: String256): Self = StObject.set(x, "Rfc822Name", value.asInstanceOf[js.Any])
    
    inline def setRfc822NameUndefined: Self = StObject.set(x, "Rfc822Name", js.undefined)
    
    inline def setUniformResourceIdentifier(value: String253): Self = StObject.set(x, "UniformResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUniformResourceIdentifierUndefined: Self = StObject.set(x, "UniformResourceIdentifier", js.undefined)
  }
}
