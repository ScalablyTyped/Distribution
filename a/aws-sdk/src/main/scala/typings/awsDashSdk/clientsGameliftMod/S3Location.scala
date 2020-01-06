package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * An Amazon S3 bucket identifier. This is the name of the S3 bucket.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the zip file that contains the build files or script files. 
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file. If not set, the latest version of the file is retrieved. 
    */
  var ObjectVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access the S3 bucket.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
}

object S3Location {
  @scala.inline
  def apply(
    Bucket: NonEmptyString = null,
    Key: NonEmptyString = null,
    ObjectVersion: NonEmptyString = null,
    RoleArn: NonEmptyString = null
  ): S3Location = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (ObjectVersion != null) __obj.updateDynamic("ObjectVersion")(ObjectVersion.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

