package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  /**
    * The Autonomous System Number (ASN) of the internet provider of the remote IP address.
    */
  var Asn: js.UndefOr[String] = js.undefined
  
  /**
    * The organization that registered this ASN.
    */
  var AsnOrg: js.UndefOr[String] = js.undefined
  
  /**
    * The ISP information for the internet provider.
    */
  var Isp: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the internet provider.
    */
  var Org: js.UndefOr[String] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    inline def setAsn(value: String): Self = StObject.set(x, "Asn", value.asInstanceOf[js.Any])
    
    inline def setAsnOrg(value: String): Self = StObject.set(x, "AsnOrg", value.asInstanceOf[js.Any])
    
    inline def setAsnOrgUndefined: Self = StObject.set(x, "AsnOrg", js.undefined)
    
    inline def setAsnUndefined: Self = StObject.set(x, "Asn", js.undefined)
    
    inline def setIsp(value: String): Self = StObject.set(x, "Isp", value.asInstanceOf[js.Any])
    
    inline def setIspUndefined: Self = StObject.set(x, "Isp", js.undefined)
    
    inline def setOrg(value: String): Self = StObject.set(x, "Org", value.asInstanceOf[js.Any])
    
    inline def setOrgUndefined: Self = StObject.set(x, "Org", js.undefined)
  }
}
