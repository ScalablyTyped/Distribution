package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsValidationContextTrust extends StObject {
  
  /**
    * A reference to an object that represents a TLS validation context trust for an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[TlsValidationContextAcmTrust] = js.native
  
  /**
    * An object that represents a TLS validation context trust for a local file.
    */
  var file: js.UndefOr[TlsValidationContextFileTrust] = js.native
}
object TlsValidationContextTrust {
  
  @scala.inline
  def apply(): TlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsValidationContextTrust]
  }
  
  @scala.inline
  implicit class TlsValidationContextTrustMutableBuilder[Self <: TlsValidationContextTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: TlsValidationContextAcmTrust): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: TlsValidationContextFileTrust): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
