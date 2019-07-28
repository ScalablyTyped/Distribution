package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicAccessBlockConfiguration extends js.Object {
  /**
    * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.   PUT Object calls fail if the request includes a public ACL.   Enabling this setting doesn't affect existing policies or ACLs.
    */
  var BlockPublicAcls: js.UndefOr[Setting] = js.undefined
  /**
    * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Enabling this setting doesn't affect existing bucket policies.
    */
  var BlockPublicPolicy: js.UndefOr[Setting] = js.undefined
  /**
    * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
    */
  var IgnorePublicAcls: js.UndefOr[Setting] = js.undefined
  /**
    * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy. Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
    */
  var RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
}

object PublicAccessBlockConfiguration {
  @scala.inline
  def apply(
    BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
    BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
    IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
    RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
  ): PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockPublicAcls)) __obj.updateDynamic("BlockPublicAcls")(BlockPublicAcls)
    if (!js.isUndefined(BlockPublicPolicy)) __obj.updateDynamic("BlockPublicPolicy")(BlockPublicPolicy)
    if (!js.isUndefined(IgnorePublicAcls)) __obj.updateDynamic("IgnorePublicAcls")(IgnorePublicAcls)
    if (!js.isUndefined(RestrictPublicBuckets)) __obj.updateDynamic("RestrictPublicBuckets")(RestrictPublicBuckets)
    __obj.asInstanceOf[PublicAccessBlockConfiguration]
  }
}

