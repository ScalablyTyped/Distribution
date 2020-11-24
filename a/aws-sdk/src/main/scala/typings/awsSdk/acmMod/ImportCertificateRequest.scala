package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportCertificateRequest extends js.Object {
  
  /**
    * The certificate to import.
    */
  var Certificate: CertificateBodyBlob = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an imported certificate to replace. To import a new certificate, omit this field. 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  
  /**
    * The PEM encoded certificate chain.
    */
  var CertificateChain: js.UndefOr[CertificateChainBlob] = js.native
  
  /**
    * The private key that matches the public key in the certificate.
    */
  var PrivateKey: PrivateKeyBlob = js.native
  
  /**
    * One or more resource tags to associate with the imported certificate.  Note: You cannot apply tags when reimporting a certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ImportCertificateRequest {
  
  @scala.inline
  def apply(Certificate: CertificateBodyBlob, PrivateKey: PrivateKeyBlob): ImportCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateRequest]
  }
  
  @scala.inline
  implicit class ImportCertificateRequestOps[Self <: ImportCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificate(value: CertificateBodyBlob): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: PrivateKeyBlob): Self = this.set("PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateChain(value: CertificateChainBlob): Self = this.set("CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateChain: Self = this.set("CertificateChain", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
