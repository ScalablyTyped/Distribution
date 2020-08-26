package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrlConfiguration extends js.Object {
  /**
    * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public.
    */
  var CustomCname: js.UndefOr[String253] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. You can use this value to enable certificate revocation for a new CA when you call the CreateCertificateAuthority action or for an existing CA when you call the UpdateCertificateAuthority action. 
    */
  var Enabled: Boolean = js.native
  /**
    * Number of days until a certificate expires.
    */
  var ExpirationInDays: js.UndefOr[Integer1To5000] = js.native
  /**
    * Name of the S3 bucket that contains the CRL. If you do not provide a value for the CustomCname argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You can change the name of your bucket by calling the UpdateCertificateAuthority action. You must specify a bucket policy that allows ACM Private CA to write the CRL to your bucket.
    */
  var S3BucketName: js.UndefOr[String3To255] = js.native
}

object CrlConfiguration {
  @scala.inline
  def apply(Enabled: Boolean): CrlConfiguration = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrlConfiguration]
  }
  @scala.inline
  implicit class CrlConfigurationOps[Self <: CrlConfiguration] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomCname(value: String253): Self = this.set("CustomCname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCname: Self = this.set("CustomCname", js.undefined)
    @scala.inline
    def setExpirationInDays(value: Integer1To5000): Self = this.set("ExpirationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationInDays: Self = this.set("ExpirationInDays", js.undefined)
    @scala.inline
    def setS3BucketName(value: String3To255): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
  }
  
}

