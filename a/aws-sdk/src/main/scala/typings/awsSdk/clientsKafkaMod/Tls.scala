package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tls extends StObject {
  
  /**
    * 
    List of ACM Certificate Authority ARNs.
    
    */
  var CertificateAuthorityArnList: js.UndefOr[listOfString] = js.undefined
  
  /**
    * 
    Specifies whether you want to turn on or turn off TLS authentication.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object Tls {
  
  inline def apply(): Tls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tls] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthorityArnList(value: listOfString): Self = StObject.set(x, "CertificateAuthorityArnList", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnListUndefined: Self = StObject.set(x, "CertificateAuthorityArnList", js.undefined)
    
    inline def setCertificateAuthorityArnListVarargs(value: string*): Self = StObject.set(x, "CertificateAuthorityArnList", js.Array(value*))
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
