package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the imported certificate.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
}
object ImportCertificateResponse {
  
  @scala.inline
  def apply(): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCertificateResponse]
  }
  
  @scala.inline
  implicit class ImportCertificateResponseMutableBuilder[Self <: ImportCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
  }
}
