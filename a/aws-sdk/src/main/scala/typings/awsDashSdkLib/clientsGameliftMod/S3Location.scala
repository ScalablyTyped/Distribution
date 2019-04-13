package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * Amazon S3 bucket identifier. This is the name of your S3 bucket.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Name of the zip file containing your build files. 
    */
  var Key: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Amazon Resource Name (ARN) for the access role that allows Amazon GameLift to access your S3 bucket.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(Bucket: NonEmptyString = null, Key: NonEmptyString = null, RoleArn: NonEmptyString = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[S3Location]
  }
}

