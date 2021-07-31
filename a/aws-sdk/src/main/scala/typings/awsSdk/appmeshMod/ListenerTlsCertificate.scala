package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsCertificate extends StObject {
  
  /**
    * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[ListenerTlsAcmCertificate] = js.undefined
  
  /**
    * A reference to an object that represents a local file certificate.
    */
  var file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined
}
object ListenerTlsCertificate {
  
  @scala.inline
  def apply(): ListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTlsCertificate]
  }
  
  @scala.inline
  implicit class ListenerTlsCertificateMutableBuilder[Self <: ListenerTlsCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: ListenerTlsAcmCertificate): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: ListenerTlsFileCertificate): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
