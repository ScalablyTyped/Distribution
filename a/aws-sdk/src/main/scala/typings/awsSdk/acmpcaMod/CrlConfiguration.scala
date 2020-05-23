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
  def apply(
    Enabled: Boolean,
    CustomCname: String253 = null,
    ExpirationInDays: js.UndefOr[Integer1To5000] = js.undefined,
    S3BucketName: String3To255 = null
  ): CrlConfiguration = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (CustomCname != null) __obj.updateDynamic("CustomCname")(CustomCname.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpirationInDays)) __obj.updateDynamic("ExpirationInDays")(ExpirationInDays.get.asInstanceOf[js.Any])
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrlConfiguration]
  }
}

