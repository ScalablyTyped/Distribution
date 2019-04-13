package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /**
    *  The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.  
    */
  var Access: js.UndefOr[AccessControls] = js.undefined
  /**
    * The AWS user or group that you want to have access to transcoded files and playlists. To identify the user or group, you can specify the canonical user ID for an AWS account, an origin access identity for a CloudFront distribution, the registered email address of an AWS account, or a predefined Amazon S3 group.
    */
  var Grantee: js.UndefOr[Grantee] = js.undefined
  /**
    * The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.  
    */
  var GranteeType: js.UndefOr[GranteeType] = js.undefined
}

object Permission {
  @scala.inline
  def apply(Access: AccessControls = null, Grantee: Grantee = null, GranteeType: GranteeType = null): Permission = {
    val __obj = js.Dynamic.literal()
    if (Access != null) __obj.updateDynamic("Access")(Access)
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee)
    if (GranteeType != null) __obj.updateDynamic("GranteeType")(GranteeType)
    __obj.asInstanceOf[Permission]
  }
}

