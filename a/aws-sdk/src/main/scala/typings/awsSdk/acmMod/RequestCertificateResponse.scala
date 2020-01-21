package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCertificateResponse extends js.Object {
  /**
    * String that contains the ARN of the issued certificate. This must be of the form:  arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
}

object RequestCertificateResponse {
  @scala.inline
  def apply(CertificateArn: Arn = null): RequestCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCertificateResponse]
  }
}

