package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketAclRequest extends js.Object {
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.undefined
  /**
    * 
    */
  var AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[GrantRead] = js.undefined
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
  /**
    * Allows grantee to create, overwrite, and delete any object in the bucket.
    */
  var GrantWrite: js.UndefOr[GrantWrite] = js.undefined
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
}

object PutBucketAclRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ACL: BucketCannedACL = null,
    AccessControlPolicy: AccessControlPolicy = null,
    ContentMD5: ContentMD5 = null,
    GrantFullControl: GrantFullControl = null,
    GrantRead: GrantRead = null,
    GrantReadACP: GrantReadACP = null,
    GrantWrite: GrantWrite = null,
    GrantWriteACP: GrantWriteACP = null
  ): PutBucketAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (AccessControlPolicy != null) __obj.updateDynamic("AccessControlPolicy")(AccessControlPolicy)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl)
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead)
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP)
    if (GrantWrite != null) __obj.updateDynamic("GrantWrite")(GrantWrite)
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP)
    __obj.asInstanceOf[PutBucketAclRequest]
  }
}

