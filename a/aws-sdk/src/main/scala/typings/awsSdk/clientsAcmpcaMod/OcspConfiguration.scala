package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OcspConfiguration extends StObject {
  
  /**
    * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation status.
    */
  var Enabled: Boolean
  
  /**
    * By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object to define a CNAME specifying a customized OCSP domain.  The content of a Canonical Name (CNAME) record must conform to RFC2396 restrictions on the use of special characters in URIs. Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or "https://".  For more information, see Customizing Online Certificate Status Protocol (OCSP)  in the Amazon Web Services Private Certificate Authority User Guide.
    */
  var OcspCustomCname: js.UndefOr[CnameString] = js.undefined
}
object OcspConfiguration {
  
  inline def apply(Enabled: Boolean): OcspConfiguration = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcspConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OcspConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOcspCustomCname(value: CnameString): Self = StObject.set(x, "OcspCustomCname", value.asInstanceOf[js.Any])
    
    inline def setOcspCustomCnameUndefined: Self = StObject.set(x, "OcspCustomCname", js.undefined)
  }
}
